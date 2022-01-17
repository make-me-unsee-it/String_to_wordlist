package Homework_String;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Map;
import java.util.TreeMap;

public class CalculateDuplicatesTest {
    private LineToWordList testedObject;
    private ArrayList<String> testCollection;
    private Map<String, Integer> actual;

    @Before
    public void setUp() {
        testedObject = new LineToWordList();

        testCollection = new ArrayList<>();
        testCollection.add("absolutely");
        testCollection.add("are");
        testCollection.add("are");
        testCollection.add("every");
        testCollection.add("hunter");
        testCollection.add("know");
        testCollection.add("pheasants");
        testCollection.add("sitting");
        testCollection.add("sitting");
        testCollection.add("sitting");
        testCollection.add("to");
        testCollection.add("wants");
        testCollection.add("where");

        actual = new TreeMap<>();
        actual.put("absolutely", 1);
        actual.put("are", 2);
        actual.put("every", 1);
        actual.put("hunter", 1);
        actual.put("know", 1);
        actual.put("pheasants", 1);
        actual.put("sitting", 3);
        actual.put("to", 1);
        actual.put("wants", 1);
        actual.put("where", 1);
    }

    @After
    public void tearDown() {
        testedObject = null;
        testCollection = null;
        actual = null;
    }

    @Test
    public void TestCalculateDuplicates() {
        Map<String, Integer> expected = testedObject.calculateDuplicates(testCollection);
        Assert.assertEquals(expected, actual);
    }
}