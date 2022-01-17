package textAnalyzer;

public class Demo {
    public static void main(String[] args) throws CyrillicInputException {
        String line = "The Append(UInt16) method modifies the existing instance of this class; it does not return a" +
                "new class instance. Because of this, you can call a method or property on the existing reference" +
                "and you do not have to assign the return value to a StringBuilder object, as the following example" +
                "illustrates.";

        LineToWordList myLine = new LineToWordList();

        System.out.println( myLine.countTheWords(line));        // with given condition

        System.out.println("Введите текст на английском:");
        System.out.println(myLine.countTheWords());             // with scanner input

    }
}
