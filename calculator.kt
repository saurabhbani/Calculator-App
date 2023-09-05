import java.util.*

internal object calculator {
    @JvmStatic
    fun main(args: Array<String>) {
        val operator: Char
        val number1: Double
        val number2: Double
        val result: Double
        val input = Scanner(System.`in`)
        println("Choose an operator: +, -, *, or /")
        operator = input.next()[0]
        println("Enter first number")
        number1 = input.nextDouble()
        println("Enter second number")
        number2 = input.nextDouble()
        when (operator) {
            '+' -> {
                result = number1 + number2
                println("$number1 + $number2 = $result")
            }

            '-' -> {
                result = number1 - number2
                println("$number1 - $number2 = $result")
            }

            '*' -> {
                result = number1 * number2
                println("$number1 * $number2 = $result")
            }

            '/' -> {
                result = number1 / number2
                println("$number1 / $number2 = $result")
            }

            else -> println("Invalid operator!")
        }
        input.close()
    }
}