package Homework_String;

public class Demo {
    public static void main(String[] args) throws CyrillicInputException {
        LineToWordList myLine = new LineToWordList();
        System.out.println("Введите текст на английском:");
        System.out.println(myLine.countTheWords());
    }
}
