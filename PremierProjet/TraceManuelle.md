fun main() {
 for (i : Int in 1..1) {
    for (j : Int in 1..2) {
       for (k : String in listOf(" pif", "") ) {
          val b = .1 + .1 + .1
          val z = (i + j * b / k.length * j).toString() + k
          println(z + " " + b)
       }
    }
  }
 }

## Sur la console, les valeurs  "1.033 + .3" et "1.066 + .6" seront affichées en séquence  