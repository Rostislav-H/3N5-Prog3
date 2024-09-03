package org.example

fun main() {
    val hauteur: Int = 4
    var nbEtoiles: Int = 1
    var ligne: String = ""
    for (i: Int in 1..hauteur){
        ligne = "*".repeat(nbEtoiles)
        nbEtoiles +=2
        println(ligne)
    }
}

// //    val a = 1                                   // type est     int
    //     val aa = 1L                                 // type est     string
    // val aaa = a * 25 + aa * 100                 // type est     string
    // val b = 1.0                                 // type est     double
    // val c = "1"                                 // type est     string
    // val d = true                                // type est     bool
    // val laChose = c + b                         // type est     string
    // val k = listOf("1", "2", "3")               // type est     string[]
// val l = mutableListOf(true, false, true)    // type est     bool[]
