// substring(S):-
// substring(S,E-1):-
import java.util.Scanner;
class Substringg
 {
 public static void main(String args[])
 {
 String st1;
   Scanner sc=new Scanner(System.in);
      System.out.println("Enter the st1:");
      st1=sc.next();
 // check sub strings
    System.out.println("Print the sub string of a given String:"+st1.substring(2));
   System.out.println("Print the sub string of a given String:"+st1.substring(2,5));
}
 }