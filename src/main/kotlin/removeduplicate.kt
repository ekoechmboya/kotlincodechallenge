fun main(){
    var numbers = listOf(1,2,3,5,3,5,3,4,5,6,6,7)
    var unique = removeDuplicates(numbers)
    println(numbers)
    println("$unique are unique")
}
fun removeDuplicates(numbers: List<Int>): List<Int> {
    val uniqueNumbers = mutableListOf<Int>()
    for (number in numbers) {
        if (!uniqueNumbers.contains(number)) {
            uniqueNumbers.add(number)
        }
    }
    return uniqueNumbers
}
