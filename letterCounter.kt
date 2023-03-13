import java.util.*

object LetterCounter {
    @JvmStatic
    fun main(args: Array<String>) {
        val `in` = Scanner(System.`in`)
        println("Enter a word or phrase: ")
        val phrase = `in`.nextLine()
        println("Enter a letter: ")
        val letter = `in`.next()[0]
        var count = 0
        for (i in 0 until phrase.length) {
            if (phrase[i] == letter) ++count
        }
        println("Here is how often that letter shows up in your initial entry")
        println(count)
    }
}
