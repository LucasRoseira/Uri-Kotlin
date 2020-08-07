import java.util.*

fun main(args: Array<String>){
    val reader = Scanner(System.`in`);
    var a:Double = reader.nextDouble()
    var b:Double = reader.nextDouble()
    a = ((a*3.5)+(b*7.5))/11
    println("MEDIA = %.5f".format(a))
}