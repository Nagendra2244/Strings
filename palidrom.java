import java.util.Scanner;
class palidrom{
  public static void main(String[] args){
    String st1;
    String reverse="";
    int i;
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter the String st1:");
    st1=sc.nextLine();
    for(i=st1.length()-1;i>=0;i--){
         char ch=st1.charAt(i);
      reverse=reverse+ch;
    }
    if(st1.equals(reverse)){
      System.out.println("Given String is a palindrom");
    }else{
      System.out.println("Given string is a not a palindrom"); 
    }
  }
}