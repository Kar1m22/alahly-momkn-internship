fun main(){
    val names = listOf("Ahmed","Kareem","Ali","Mariam","Omar","Fahd","Marwan")
    val modifiedNames = names
        .filter{it.length > 4}
        .map { it.uppercase() }
        .groupBy { it.first() }

    println(modifiedNames)
}