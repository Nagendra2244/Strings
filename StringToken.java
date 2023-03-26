/*String Tokenizer*/


import java.util.*;
class StringToken{
  public static void main(String[] args){
       // Initializing String st1
    String st1="Hai welcomes to bit Labs";
    //Creating the StringTokenizer Object
    StringTokenizer t=new StringTokenizer(st1);
    
    System.out.println("The Number of tokens are:"+t.countTokens());
    
    System.out.println("The Tokens are:");
      //By using hasMoreTokens method
    while(t.hasMoreTokens()){
      System.out.println(t.nextToken());
    }
  }
}