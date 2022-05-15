fun read(isIndexed: Boolean) {
    cls()
    if (database.isEmpty()) println("Database empty!")
    if(!isIndexed) database.forEach { println(it) }
    else{
        for (index in database){
            println("${database.indexOf(index)+1}. $index")
        }
    }
}