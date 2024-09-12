import com.sanctionco.jmail.Email
import com.sanctionco.jmail.JMail


fun main(){
    val email : String = "a.a@a.aa"
   if(JMail.isValid(email)){
       println("Ok : $email")
   }
   else{
       println("Ko : $email")
   }


}
