// prescribed by zubquzaini

public class likethislikethat {

   private String username;
   
   // Okay kat sini ada overload constructor, satu default and satu normal
   public likethislikethat() {
       
       // contoh kita nak set nama "zubquzaini" guna normal constructor
       // kita boleh terus call normal constructor guna this
       this("zubquzaini");
   }
   
   public likethislikethat(String username) {
       this.username = username;
   }

   public String toString() {
       
       return("Hi, nama saya " + username);
   }
}



