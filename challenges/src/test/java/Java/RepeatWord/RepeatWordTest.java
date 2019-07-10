package Java.RepeatWord;

import org.junit.Test;

import static org.junit.Assert.*;

public class RepeatWordTest {
    @Test
    public void testRepeatWord() {
        String testing = "Once upon a time, there was a brave princess who...";
        assertTrue(RepeatWord.repeatWord(testing).equals("a"));
    }

    @Test
    public void testRepeatWordWill() {
        String testing = "I want to make a test to test this method.";
        assertTrue(RepeatWord.repeatWord(testing).equals("to"));
    }

    @Test
    public void testRepeatWordTwo() {
        String testing = "It was the best of times, it was the worst of times, it was the age of wisdom, it was the age of foolishness, it was the epoch of belief, it was the epoch of incredulity, it was the season of Light, it was the season of Darkness, it was the spring of hope, it was the winter of despair, we had everything before us, we had nothing before us, we were all going direct to Heaven, we were all going direct the other way – in short, the period was so far like the present period, that some of its noisiest authorities insisted on its being received, for good or for evil, in the superlative degree of comparison only...";
        assertTrue(RepeatWord.repeatWord(testing).equals("it"));
    }

    @Test
    public void testRepeatWordThree() {
        String testing = "It was a queer, sultry summer, the summer they electrocuted the Rosenbergs, and I didn’t know what I was doing in New York...";
        assertTrue(RepeatWord.repeatWord(testing).equals("summer"));
    }

    @Test
    public void testRepeatWordApostrophe() {
        String testing = "It's hot outside and it's gonna rain";
        assertTrue(RepeatWord.repeatWord(testing).equals("it's"));
    }

    @Test
    public void testRepeatWordEmpty() {
        String testing = "";
        assertTrue(RepeatWord.repeatWord(testing).equals("Namaste"));
    }

    @Test (expected = NullPointerException.class)
    public void testNoRepeatWord() {
        String testing = "It's beginning to look a lot like Christmas.";
        assertTrue(RepeatWord.repeatWord(testing).equals(null));
    }
}
