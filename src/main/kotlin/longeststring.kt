fun main(){
    val strings = listOf("foo", "bar", "baz", "qux")
    val longestString = findLongestString(strings)
    println("The longest string is: $longestString")


}
fun findLongestString(strings: List<String>): String {
    var longest = ""
    for (str in strings) {
        if (str.length > longest.length) {
            longest = str
        }
    }
    return longest
}
