/*Write a Java program to find the longest common subsequence between two strings*/
public class Main {
    public static void main(String[] args) {
        String str1 = "NAGENDRABABU";
        String str2 = "SIVAPRASANNA";

        int m=str1.length();
        int n=str2.length();

        int arr[][]=new int[m+1][n+1];

        for (int i=1; i<=m;i++) {
            for (int j=1;j<=n;j++) {
                if (str1.charAt(i-1)==str2.charAt(j-1)) {
                    arr[i][j]=arr[i-1][j-1]+1;
                } else {
                    arr[i][j]=Math.max(arr[i-1][j],arr[i][j-1]);
                }
            }
        }

        int len=arr[m][n];
        char lcs[]=new char[len];//lcs=longest common subsequence
        int i=m, j=n;
        while (i>0&&j>0) {
            if (str1.charAt(i-1)==str2.charAt(j-1)) {
                lcs[len-1]=str1.charAt(i-1);
                i--;
                j--;
                len--;
            } 
            else if (arr[i-1][j]>arr[i][j-1]) {
                i--;
            } 
            else {
                j--;
            }
        }

        String lcsString = new String(lcs);
        System.out.println("Longest Common Subsequence:"+lcsString);
    }
}
