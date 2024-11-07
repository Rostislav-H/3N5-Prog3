fun main() {
try {
calcul()
lireFichier()
} catch (a: ArithmeticException) {
println("Problème dans les valeurs du calcul")
} catch (i: IllegalArgumentException) {
println("Problème dans les paramètres du programme")		
} catch (t: InterruptedException){
println("Problème avec le thread en cours")
} catch (io: IOException){
println("Problème avec le fichier")
}
}

fun lireFichier(){
// Code qui lit un fichier...
// Question : Catch ou laisse l'erreur se propager?
}



fun uneFonction(){
etape1()
etape2()
etape3()
etape4()
etape5()
}

public void etape3(){
// Code qui génère une exception
// Question : Catch ou laisse l'erreur se propager?
}
---
Ca ferait mieux d'attraper l'erreur dans le code des etapes afin de savoir plus précisement ou l'erreur s'est parvenu.