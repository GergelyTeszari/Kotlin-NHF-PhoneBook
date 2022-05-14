var database: ArrayList<Entry> = fileInput()
fun main() {
    while (true) {
        cls()
        println("Welcome to Jaser phonebook program!\nWhat shall we do?")
        println("\nData input:\t\tC"
                    + "\n\nData listing:\t\tR"
                    + "\n\nData modify:\t\tU"
                    + "\n\nDate delete:\t\t\tD"
                    + "\n\nSearch:\t\t\tS"
                    + "\n\nSave:\t\t\t\tF"
                    + "\n\nSave and exit:\t\tX\n\n>>>")
        val choose: String? = readLine()
        if (choose != null) when (choose.uppercase().trim()){
            "C" -> create()
            "R" -> read()
            "U" -> update()
            "D" -> delete()
            "S" -> searchGUI()
            "F" -> save()
            "X" -> {
                save()
                break
            }
            else -> println("Option not recognizable!")
        }
        waitForResponse()
    }
}