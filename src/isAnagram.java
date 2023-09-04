import java.util.Arrays;
import java.util.Scanner;
import java.io.*;
 public class isAnagram {
     public static boolean areAnagrams(String word1, String word2) {
         // Remove spaces and convert to lowercase for case-insensitive comparison
         word1 = word1.replaceAll("\\s", "").toLowerCase();
         word2 = word2.replaceAll("\\s", "").toLowerCase();

         // Check if the lengths of the words are equal
         if (word1.length() != word2.length()) {
             return false;
         }

         // Convert the words to character arrays and sort them
         char[] charArray1 = word1.toCharArray();
         char[] charArray2 = word2.toCharArray();

// YO YO YO
         Arrays.sort(charArray1);
         Arrays.sort(charArray2);

         // Compare the sorted character arrays
         return Arrays.equals(charArray1, charArray2);
     }

     public static void main(String[] args) {
         String word1 = "listen";
         String word2 = "silen";


         if (areAnagrams(word1, word2)) {
             System.out.println(word1 + " and " + word2 + " are anagrams.");
         } else {
             System.out.println(word1 + " and " + word2 + " are not anagrams.");
         }
     }
 }
