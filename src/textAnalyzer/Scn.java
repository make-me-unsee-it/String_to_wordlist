package textAnalyzer;

import java.util.Scanner;

public class Scn {
    public static String scanNoCyr() throws CyrillicInputException {
        Scanner scan = new Scanner(System.in);
        String result = scan.nextLine().toLowerCase();

        // validation for cyrillic
        for (char currentChar : result.toCharArray()) {
            if (Character.UnicodeBlock.of(currentChar) == Character.UnicodeBlock.CYRILLIC) {
                throw new CyrillicInputException("По условию задачи использование кириллицы недопустимо!");
            }
        }
        return result;
    }


}