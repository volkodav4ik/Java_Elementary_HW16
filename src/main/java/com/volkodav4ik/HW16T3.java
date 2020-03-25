package com.volkodav4ik;

import java.util.HashSet;
import java.util.Set;

public class HW16T3 {

    private static final String[] MORZE_ALPHABET = new String[]{".-", "-...", "-.-.", "-..", ".", "..-.", "--.", "....", "..",
            ".---", "-.-", ".-..", "--", "-.", "---", ".--.", "--.-", ".-.",
            "...", "-", "..-", "...-", ".--", "-..-", "-.--", "--..", ""};
    private static final int DIFFERENCE_OF_INDEX = 97;
    private static final int MORZE_MEANING_OF_SPACE = 26;
    private static final int CHAR_MEANING_OF_SPACE = 32;

    public static void main(String[] args) throws Exception {
        String[] words = new String[]{"Gin", "zEn", "gi G", "msg"};
        int result = uniqueMorseRepresentations(words);
        System.out.println("Result of transformation: " + result);
    }

    public static int uniqueMorseRepresentations(String[] words) throws Exception {
        if (words == null) {
            throw new Exception("Input Data is empty");
        }
        Set<String> morze = new HashSet<>();
        for (String word : words) {
            StringBuilder tmp = new StringBuilder();
            String tmpStr = word.toLowerCase().trim();
            for (int j = 0; j < tmpStr.length(); j++) {
                tmp.append(MORZE_ALPHABET[getIndexOfLetter(tmpStr.charAt(j))]);
            }
            morze.add(tmp.toString());
        }
        return morze.size();
    }

    private static int getIndexOfLetter(char index) {
        if (index == CHAR_MEANING_OF_SPACE) {
            return MORZE_MEANING_OF_SPACE;
        } else {
            return index - DIFFERENCE_OF_INDEX;
        }
    }
}
