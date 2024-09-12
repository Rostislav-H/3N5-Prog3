
import com.sanctionco.jmail.JMail


fun main(){
    val email = "zor^r"
   if(JMail.isValid(email)){
       println("Ok : $email")
   }
   else{
       println("Ko : $email")
   }


}
