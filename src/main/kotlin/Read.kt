fun read() {
    cls()
    if (database.isEmpty()) println("Database empty!")
    database.forEach { println(it) }
}