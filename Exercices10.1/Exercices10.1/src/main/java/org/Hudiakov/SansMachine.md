fun lireDesFichiersForTry() {
for (i in 1 until 10) {
try {
lireFichier("$i.txt")
} catch (e: FileNotFoundException) {
println("fichier n'existe pas")
}
}
}

fun lireDesFichiersTryFor() {
try {
for (i in 1 until 10) {
lireFichier("$i.txt")
}
} catch (e: FileNotFoundException) {
println("fichier n'existe pas")
}
}	

---
Dans le premier exemple, la variable 'i' sera testée chaque fois qu'elle change entre 1 et 10 dans la boucle
Dans le deuxième exemple, la variable i sera testée seulement si et quand elle lance une exception
