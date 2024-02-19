package cracking.the.code.interview.chapter1;

import java.util.HashSet;
import java.util.Set;

public class Question1_1 {

    public static Boolean isUnique(String word) {
        int charDiffValue = 0;
        char initialChar = ' ';

        for (int i = 0; i <= word.length() - 1; i++) {
            int diff = Character.compare(initialChar, word.charAt(i));
            charDiffValue = charDiffValue + diff;
            initialChar = word.charAt(i);
        }

        if (charDiffValue > 0) {
            return true;
        } else {
            return false;
        }
    }

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
