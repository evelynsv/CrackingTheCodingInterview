package cracking.the.code.interview.chapter1;

import java.util.HashSet;
import java.util.Set;

public class Question1_1 {

    // Solution without using additional data structure
    // Time Complexity O(n^2)
    public static boolean isUnique(String word) {
    int numberOfEqualChars = 0;

        for (int i = 0; i < word.length(); i++) {
            char charToCompare = word.charAt(i);
            for (int j = 0; j < word.length(); j++) {
                int diff = Character.compare(charToCompare, word.charAt(j));
                if (diff == 0) {
                    numberOfEqualChars++;
                }
            }
        }
        if ((numberOfEqualChars - word.length()) > 0) {
            return false;
        } else {
            return true;
        }
    }
        
        //----------Book solution to understand later-------------

        // int checker = 0;
        
        // for (int i = 0; i < word.length(); i++) {
        //     int val = word.charAt(i) - 'a';
        //     if ((checker & (1 << val)) > 0) {
        //         return false;
        //     }
        //     checker |= (1 << val);
        // }
        // return true;
    

    // Solution using Set data structure
    // Time Complexity = O(n)
    static Boolean isUniqueSet(String word) {
        Set<Character> charSet = new HashSet<Character>();
    
        for (int i = 0; i <= word.length() - 1; i++) {
            charSet.add(word.charAt(i));
        }
        
        if (charSet.size() < word.length()) {
            return false;
        } else {
            return true;
        }
    }
}
