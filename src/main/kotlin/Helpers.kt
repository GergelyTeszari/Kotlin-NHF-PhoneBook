fun isInTheList(input: String): Boolean{
    database.forEach {
        if (it.getPnum() == input || it.getWnum() == input)  {
            println("The value is already in the database!")
            return true
        }
    }
    return false
}

fun waitForResponse() {
    println("Press Enter to continue...")
    readLine()
}

fun cls() {
    for (i: Int in 0 until 50) println("\n")
}