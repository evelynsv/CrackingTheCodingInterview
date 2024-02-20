package cracking.the.code.interview.chapter1;

public class Question1_2 {

    // Time complexity: O(n^2)
    public static boolean checkPermutation(String firstWord, String secondWord) {
        if ((firstWord.length() != secondWord.length()) || (firstWord.equals(secondWord))) {
            return false;
        }

        int contains = 0;

        //toCharArray method copies the contents of string to a new char array, hence O(n)
        char[] firstArrayChar = firstWord.toCharArray();

        for (char c : firstArrayChar) {
            for (int i = 0; i < secondWord.length(); i++) {
                if (c == secondWord.charAt(i))
                contains++;
            }
            if (contains == 0)
            return false;
        }
        return true;
    } 
}
