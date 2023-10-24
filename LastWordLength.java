import java.util.Scanner;

public class LastWordLength {
    public static int lengthOfLastWord(String s) {
        String[] words = s.split(" ");
        int lastIndex = words.length - 1;
        while (lastIndex >= 0 && words[lastIndex].isEmpty()) {
            lastIndex--;
        }
        if (lastIndex >= 0) {
            return words[lastIndex].length();
        } else {
            return 0;
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String input = scanner.nextLine();
        scanner.close();

        int result = lengthOfLastWord(input);
        System.out.println("Length of the last word: " + result);
    }
}
