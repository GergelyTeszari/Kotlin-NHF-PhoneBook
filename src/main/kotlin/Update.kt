fun update(){
    val results = indexedSearch("update")
    if (results.size != 1) println("Given parameter not accurate or no such entry!")
    else {
        database.forEach {
            if (it.getPnum() == results[0].getPnum() && it.getWnum() == results[0].getWnum()){
                print("$it\n")
                print("Which parameter should be modified?\n" +
                        "F:\tFirstname\n" +
                        "L:\tLastname\n" +
                        "N:\tNickname\n" +
                        "A:\tAddress\n" +
                        "P:\tPrivate number\n" +
                        "W:\tWork number\n>>>")
                val whichParameter = getInput()
                print("What will be the new value?\n>>>")
                val toWhat = getInput()
                when (whichParameter.uppercase()) {
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
                return
            }
        }
    }
}