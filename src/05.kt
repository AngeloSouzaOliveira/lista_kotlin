fun processaInteiro(i: Int, f: (Int) -> Int): Int{
    return f(i)
}
fun processaInteiros(i: Int, j: Int, f: (Int, Int) -> Int): Int{
    return f(i, j)
}
// Funções
fun sumInt(i: Int, j: Int): Int{
    return i + j
}
fun multiplica(i: Int, j: Int): Int{
    return i * j
}
fun raizQuadrada(numero: Int): Int {
    for (n in 1..numero) {
        if (n * n == numero)
            return n
    }
    return -1
}

fun main(){
    // 1.  primeiro
    println(processaInteiros(2,2,::sumInt))
    println(processaInteiros(2,2,::multiplica))
    println(processaInteiro(64, ::raizQuadrada))

    // 2. segundo
    println(processaInteiros(9,9) {i , j -> i + j})
    println(processaInteiros(2,3) { i, j -> i * j})

    println(processaInteiro(64) { n ->
        var r = -1
        for (x in 1..n) {
            if (x * x == n) { r = x; break }
        }
        r
    })
}