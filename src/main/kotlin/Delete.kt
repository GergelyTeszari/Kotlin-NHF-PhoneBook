fun delete(){
    print("What to delete?\n>>>")
    val input: String = readLine()?.trim() ?: readLine().toString()
    val results = search(input)
    if (results.size != 1){
        println("Given parameter not accurate or no such entry!")
    }
    else{
        val toDelete: Entry = results[0]
        database.forEach {
            if (it == toDelete) database.remove(it)
            println("Success!")
        }
    }
}