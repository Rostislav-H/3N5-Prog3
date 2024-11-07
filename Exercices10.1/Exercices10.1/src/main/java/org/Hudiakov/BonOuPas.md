fun uneFonction(){
try {
//du code…
} catch (e: Exception){
println("Erreur : $e")
} catch (a: ArrayIndexOutOfBoundsException){
println("Erreur : $a")
}
}

Ici, le code n'est pas bon car le premier catch attrape toutes les erreurs et donc n'executera jamais le deuxieme.








fun calculerPoidsSupernova() {
try {
//calculs compliqués...
} catch (e: NumberFormatException) {}
}

Ici, le code est bon mais peut potentiellement etre amelioré par un try-catch afin de gerer les autres types des exceptions.
