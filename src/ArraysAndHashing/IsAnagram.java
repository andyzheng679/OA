package ArraysAndHashing;

import java.util.Arrays;

public class IsAnagram {
//    Is Anagram
//    Given two strings s and t, return true if the two strings are anagrams of each other, otherwise return false.
//
//    An anagram is a string that contains the exact same characters as another string, but the order of the characters can be different.
//
//    Example 1:
//    Input: s = "racecar", t = "carrace"
//    Output: true
//
//    Example 2:
//    Input: s = "jar", t = "jam"
//    Output: false

    public static boolean isAnagram(String s, String t){
        if(s.length() != t.length()){
            return  false;
        }

        char[] stringS = s.toLowerCase().toCharArray();
        char[] stringT = t.toLowerCase().toCharArray();

        Arrays.sort(stringS);
        Arrays.sort(stringT);

        return Arrays.equals(stringS, stringT);


    }
}
