// equals()
// equalsIgnoreCase():
import java.util.*;
class equal
 {
     public static void main(String args[])
 {
    String st1;
    String st2;
   Scanner sc=new Scanner(System.in);
      System.out.println("Enter the st1:");
      st1=sc.next();
      System.out.println("Enter the st2:");
      st2=sc.next();
     
 // check both String are Equal or not
   if(st1.equals(st2)){
     System.out.println("Both strings are equal");
   }
   else{
     System.out.println("Both strings are not equal");
   }
}
}