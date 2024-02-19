package cracking.the.code.interview.chapter1;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class Question1_1Test {

    @Test
    public void test() {

        Assertions.assertEquals(false, Question1_1.isUnique("aaa"));
        Assertions.assertEquals(false, Question1_1.isUnique("abc"));
        Assertions.assertEquals(false, Question1_1.isUnique("aba"));

        Assertions.assertEquals(true, Question1_1.isUniqueSet("abc"));
        Assertions.assertEquals(false, Question1_1.isUniqueSet("aaa"));
        Assertions.assertEquals(false, Question1_1.isUniqueSet("aba"));
    }

}
