var database: ArrayList<Entry> = fileInput()
fun main() {
    while (true) {
        cls()
        println("Welcome to Jaser phonebook program!\nWhat shall we do?")
        println("\nCreate new entry:\t\tC"
                    + "\n\nList entries:\t\tR"
                    + "\n\nModify entry:\t\tU"
                    + "\n\nDelete entry:\t\t\tD"
                    + "\n\nSearch in database:\t\t\tS"
                    + "\n\nExport to .VCF:\t\t\tV"
                    + "\n\nSave database:\t\t\t\tF"
                    + "\n\nSave database and exit:\t\tX\n\n>>>")
        val choose = readLine()
        if (choose != null) when (choose.uppercase().trim()){
            "C" -> create()
            "R" -> read(false)
            "U" -> update()
            "D" -> delete()
            "S" -> searchGUI()
            "V" -> save(true)
            "F" -> save(false)
            "X" -> {
                save(false)
                println("Goodbye!")
                break
            }
            else -> println("Option not recognizable!")
        }
        waitForResponse()
    }
}