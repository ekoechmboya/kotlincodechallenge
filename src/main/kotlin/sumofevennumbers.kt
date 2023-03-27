fun main(){
    val numbers = listOf(1,2,3,4,5,6,7,8)
    var sum= sumEvenNumbers(numbers)
    println(sum)
}
fun sumEvenNumbers(numbers: List<Int>): Int {
    var sum = 0
    for (number in numbers) {
        if (number % 2 == 0) {
            sum += number
        }
    }
    return sum
}
