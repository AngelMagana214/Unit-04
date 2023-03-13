import java.util.*

object LetterCounter {
    @JvmStatic
    fun main(args: Array<String>) {
        val `in` = Scanner(System.`in`)
        println("Enter a word or phrase: ")
        val s = `in`.nextLine()
        println("Enter a letter: ")
        val ch = `in`.next()[0]
        var count = 0
        for (i in 0 until s.length) {
            if (s[i] == ch) ++count
        }
        println("Here is how often that letter shows up in your initial entry")
        println(count)
    }
}
