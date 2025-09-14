fun soma(i: Int, j: Int) = i + j
fun cat(i: String, j: String): String = "${i}${j}"

fun foo(i: Int, j:Int, f:(Int, Int) -> Int): Int = soma(i, j)
fun bar(s:String, t:String, f:(String, String) -> String): String = cat(s, t)

fun main(args: Array<String>) {
    println(foo(10, 20, ::soma))
    println(bar("Ped", "ro", ::cat))
}