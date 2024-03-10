package cracking.the.code.interview.chapter1;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class Question1_9Test {

    @Test
    public void test() {

        Assertions.assertEquals(true, Question1_9.isRotation("waterbottle", "erbottlewat"));
        Assertions.assertEquals(true, Question1_9.isRotation("aloavera", "averaalo"));
        Assertions.assertEquals(false, Question1_9.isRotation("waterbottle", "erbottlewax"));
        Assertions.assertEquals(false, Question1_9.isRotation("waterbottle", "erbottxewat"));
        Assertions.assertEquals(false, Question1_9.isRotation("waterbottle", "waterbottl"));
    }
}
