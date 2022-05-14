fun delete(){
    print("What to delete?\n>>>")
    val results = search(readLine()?.trim() ?: readLine().toString())
    if (results.size != 1) println("Given parameter not accurate or no such entry!")
    else{
        database.forEach {
            if (it == results[0]) database.remove(it)
            println("Success!")
            return
        }
    }
}