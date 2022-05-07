package cracking.the.code.interview.chapter5;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static java.lang.Long.toBinaryString;

public class Question51Test {

    @Test
    public void test() {

        long result = 0B10001001100;

        long n = 0B10000000000L;
        long m = 0B10011L;
        int i = 2;
        int j = 6;

        Assertions.assertEquals(toBinaryString(result), toBinaryString(Question51.insertMIntoN(n, m, i, j)));

        n = 0B10000010000L; // the 5 bit needs to be cleaned

        Assertions.assertEquals(toBinaryString(result), toBinaryString(Question51.insertMIntoN(n, m, i, j)));
    }

}
