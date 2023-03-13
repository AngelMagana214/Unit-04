import java.util.*

object GuessTheNumber {
    @JvmStatic
    fun main(args: Array<String>) {
//Create a scanner object to read from the keyboard
        val kb = Scanner(System.`in`)

//Create a random object
        val rand = Random()

//Identifier declarations
        var num: Int
        var guess = 0
        var guesses = 0
        var yorn: Char
        var `in`: String
        do {
            num = rand.nextInt(100) + 1
            guesses = 0
            do {
                println("Guess a number between 1 & 100: ")
                guess = kb.nextInt()
                guesses++
                if (guess > num) {
                    println("Too high, try again.")
                } else if (guess < num) {
                    println("Too low, try again.")
                } else {
                    println("Good Guess! The number is $num")
                    println("You guessed $guesses times. Better luck next time!")
                }
            } while (guess != num)
            `in` = kb.nextLine()
            print("Play again(Y/N)? ")
            `in` = kb.nextLine()
            yorn = `in`[0]
        } while (yorn == 'Y' || yorn == 'y')
    }
}
