fun update(){
    print("What to update?\n>>>")
    val input: String = readLine()?.trim() ?: readLine().toString()
    val results = search(input)
    if (results.size != 1){
        println("Given parameter not accurate or no such entry!")
    }
    else {
        val toModify: Entry = results[0]
        while (true) {
            print("What will be the new value?\n>>>")
            var toWhat: String = readLine()?.trim() ?: readLine().toString()
            print("Which parameter should be modified?\n>>>")
            var whatToModify: String = readLine()?.trim() ?: readLine().toString()
            when (whatToModify) {
                "F" -> {
                    toModify.setFname(toWhat)
                    println("Success!")
                }
                "L" -> {
                    toModify.setLname(toWhat)
                    println("Success!")
                }
                "N" -> {
                    toModify.setNname(toWhat)
                    println("Success!")
                }
                "A" -> {
                    toModify.setAddress(toWhat)
                    println("Success!")
                }
                "P" -> {
                    if (!isInTheList(toWhat)) {
                        toModify.setPnum(toWhat)
                        println("Success!")
                    } else print("The value is already in the database!")
                }
                "W" -> {
                    if (!isInTheList(toWhat)) {
                        toModify.setWnum(toWhat)
                        println("Success!")
                    } else println("The value is already in the database!")
                }
            }
        }
    }
}