/*How to count the occurrence of the given character in a string*/
import java.util.*;
public class CountCharacter {
 
    public static void main(String[] args) {
 Scanner sc=new Scanner(System.in);
      System.out.println("Enter the String:");
        String Str=sc.next();
   System.out.println("Enter the Character:");
        char ch=sc.next().charAt(0);
 
        int count = 0;
 
        for (int i = 0; i < Str.length(); i++) {
 
            if (Str.charAt(i) == ch) {
                count++;
            }
        }
 
        System.out.println("The character '" + ch + "' found " + count + " times in a string '" +Str+ "'.");
    }
 
}