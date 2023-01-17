fun main() {
    var numbers: MutableList<Int> = mutableListOf(3, 6, 4, 7, 42, 1, 26)

    for (i in numbers) {
        var numbersMalFuenf = i * 5
        println(numbersMalFuenf)
    }

    var i = 0
    do {
        var numbersMalFuenf2 = numbers[i] * 5
        println(numbersMalFuenf2)
        i++
    } while (i < numbers.size)
}