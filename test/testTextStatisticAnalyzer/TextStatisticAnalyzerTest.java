package testTextStatisticAnalyzer;

import textStatisticAnalyzer.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;


public class TextStatisticAnalyzerTest {
    String text;
    String expected;

    TextStatisticAnalyzer textStatisticAnalyzer;
    TextStatisticAnalyzer textStatisticAnalyzerNegativeCase;

    @Before
    public void setUp() {

        text = "This is Rose. She's ten. She has got a big family. " +
                "Rose has got a dad, a mum, two sisters, two brothers, a granny and a grandad. " +
                "This is her dad. His name is Sam. This is her mum. Her name is Liz. " +
                "These are her sisters. Their names are Pam and Lolly. These are her brothers. " +
                "Their names are Tim and Bim. This is her granny. " +
                "Her name is Suicide. " +
                "This is her grandad. His name is Tom.";
        expected = "A:  a 5\n" + "\tand 3\n" + "\tare 4\n" +
                "B:  big 1\n" + "\tbim 1\n" + "\tbrothers 2\n" +
                "D:  dad 2\n" +
                "F:  family 1\n" +
                "G:  got 2\n" + "\tgrandad 2\n" + "\tgranny 2\n" +
                "H:  has 2\n" + "\ther 8\n" + "\this 2\n" +
                "I:  is 9\n" +
                "L:  liz 1\n" + "\tlolly 1\n" +
                "M:  mum 2\n" +
                "N:  name 4\n" + "\tnames 2\n" +
                "P:  pam 1\n" +
                "R:  rose 2\n" +
                "S:  sam 1\n" + "\tshe 1\n" + "\tshe's 1\n" + "\tsisters 2\n" + "\tsuicide 1\n" +
                "T:  ten 1\n" + "\ttheir 2\n" + "\tthese 2\n" + "\tthis 5\n" + "\ttim 1\n" + "\ttom 1\n" + "\ttwo 2\n";

        textStatisticAnalyzer = new TextStatisticAnalyzer(text);
        textStatisticAnalyzerNegativeCase = new TextStatisticAnalyzer("");
    }

    @After
    public void tearDown() {
    }

    @Test
    public void receiveAnalise() {
        String actual = textStatisticAnalyzer.receiveAnalise();
        assertEquals(expected, actual);
    }

    @Test (expected = EmptyStringException.class)
    public void receiveAnaliseFromEmptyString() {
        String actual = textStatisticAnalyzerNegativeCase.receiveAnalise();
        assertEquals(expected, actual);
    }
}