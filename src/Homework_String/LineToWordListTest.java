package Homework_String;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class LineToWordListTest {
    private LineToWordList testedObject;
    private String testedLine;
    private String actual;

    @Before
    public void setUp() {
        testedObject = new LineToWordList();
        testedLine = "The Append (UInt16) method modifies the existing instance of this class; it does not return a" +
                "new class instance. Because of this, you can call a method or property on the existing reference" +
                "and you do not have to assign the return value to a StringBuilder object, as the following example" +
                "illustrates.";
        actual = "A:\ta 2\n" +
                "\tanew 1\n" +
                "\tappend 1\n" +
                "\tas 1\n" +
                "\tassign 1\n" +
                "B:\tbecause 1\n" +
                "C:\tcall 1\n" +
                "\tcan 1\n" +
                "\tclass 2\n" +
                "D:\tdo 1\n" +
                "\tdoes 1\n" +
                "E:\texampleillustrates 1\n" +
                "\texisting 2\n" +
                "F:\tfollowing 1\n" +
                "H:\thave 1\n" +
                "I:\tinstance 2\n" +
                "\tit 1\n" +
                "M:\tmethod 2\n" +
                "\tmodifies 1\n" +
                "N:\tnot 2\n" +
                "O:\tobject 1\n" +
                "\tof 2\n" +
                "\ton 1\n" +
                "\tor 1\n" +
                "P:\tproperty 1\n" +
                "R:\treferenceand 1\n" +
                "\treturn 2\n" +
                "S:\tstringbuilder 1\n" +
                "T:\tthe 5\n" +
                "\tthis 2\n" +
                "\tto 2\n" +
                "U:\tuint 1\n" +
                "V:\tvalue 1\n" +
                "Y:\tyou 2";
    }

    @After
    public void tearDown() {
        testedObject = null;
        testedLine = null;
        actual = null;
    }

    @Test
    public void testCountTheWords() {
        String expected = testedObject.countTheWords(testedLine);
        Assert.assertEquals(expected, actual);
    }
}