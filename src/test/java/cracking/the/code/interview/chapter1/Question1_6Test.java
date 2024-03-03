package cracking.the.code.interview.chapter1;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class Question1_6Test {

    @Test
    public void test() {

        Assertions.assertEquals("a2b1c5a3", Question1_6.stringCompression("aabcccccaaa"));
        Assertions.assertEquals("aabcccccaaaxzwp", Question1_6.stringCompression("aabcccccaaaxzwp"));
    }
}
