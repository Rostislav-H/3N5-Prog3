package premier.projet

fun Triangle(height: Int) {

    for (i in 1..rows) {
        for (j in 1..i) {
            print("* ")
        }
        println()
    }
}
fun main(){
    val height = 5
    Triangle(height)

}

