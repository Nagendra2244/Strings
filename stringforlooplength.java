import java.util.Scanner;
class stringforlooplength{
  public static void main(String[] args){
    String st1;
    int i, count=0;
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter the String st1:");
    st1=sc.nextLine();
    for(i=0;i<st1.length();i++){
      count++;
    }
    System.out.println("The length of the given String is:"+count);
  }
}