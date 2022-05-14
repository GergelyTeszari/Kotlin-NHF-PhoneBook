fun isInTheList(input: String): Boolean{
    database.forEach {
        if (it.getPnum().equals(input) || it.getWnum().equals(input))  return true
    }
    return false
}

fun waitForResponse() {
    println("Press any key to continue...")
    readLine()
}

fun cls() {
    for (i: Int in 0 until 50) println("\n")
}