fun main(args: Array<String>) {
    val familiaMap: MutableMap<String, String> = mutableMapOf(Pair("Pai",
        "Pedro"), Pair("Mãe", "Marcela"),
        Pair("Filho", "João"),
        Pair("Caçula", "Cadu"),
        Pair("Pet", "Paçoca"))

    familiaMap.forEach { key, value -> println("$key - $value") }
}