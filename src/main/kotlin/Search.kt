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
        if (it.getFname().equals(input, ignoreCase = true)
            || it.getLname().equals(input, ignoreCase = true)
            || it.getNname().equals(input, ignoreCase = true)
            || it.getFname().equals(toEnglish(input), ignoreCase = true)
            || it.getLname().equals(toEnglish(input), ignoreCase = true)
            || it.getNname().equals(toEnglish(input), ignoreCase = true)
            || it.getPnum().equals(input, ignoreCase = true)
            || it.getWnum().equals(input, ignoreCase = true)
        ) ret.add(it)
    }
    return ret
}