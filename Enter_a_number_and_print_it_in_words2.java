/*Write a JAVAprogram to enter a number and print it in words.By using String Array
*/
import java.util.Scanner;

public class Enter_a_number_and_print_it_in_words2 {

   String[] ONES_PLACE = {"", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine"};
    String[] TENS_PLACE = {"", "", "twenty", "thirty", "forty", "fifty", "sixty", "seventy", "eighty", "ninety"};
    String[] TEENS = {"ten", "eleven", "twelve", "thirteen", "fourteen", "fifteen", "sixteen", "seventeen", "eighteen", "nineteen"};

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = sc.nextInt();
        String words = convertToWords(number);
        System.out.println("The number " + number + " in words is: " + words);
    }

    public static String convertToWords(int number) {
        if (number == 0) {
            return "zero";
        }
        if (number < 0) {
            return "minus " + convertToWords(Math.abs(number));
        }
        String words = "";
        if ((number / 1000) > 0) {
            words += convertToWords(number / 1000) + " thousand ";
            number %= 1000;
        }
        if ((number / 100) > 0) {
            words += ONES_PLACE[number / 100] + " hundred ";
            number %= 100;
        }
        if (number > 0) {
            if (number < 10) {
                words += ONES_PLACE[number];
            } else if (number < 20) {
                words += TEENS[number - 10];
            } else {
                words += TENS_PLACE[number / 10] + " ";
                if ((number % 10) > 0) {
                    words += ONES_PLACE[number % 10];
                }
            }
        }
        return words.trim();
    }
}
