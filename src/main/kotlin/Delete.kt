fun delete(){
    val results = indexedSearch("delete")
    if (results.size != 1) println("Given parameter not accurate or no such entry!")
    else{
        database.forEach {
            if (it.getPnum() == results[0].getPnum() && it.getWnum() == results[0].getWnum()) {
                database.remove(it)
                println("Success!")
                return
            }
        }
    }
}