package cracking.the.code.interview.chapter1;

public class Question1_6 {

    public static String stringCompression(String stringToCompress) {

        //aabcccccaaa -> a2b1c5a3
        //If the "compressed" string would not become smaller than the original string, your method should return the original string
        StringBuilder compressedStr = new StringBuilder();
        int counter = 1;
        int index = 0;

        for (int i = 0; i < stringToCompress.length(); i++) {
            index++;
            if (index < stringToCompress.length() && stringToCompress.charAt(i) == stringToCompress.charAt(index)) {
                counter++;
            } else {
                compressedStr.append(stringToCompress.charAt(i));
                compressedStr.append(counter);
                counter = 1;
            }
        }

        if (compressedStr.length() > stringToCompress.length()) {
            return stringToCompress;
        }
        return compressedStr.toString();
    }
}
