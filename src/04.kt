fun sum(i: Int, j: Int) = i + j
fun concat(i: String, j: String): String = "${i}${j}"

fun <T> xpto(i:T, j:T, f:(T, T) -> T): T = f(i,j)

fun main(args: Array<String>) {

    println(xpto(2, 3, ::soma))
    println(xpto("Jo", "ão", ::cat))

}