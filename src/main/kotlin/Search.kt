fun searchGUI() {
    print("Enter the searched value:\n>>>")
    val input: String = readLine()?.trim() ?: readLine().toString()
    val results = search(input)
    if (results.size == 0) println("No such entry!")
    else results.forEach { println(it) }
}

fun search(input: String): ArrayList<Entry>{
    val ret: ArrayList<Entry> = ArrayList()
    database.forEach {
        if (it.getFname() == input
            || it.getFname() == input
            || it.getLname() == input
            || it.getNname() == input
            || it.getPnum() == input
            || it.getWnum() == input
        ) ret.add(it)
    }
    return ret
}