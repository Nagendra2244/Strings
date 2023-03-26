import java.util.*;
class concat
 { public static void main(String args[])
 {
    String st1;
      String st2;
   Scanner sc= new Scanner(System.in);
    System.out.println("Enter the St1:");
   st1=sc.next();
  System.out.println("Enter the St2:");
   st2=sc.next();
 System.out.println("The String 1 is:"+st1.replace('E','A'));
 System.out.println("The String concat is:"+st1+st2);
 System.out.println("The String concat is: "+st2.concat(st1));
}
}