package cracking.the.code.interview.chapter1;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class Question1_5Test {

    @Test
    public void test() {

        Assertions.assertEquals(true, Question1_5.isOneOrZeroEditAway("pales", "pale"));
        Assertions.assertEquals(true, Question1_5.isOneOrZeroEditAway("pale", "pales"));
        Assertions.assertEquals(true, Question1_5.isOneOrZeroEditAway("pale", "ple"));
        Assertions.assertEquals(false, Question1_5.isOneOrZeroEditAway("pale", "bake"));
        Assertions.assertEquals(false, Question1_5.isOneOrZeroEditAway("pale", "bakery"));
    }
}
