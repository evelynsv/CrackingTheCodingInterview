package cracking.the.code.interview.chapter1;

public class Question1_9 {

    //String Rotation: Assume you have a method isSubstring which checks if one word is a substring of another. 
    //Given two substrings, s1 and s2, write a code to check if s2 is a rotation of s1 using only one call to isSubstring.
    //Ex "waterbottle" is a rotation of "erbottle waterbottle"
    //erbottlewaterbottle
    public static boolean isRotation(String s1, String s2) {

        if (s1.length() != s2.length()) return false;

        String word = s2 + s2;
        int index = word.indexOf(s1);
        
        if (index != -1) {
            return true;
        }
        return false;
    }
}
