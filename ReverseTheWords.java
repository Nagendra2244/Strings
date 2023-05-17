/*Implement a program to reverse the words in a given sentence without using any additional space.*/

import java.util.Scanner;
 
public class ReverseTheWords{
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Original string : ");
     String Str = sc.nextLine();
    String words[] = Str.split("\\s");
    String reversedString = "";
    for (int i=0;i< words.length;i++) {
      String word=words[i];
      String reverseWord= "";
      for (int j=word.length()-1;j>=0;j--) {
        reverseWord=reverseWord+word.charAt(j);
      }
      reversedString=reversedString+reverseWord+ " ";
    }
    System.out.print("Reversed string : " + reversedString);
  }
}