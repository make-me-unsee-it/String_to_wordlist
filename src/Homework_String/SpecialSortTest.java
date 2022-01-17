package Homework_String;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

public class SpecialSortTest {
    private LineToWordList testedObject;
    private String[] testArray;
    private ArrayList<String> actual;

    @Before
    public void setUp() {
        testedObject = new LineToWordList();
        testArray = new String[]{"every", "hunter", "absolutely", "wants", "to", "know", "where", "",
                "pheasants", "are", "sitting"};
        actual = new ArrayList<>();
        actual.add("absolutely");
        actual.add("are");
        actual.add("every");
        actual.add("hunter");
        actual.add("know");
        actual.add("pheasants");
        actual.add("sitting");
        actual.add("to");
        actual.add("wants");
        actual.add("where");
    }

    @After
    public void tearDown() {
        testedObject = null;
        testArray = null;
        actual = null;
    }

    @Test
    public void TestSpecialSort() {
        ArrayList<String> expected = testedObject.specialSort(testArray);
        Assert.assertEquals(expected, actual);
    }
}