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

fun indexedSearch(method: String): ArrayList<Entry>{
    read(true)
    print("What to $method?\n>>>")
    var results = ArrayList<Entry>()
    val search = readLine()?.trim() ?: readLine().toString()
    try {
        search.toInt()
        if (search.toInt() > database.size || search.toInt() <= 0){
            println("No such index, searching in phonenumber mode...")
            results = search(search)
        }
        else {
            println("Index detected, searching with index...")
            results.add(database[search.toInt()-1])
        }
    }
    catch (e: Exception){
        println("The value is not a number, searching in text mode...")
        results = search(search)
    }
    return results
}