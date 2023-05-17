/*Write a program to find the longest palindrome substring within a given string*/
public class Main {
    public static void main(String[] args) {
        String str1 = "thequickbrownfoxxofnworbquickthe";
        System.out.println("The given string is: " + str1);
        int n = str1.length();
        boolean table[][] = new boolean[n][n];
        int maxLength = 1;
        for (int i = 0; i < n; ++i)
            table[i][i] = true;
        int start = 0;
        for (int i = 0; i < n - 1; ++i) {
            if (str1.charAt(i) == str1.charAt(i + 1)) {
                table[i][i + 1] = true;
                start = i;
                maxLength = 2;
            }
        }
        for (int k = 3; k <= n; ++k) {
            for (int i = 0; i < n - k + 1; ++i) {
                int j = i + k - 1;
                if (table[i + 1][j - 1] && str1.charAt(i) == str1.charAt(j)) {
                    table[i][j] = true;

                    if (k > maxLength) {
                        start = i;
                        maxLength = k;
                    }
                }
            }
        }
        System.out.println("The longest palindrome substring in the given string is: " + str1.substring(start, start + maxLength));
        System.out.println("The length of the palindromic substring is: " + maxLength);
    }
}
