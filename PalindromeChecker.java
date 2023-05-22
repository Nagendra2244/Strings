/*Write a Java program to check if a given string is a valid palindrome by considering alphanumeric characters only and ignoring case.*/

public class PalindromeChecker{
    public static void main(String[] args) {
        String s1 = "A man, a plan, a canal: Panama";
        String s2 = "race a car";
        String s3 = "";

        boolean isPalindrome1 = isPalindrome(s1);
        boolean isPalindrome2 = isPalindrome(s2);
        boolean isPalindrome3 = isPalindrome(s3);

        System.out.println("\"" + s1 + "\" is a valid palindrome: " + isPalindrome1);
        System.out.println("\"" + s2 + "\" is a valid palindrome: " + isPalindrome2);
        System.out.println("\"" + s3 + "\" is a valid palindrome: " + isPalindrome3);
    }

    public static boolean isPalindrome(String str){
        
        StringBuilder alphanumericStr=new StringBuilder();

        for(char c : str.toCharArray()) {
            if(Character.isLetterOrDigit(c)) {
                alphanumericStr.append(Character.toLowerCase(c));
            }
        }
        int left=0;
        int right=alphanumericStr.length()-1;
        while(left<right) {
      if(alphanumericStr.charAt(left)!=alphanumericStr.charAt(right)){
                return false;
            }
            left++;
            right--;
        }
       return true;
    }
}
