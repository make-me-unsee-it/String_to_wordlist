package Homework_String;

import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class LineToWordList {

    public LineToWordList() {
    }

    public String countTheWords() throws CyrillicInputException {
        String entry = Scn.scanNoCyr();
        String[] wordsCanBeRepeated = validateAndSplitLine(entry);
        ArrayList<String> uniqueWords = specialSort(wordsCanBeRepeated);
        Map<String, Integer> result = calculateDuplicates(uniqueWords);
        return output(result);
    }

    public String countTheWords(String entry) {
        String[] wordsCanBeRepeated = validateAndSplitLine(entry.toLowerCase(Locale.ROOT));
        ArrayList<String> uniqueWords = specialSort(wordsCanBeRepeated);
        Map<String, Integer> result = calculateDuplicates(uniqueWords);
        return output(result);
    }

    protected String[] validateAndSplitLine(String userLine) {
        // step 1: remove needless (symbols except 'a-z' and ' ')
        Pattern p = Pattern.compile("[a-z ]");
        Matcher m = p.matcher(userLine);
        StringBuilder clearUserLine = new StringBuilder();
        while (m.find()) {
            clearUserLine.append(userLine, m.start(), m.end());
        }
        // step 2: creating an array with "split()"
        Pattern p2 = Pattern.compile(" ");
        return p2.split(clearUserLine);
    }

    protected ArrayList<String> specialSort(String[] wordsCanBeRepeated) {
        // step 3: sort abc & cleaning
        ArrayList<String> uniqueWords = new ArrayList<>();
        Collections.addAll(uniqueWords, wordsCanBeRepeated);
        Collections.sort(uniqueWords);
        // step 3-1: remove empty cells
        uniqueWords.removeAll(Arrays.asList("", null));
        return uniqueWords;
    }

    protected Map<String, Integer> calculateDuplicates(ArrayList<String> uniqueWords) {
        // step 4: calculate duplicates with "TreeMap"
        Map<String, Integer> result = new TreeMap<>();
        for (String current : uniqueWords) {
            if (!result.containsKey(current)) result.put(current, 1);
            else result.put(current, result.get(current) + 1);
        }
        return result;
    }

    protected String output(Map<String, Integer> result) {
        // step 5: output
        StringBuilder output = new StringBuilder();
        char currentFirstLetter = ' ';
        for (Map.Entry<String, Integer> word : result.entrySet()) {
            if ((word.getKey()).charAt(0) != currentFirstLetter) {
                output.append(Character.toUpperCase((word.getKey()).charAt(0))).append(":");
                currentFirstLetter = (word.getKey()).charAt(0);
            }
            output.append("\t").append(word.getKey()).append(" ").append(word.getValue()).append("\n");
        }
        output.setLength(output.length() - 1);
        //output.deleteCharAt(output.lastIndexOf("\n"));
        return output.toString();
    }

}
