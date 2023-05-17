/*Write a program to generate all possible permutations of a */
public class PermutationsOfAGivenString {
    public static void main(String args[]) {
        String s = "ABCD";
        permute(0, s);
    }

    public static void permute(int index, String s) {
        if (index == s.length() - 1) {
            System.out.println(s);
        } else {
            for (int i = index; i < s.length(); i++) {
                s = swap(s, i, index);
                permute(index + 1, s);
                s = swap(s, i, index); 
            }
        }
    }

    public static String swap(String s, int i, int j) {
        char[] charArray = s.toCharArray();
        char temp = charArray[i];
        charArray[i] = charArray[j];
        charArray[j] = temp;
        return String.valueOf(charArray);
    }
}
