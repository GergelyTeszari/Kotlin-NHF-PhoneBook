fun update(){
    print("What to update?\n>>>")
    //TODO kiiratás és indexelt kiválasztás
    val results = search(readLine()?.trim() ?: readLine().toString())
    if (results.size != 1) println("Given parameter not accurate or no such entry!")
    else {
        database.forEach {
            if (it == results[0]){
                print("$it\n")
                print("Which parameter should be modified?\n" +
                        "F:\tFirstname\n" +
                        "L:\tLastname\n" +
                        "N:\tNickname\n" +
                        "A:\tAddress\n" +
                        "P:\tPrivate number\n" +
                        "W:\tWork number\n>>>")
                val choose = readLine()?.trim() ?: readLine().toString()
                print("What will be the new value?\n>>>")
                val toWhat = readLine()?.trim() ?: readLine().toString()
                when (choose) {
                    "F" -> it.setFname(toEnglish(toWhat))
                    "L" -> it.setLname(toEnglish(toWhat))
                    "N" -> it.setNname(toEnglish(toWhat))
                    "A" -> it.setAddress(toEnglish(toWhat))
                    "P" -> {
                        if (!isInTheList(toWhat)) it.setPnum(toWhat)
                        else println("Error!")
                    }
                    "W" -> {
                        if (!isInTheList(toWhat)) it.setWnum(toWhat)
                        else println("Error!")
                    }
                }
            }
        }
    }
}