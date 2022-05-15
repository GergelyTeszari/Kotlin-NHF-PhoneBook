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
        val letterIndex = hunChars.indexOf(wordIndex.lowercaseChar())
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

fun stringToHexASCII(s: String): String {
    var ret = "=" //starts with "="
    val array = s.toCharArray() //converts the string to char array
    for (i in array.indices) {
        val dec = array[i].code //gets the char's ASCII code
        ret += Integer.toHexString(dec) //converts it to hex ASCII code
        if (array.size - 1 != i) ret += "=" //if it is the last character, do not write an "=" after it
    }
    return ret
}