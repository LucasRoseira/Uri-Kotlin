import java.util.*

fun main(args: Array<String>) {
    val reader = Scanner(System.`in`)
    var raio:Double = reader.nextDouble()
    raio = 3.14159 * Math.pow(raio, 2.0)
    println("A=%.4f".format(raio))
}