fun main() {
    getGrade()

}
fun getGrade() {
    println("Enter your name:")
    var name = readLine()
    println("Enter marks:")
    for (x in 50..100) {
        var x = Integer.valueOf(readLine())
        if (x >= 90 && x <= 100) {
            println("$name you have scored A")
            break
        } else if (x>= 70 && x <= 80) {
            println("$name you have scored B")
            break
        } else if (x >= 60 && x <= 69) {
            println("$name you have scored C")
            break
        } else if (x >= 50 && x <= 59) {
            println("$name you have scored D")
            break
        } else {
            println(" $name you have failed")
            break
        }

    }
}




  



