package cracking.the.code.interview.chapter1;

public class Question1_5 {

    public static boolean isOneOrZeroEditAway(String firstString, String secondString) {

        //Edits on strings: insert a char, remove a char or replace a char
        //check if the string is one edit (or zero) away.
        //Example
        //pale, ple -> true
        //pales, pale -> true
        //pale, bale -> true
        //pale, bake -> false
        
        if (firstString.equals(secondString)) {
            return true;
        }

        if (firstString.length() == secondString.length()) {
            return checkReplace(firstString, secondString);
        } else if (firstString.length() + 1 == secondString.length()) {
            return checkInsert(firstString, secondString);
        } else if (firstString.length() - 1 == secondString.length()) {
            return checkInsert(secondString, firstString);
        }
        return false;
    }

    private static boolean checkReplace(String firstString, String secondString) {
        boolean foundDiff = false;
        for (int i = 0; i < firstString.length(); i++) {
            if (firstString.charAt(i) != secondString.charAt(i)) {
                if (foundDiff) {
                    return false;
                }
                foundDiff = true;
            }
        }
        return true;
    }

    private static boolean checkInsert(String firstString, String secondString) {
        int index1 = 0;
        int index2 = 0;

        while (index2 < secondString.length() && index1 < firstString.length()) {
            if (firstString.charAt(index1) != secondString.charAt(index2)) {
                if (index1 != index2) {
                    return false;
                }
                index2++;
            } else {
                index1++;
                index2++;
            }
        }
        return true;
    }
}
