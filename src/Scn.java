import java.util.Scanner;

public class Scn {
    public static String scanNoCyr() {
        System.out.println("\nВведите произвольный текст на английском языке:");
        Scanner scan = new Scanner(System.in);
        String result = scan.nextLine().toLowerCase();

        // validation for cyrillic
        for (char currentChar : result.toCharArray()) {
            if (Character.UnicodeBlock.of(currentChar) == Character.UnicodeBlock.CYRILLIC) {
                System.out.println("По условию задачи использование кириллицы недопустимо!");
            }
        }
        return result;
    }
}