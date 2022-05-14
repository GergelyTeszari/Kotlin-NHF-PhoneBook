import java.io.File
import java.io.InputStream

fun fileInput(): ArrayList<Entry> {
    try{
        val ret: ArrayList<Entry> = ArrayList()
        val inputStream: InputStream = File("Entries.csv").inputStream()
        val lineList = mutableListOf<String>()
        inputStream.bufferedReader().forEachLine { lineList.add(it) }
        lineList.forEach{
            var splitted = it.split(',')
            ret.add(
                Entry(splitted.get(0),
                    splitted.get(1),
                    splitted.get(2),
                    splitted.get(3),
                    splitted.get(4),
                    splitted.get(5),
                )
            )
        }
        return ret
    }
    catch (e: java.lang.Exception){
        return ArrayList()
    }
}

fun save() {
    File("Entries.csv").printWriter().use { out ->
        database.forEach {
            out.println(it.toFile())
        }
    }
}