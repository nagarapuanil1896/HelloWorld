package com.practice;
/*Given a string s, find the length of the longest
        substring
        without repeating characters.

        Example 1:

        Input: s = "abcabcbb"
        Output: 3
        Explanation: The answer is "abc", with the length of 3.
        Example 2:

        Input: s = "bbbbb"
        Output: 1
        Explanation: The answer is "b", with the length of 1.
        Example 3:

        Input: s = "pwwkew"
        Output: 3
        Explanation: The answer is "wke", with the length of 3.
        Notice that the answer must be a substring, "pwke" is a subsequence and not a substring.

        Constraints:

        0 <= s.length <= 5 * 104
        s consists of English letters, digits, symbols and spaces.*/
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class LongestSubstringLength {

    public static int lengthOfLongestSubstring(String s) {
        Set<Character> charSet = new HashSet<>();
        int maxLength = 0;
        int left = 0;

        for (int right = 0; right < s.length(); right++) {
            while (charSet.contains(s.charAt(right))) {
                charSet.remove(s.charAt(left));
                left++;
            }

            charSet.add(s.charAt(right));
            maxLength = Math.max(maxLength, right - left + 1);
        }

        return maxLength;

    }

    public static int lengthOfLongestSubstring_1(String s) {
        Map<Character,Integer> map = new HashMap<>();
        int start = 0;
        int maxLength = 0;
        for(int end = 0; end < s.length(); end++){
            char rightChar = s.charAt(end);
            if(map.containsKey(rightChar)){
                start = Math.max(start,map.get(rightChar)+1);
            }
            map.put(rightChar,end);
            maxLength = Math.max(maxLength,end-start+1);
        }
        return maxLength;
    }

    public static void main(String[] args) {
        // Test cases
        System.out.println(lengthOfLongestSubstring("abcabcbb"));  // Output: 3
        System.out.println(lengthOfLongestSubstring("bbbbb"));     // Output: 1
        System.out.println(lengthOfLongestSubstring("pwwkew"));    // Output: 3

        // Test cases
        System.out.println(lengthOfLongestSubstring_1("abcabcbb"));  // Output: 3
        System.out.println(lengthOfLongestSubstring_1("bbbbb"));     // Output: 1
        System.out.println(lengthOfLongestSubstring_1("pwwkew"));    // Output: 3
    }
}
