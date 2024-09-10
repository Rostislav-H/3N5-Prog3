package org.Hudiakov

import java.io.File

fun main(args: Array<String>) {

    var nomFichier1: String = args[0]
    var nomFichier2: String = args[1]
    var fichier1: File = File(nomFichier1)
    var fichier2: File = File(nomFichier2)

    if(fichier1.exists()){
        try {
            var text1: String = fichier1.readText()
            println(text1)
        } catch (e: Exception) {
            println("Le fichier $fichier1 ne peut pas être lu.")
        }
    }
    else{
        println("Le fichier $fichier1 n'existe pas")
    }


}