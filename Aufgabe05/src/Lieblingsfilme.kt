fun main() {


    var lieblingsFilme: List<String> = listOf("Batman", "Frankenstein", "Jurassic Park", "Matrix", "Harry Potter")

    for (film in lieblingsFilme) {
        if (film == "Matrix"){
            println(film)
            println(lieblingsFilme.indexOf(film))
        }
    }



    var i = 0
    //var index = lieblingsFilme[lieblingsFilme.indexOf("Matrix")]
    do {
        if (lieblingsFilme[i] == "Matrix"){
            println(lieblingsFilme[i])
            println(i)
        }
        i++

    } while (i < lieblingsFilme.size)

}