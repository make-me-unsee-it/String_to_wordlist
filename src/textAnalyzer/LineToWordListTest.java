package textAnalyzer;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class LineToWordListTest {
    private LineToWordList testedObject;
    private String testLine;
    private String[] actual;


    @Before
    public void setUp() throws Exception {
        testedObject = new LineToWordList();
        testLine = "every hunter (absolutely) wants to know where 10 pheasants are sitting!!!";
        actual = new String[]{"every", "hunter", "absolutely", "wants", "to", "know", "where", "",
                "pheasants", "are", "sitting"};

    }

    @After
    public void tearDown() throws Exception {
        testLine = null;
        testedObject = null;
    }

    @Test
    public void TestValidateAndSplitLine() {
        String[] expected = testedObject.validateAndSplitLine(testLine);
        Assert.assertArrayEquals(expected, actual);
    }
}
