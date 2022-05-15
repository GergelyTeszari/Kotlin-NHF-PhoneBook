fun isInTheList(input: String): Boolean{
    database.forEach {
        if ((it.getPnum() == input) || (it.getWnum() == input))  {
            println("The value is already in the database!")
            return true
        }
    }
    return false
}

fun toEnglish(word: String): String{
    val wordList: ArrayList<Char> = ArrayList()
    word.forEach { wordList.add(it) }
    val hunChars = listOf<Char>('á', 'é', 'í', 'ó', 'ö', 'ő', 'ú', 'ü', 'ű')
    val simple  = listOf<Char>('a', 'e', 'i', 'o', 'o', 'o', 'u', 'u', 'u')
    for (wordIndex in wordList){
        val letterIndex = hunChars.indexOf(wordIndex)
        if(letterIndex != -1) wordList[wordList.indexOf(wordIndex)] = simple[letterIndex]
    }
    return String(wordList.toCharArray())
}

fun waitForResponse() {
    println("Press Enter to continue...")
    readLine()
}

fun cls() {
    for (i: Int in 0 until 50) println("\n")
}