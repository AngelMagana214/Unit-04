import java.text.DecimalFormat
import java.util.*

object Population {
    @JvmStatic
    fun main(args: Array<String>) {
        val input = Scanner(System.`in`)
        val df = DecimalFormat.getInstance()
        df.maximumFractionDigits = 2
        var days: Int
        var organisms = 0.0
        var increaseRate = 0.0
        print("Number of days to multiply: ")
        days = input.nextInt()
        while (days < 1) {
            print("Invalid entry dummy! Enter a day more than zero: ")
            days = input.nextInt()
        }
        print("Number of organisms: ")
        organisms = input.nextDouble()
        while (organisms < 2) {
            print("Invalid entry... are you trying to be wrong? Enter a value greater than 1: ")
            organisms = input.nextDouble()
        }
        print("Percentage of increase: ")
        increaseRate = input.nextDouble() / 100
        while (increaseRate < 0) {
            print("Invalid entry you fool! Enter a number that isn't negative: ")
            increaseRate = input.nextDouble()
        }
        println("")
        println("Day" + "       Population" )
        println("  1           " + df.format(organisms))
        for (i in 2 until days + 1) {
            organisms += increaseRate.let { organisms *= it; organisms }
            println("  " + i + "           " + df.format(organisms) + "                " )
        }
    }
}
