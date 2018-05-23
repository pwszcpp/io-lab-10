package pl.edu.pwsz_oswiecim.inf.unittests;

import org.junit.Assert;
import org.junit.Test;

/**
 * Created by mswierczek on 2018-05-16.
 */

public class TestyJednostkoweTest {

    private TestyJednostkowe testyJednostkowe = new TestyJednostkowe();

    @Test
    public void should_fizzBuzz_return_buzz_when_3_given() {
        String word = testyJednostkowe.fizzBuzz(3);
        Assert.assertEquals(word, "buzz");
    }

    @Test
    public void should_fizzBuzz_return_buzz_when_6_given() {
        String word = testyJednostkowe.fizzBuzz(6);
        Assert.assertEquals(word, "buzz");
    }

    @Test
    public void should_fizzBuzz_return_fizz_when_10_given() {
        String word = testyJednostkowe.fizzBuzz(10);
        Assert.assertEquals(word, "fizz");
    }

    @Test
    public void should_fizzBuzz_return_fizzbuzz_when_30_given() {
        String word = testyJednostkowe.fizzBuzz(30);
        System.out.println(word);
        Assert.assertEquals(word, "fizzbuzz");
    }

    @Test
    public void should_fizzBuzz_return_empty_when_7_given() {
        String word = testyJednostkowe.fizzBuzz(7);
        System.out.println(word);
        Assert.assertEquals(word, "");
    }

}
