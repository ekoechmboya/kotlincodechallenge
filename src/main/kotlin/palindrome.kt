fun main(){
    val palindrome = "racecar"
    val notpalindrome = "hello world"
     val check = isPalindrome(palindrome)
    val conf = isPalindrome(notpalindrome)
    println(check)
    println(conf)
}
fun isPalindrome(str: String): Boolean {
    val len = str.length
    for (i in 0 until len / 2) {
        if (str[i] != str[len - i - 1]) {
            return false
        }
    }
    return true
}
