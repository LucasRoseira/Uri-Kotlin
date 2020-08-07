import java.util.*

fun main(args: Array<String>){
    val reader = Scanner(System.`in`);
    var a:Double = reader.nextDouble()
    var b:Double = reader.nextDouble()
    var c:Double = reader.nextDouble()
    a = ((a*2)+(b*3)+(c*5))/10
    println("MEDIA = %.1f".format(a))
}