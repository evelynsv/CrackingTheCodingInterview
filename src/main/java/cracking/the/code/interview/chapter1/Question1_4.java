package cracking.the.code.interview.chapter1;

import java.util.HashSet;
import java.util.Set;

public class Question1_4 {

    public static boolean isPalindromePermutation(String stringToCheck) {

        //Palindrome: word or phrase that is same backwards and forwards. Ex. civic, kayak, madam, reviver, rotator, vaimxmiav
        //Permuation: rearrangement of letters
        //check if the word is a permutation of a palindrome
        // input: "Tact Coa" 
        // tcatcoa - tacocat
        // ignore space and case
       
        String stringWithoutSpaces = stringToCheck.toLowerCase().replaceAll("\\s", "");
        char[] stringCharArray = stringWithoutSpaces.toCharArray();
        char oddChar = ' ';
        
        if ((stringCharArray.length % 2) == 0) {
            return isPalindrome(stringCharArray, false, oddChar);
        } else {
            int sameCharCount = 0;
            for (char c : stringCharArray) {
                for (int i = 0; i < stringCharArray.length; i++) {
                    if (c == stringCharArray[i]) {
                        sameCharCount++;
                    }
                }
                if ((sameCharCount % 2) != 0) {
                    oddChar = c;
                    return isPalindrome(stringCharArray, true, oddChar);
                }
                sameCharCount = 0;
            }
            return false;
        }
    }

    private static boolean isPalindrome(char[] stringCharArray, boolean isOdd, char oddChar) {
        Set<Character> charSet = new HashSet<>();
        int newSize = stringCharArray.length;

        for (int i = 0; i <= stringCharArray.length - 1; i++) {
            if (isOdd && stringCharArray[i] == oddChar) {
                newSize--;
            } else {
                charSet.add(stringCharArray[i]); 
            }
        }

        if (charSet.size() == newSize / 2) {
            return true;
        } else {
            return false;
        }
    }
}
