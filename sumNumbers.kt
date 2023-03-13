import javax.swing.JOptionPane


object SumOfNumbers {
    @JvmStatic
    fun main(args: Array<String>) {

        var number: Int

        
        val input = JOptionPane.showInputDialog("Sup man! Enter a positive nonzero integer.. or face the consequences!")

        
        number = input.toInt()

        
        var sum = 0

        
        while (number>= 1) {
            sum += number
            number--
        }
        JOptionPane.showMessageDialog(null, "Here is the Sum of your choices: $sum")
    }
}
