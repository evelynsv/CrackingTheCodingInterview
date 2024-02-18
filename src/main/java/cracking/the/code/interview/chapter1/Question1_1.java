package cracking.the.code.interview.chapter1;

public class Question1_1 {

    public static Boolean isUnique(String word) {
        Character startChar = ' ';
        for (int i = 0; i <= word.length() - 1; i++) {                     
            int compareResult = Character.compare(startChar, word.charAt(i));
            startChar = word.charAt(i);
            if (compareResult == 0) {
                return false;
            }
        }	
        return true;
    }
}
