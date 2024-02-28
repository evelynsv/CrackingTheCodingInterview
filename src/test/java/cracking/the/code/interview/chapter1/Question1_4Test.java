package cracking.the.code.interview.chapter1;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class Question1_4Test {

    @Test
    public void test() {

        Assertions.assertEquals(true, Question1_4.isPalindromePermutation("vaimimiav"));
        Assertions.assertEquals(true, Question1_4.isPalindromePermutation("Vaim miav"));
        Assertions.assertEquals(true, Question1_4.isPalindromePermutation("vaimxmiav"));
        Assertions.assertEquals(true, Question1_4.isPalindromePermutation("Tact Coa"));

        Assertions.assertEquals(false, Question1_4.isPalindromePermutation("vaimmiax"));
        Assertions.assertEquals(false, Question1_4.isPalindromePermutation("vaimm iax"));


        // // -------Map solution test-------------
        Assertions.assertEquals(true, Question1_4.isPalindromePermutationMap("Tact Coa"));
        Assertions.assertEquals(true, Question1_4.isPalindromePermutationMap("vaimimiav"));
        Assertions.assertEquals(true, Question1_4.isPalindromePermutationMap("Vaim miav"));
        Assertions.assertEquals(true, Question1_4.isPalindromePermutationMap("vaimxmiav"));

        Assertions.assertEquals(false, Question1_4.isPalindromePermutationMap("vaimmiax"));
        Assertions.assertEquals(false, Question1_4.isPalindromePermutationMap("vaimm iax"));
        
    }
}
