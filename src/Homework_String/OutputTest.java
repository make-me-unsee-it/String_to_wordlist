package Homework_String;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.Map;
import java.util.TreeMap;

public class OutputTest {
    private LineToWordList testedObject;
    private Map<String, Integer> testMap;
    private String actual;

    @Before
    public void setUp() {
        testedObject = new LineToWordList();

        testMap = new TreeMap<>();
        testMap.put("absolutely", 1);
        testMap.put("are", 2);
        testMap.put("every", 1);
        testMap.put("hunter", 1);
        testMap.put("know", 1);
        testMap.put("pheasants", 1);
        testMap.put("sitting", 3);
        testMap.put("to", 1);
        testMap.put("wants", 1);
        testMap.put("where", 1);
        actual = "A:\tabsolutely 1\n" +
                "\tare 2\n" +
                "E:\tevery 1\n" +
                "H:\thunter 1\n" +
                "K:\tknow 1\n" +
                "P:\tpheasants 1\n" +
                "S:\tsitting 3\n" +
                "T:\tto 1\n" +
                "W:\twants 1\n" +
                "\twhere 1";
    }

    @After
    public void tearDown() {
        testedObject = null;
        testMap = null;
        actual = null;
    }

    @Test
    public void TestOutput() {
       String expected = testedObject.output(testMap);
        Assert.assertEquals(expected, actual);
    }
}