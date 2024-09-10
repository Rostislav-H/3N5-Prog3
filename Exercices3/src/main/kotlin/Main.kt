package org.Hudiakov

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
fun main() {
    val question ="Veuillez entrer un nombre :"
    while (true){
        println(question)
        val reponseInitiale = readln()
        var reponseCorrecte = reponseInitiale.toIntOrNull()
        if (reponseCorrecte != null){
            println("Merci, votre nombre est : $reponseCorrecte")
        }
        else {
            var reponseMauvaise = reponseInitiale
            println("$reponseMauvaise n'est pas un nombre, veuillez entrer un nombre :")
        }
    }

}