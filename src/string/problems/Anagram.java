package string.problems;

//Created by mrahman on 04/22/17.
import java.util.Arrays;

public class Anagram {
    public static boolean isAnagram(String word1, String word2){
        char  firstWord [] = word1.toLowerCase().replaceAll("\\s+","").toCharArray();
        char  secondWord [] = word2.toLowerCase().replaceAll("\\s+","").toCharArray();

        Arrays.sort(firstWord);
        Arrays.sort(secondWord);

        return Arrays.equals(firstWord, secondWord);
    }
    public static void main(String[] args) {
        //Write a Java Program to check if the two String are Anagram. Two String are called Anagram when there is
        //same character but in different order.For example,"CAT" and "ACT", "ARMY" and "MARY".
        System.out.println(isAnagram("SchoolMaster","TheClassRooms"));

    }
}
