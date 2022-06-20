package Day1

import java.util.*

object GreaterNumber {
    @JvmStatic
    fun main(args: Array<String>) {
        val sc = Scanner(System.`in`)
        println("Enter the Number 1")
        val n1 = sc.nextInt()
        println("Enter the Number 2")
        val n2 = sc.nextInt()
        println("Enter the Number 3")
        val n3 = sc.nextInt()
        if (n1 > n2 && n2 > n3) {
            println("the greatest number is $n1")
        } else if (n1 < n2 && n3 > n2) {
            println("the greatest number is $n3")
        } else println("the greatest number is $n2")
    }
}