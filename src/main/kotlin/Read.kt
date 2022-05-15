fun read(isIndexed: Boolean) {
    cls()
    if (database.isEmpty()) println("Database empty!")
    database.forEach { println(it) }
}