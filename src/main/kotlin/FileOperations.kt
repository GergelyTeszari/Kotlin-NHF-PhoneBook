import java.io.File
import java.io.InputStream

fun fileInput(): ArrayList<Entry> {
    try{
        val ret: ArrayList<Entry> = ArrayList()
        val inputStream: InputStream = File("Entries.csv").inputStream()
        val lineList = mutableListOf<String>()
        inputStream.bufferedReader().forEachLine { lineList.add(it) }
        lineList.forEach{
            val split = it.split(',')
            ret.add(
                Entry(
                    split[0],
                    split[1],
                    split[2],
                    split[3],
                    split[4],
                    split[5],
                )
            )
        }
        return ret
    }
    catch (e: java.lang.Exception){
        return ArrayList()
    }
}

fun save(toVCF: Boolean) {
    if (!toVCF){
        File("Entries.csv").printWriter().use { out ->
            database.forEach {
                out.println(it.toFile())
            }
        }
    }
    else{
        File("Entries.vcf").printWriter().use { out ->
            database.forEach {
                out.println(it.toVCF())
            }
        }
    }
    println("File written successfully!")
}