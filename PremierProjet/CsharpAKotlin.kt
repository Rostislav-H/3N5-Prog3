
import java.io.Console

//var System: using? = null

object Bonjour {
    fun Main(args: Array<string>) {
        if (args.Length > 0) {
            val nom: string = args[0]
            Afficher(nom)
        } else {
            Console.WriteLine("SVP veuillez fournir un nom!")
        }
    }

    fun Afficher(nom: string) {
        Console.WriteLine("Bonjour $nom!")
    }
}