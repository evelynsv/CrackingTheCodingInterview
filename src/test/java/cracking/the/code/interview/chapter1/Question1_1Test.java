package cracking.the.code.interview.chapter1;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class Question1_1Test {

    @Test
    public void test() {

        Assertions.assertEquals(true, Question1_1.isUnique("abc"));
        Assertions.assertEquals(true, Question1_1.isUnique("dehjkpor"));
        Assertions.assertEquals(false, Question1_1.isUnique("aaa"));
        Assertions.assertEquals(false, Question1_1.isUnique("aba"));
        Assertions.assertEquals(false, Question1_1.isUnique("abba"));
        Assertions.assertEquals(false, Question1_1.isUnique("abac"));
        Assertions.assertEquals(false, Question1_1.isUnique("abb"));
        Assertions.assertEquals(false, Question1_1.isUnique("abca"));
        Assertions.assertEquals(false, Question1_1.isUnique("aabbcc"));
        Assertions.assertEquals(false, Question1_1.isUnique("aaabbb"));
        Assertions.assertEquals(false, Question1_1.isUnique("abbcdef"));

        Assertions.assertEquals(true, Question1_1.isUniqueSet("abc"));
        Assertions.assertEquals(false, Question1_1.isUniqueSet("aaa"));
        Assertions.assertEquals(false, Question1_1.isUniqueSet("aba"));
        Assertions.assertEquals(false, Question1_1.isUniqueSet("abba"));
        Assertions.assertEquals(false, Question1_1.isUniqueSet("abac"));
        Assertions.assertEquals(false, Question1_1.isUniqueSet("abb"));
        Assertions.assertEquals(false, Question1_1.isUniqueSet("abca"));
        Assertions.assertEquals(false, Question1_1.isUniqueSet("aabbcc"));
        Assertions.assertEquals(false, Question1_1.isUniqueSet("aaabbb"));
        Assertions.assertEquals(false, Question1_1.isUniqueSet("abbcdef"));
    }

}
