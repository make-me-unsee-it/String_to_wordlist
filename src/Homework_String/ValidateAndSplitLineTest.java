package Homework_String;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class ValidateAndSplitLineTest {
    private LineToWordList testedObject;
    private String testLine;
    private String[] actual;

    @Before
    public void setUp() {
        testedObject = new LineToWordList();
        testLine = "every hunter (absolutely) wants to know where 10 pheasants are sitting!!!";
        actual = new String[]{"every", "hunter", "absolutely", "wants", "to", "know", "where", "",
                "pheasants", "are", "sitting"};
    }

    @After
    public void tearDown() {
        testLine = null;
        testedObject = null;
        actual = null;
    }

    @Test
    public void testValidateAndSplitLine() {
        String[] expected = testedObject.validateAndSplitLine(testLine);
        Assert.assertArrayEquals(expected, actual);
    }
}
