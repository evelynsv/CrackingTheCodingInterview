package cracking.the.code.interview.chapter1;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class Question1_2Test {

    @Test
    public void test() {

        Assertions.assertEquals(true, Question1_2.checkPermutation("abc", "cba"));
        Assertions.assertEquals(false, Question1_2.checkPermutation("abc", "abcd"));
        Assertions.assertEquals(true, Question1_2.checkPermutation("abcef", "bfaec"));
        Assertions.assertEquals(false, Question1_2.checkPermutation("abc", "def")); 
        Assertions.assertEquals(true, Question1_2.checkPermutation("efxk", "xekf")); 
    }

}
