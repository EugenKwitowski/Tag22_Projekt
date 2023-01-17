fun main() {
    var fruits: List<String> = listOf("Strawberry", "Apple", "Banana", "Lemon")

    var i = 0
    do {
        var fruitsEinzeln = fruits[i]
        println(fruitsEinzeln)
        i++
    } while (i < fruits.size)


    for (i in fruits) {
        println(i)
    }

}