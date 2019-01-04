package string.problems;

/**
 * Created by mrahman on 04/22/17.
 */
public class Permutation {

    public static void main(String[] args) {
        /*
         * Permutation of String "ABC" is "ABC" "BAC" "BCA" "ACB" "CAB" "CBA".
         * Write Java program to compute all Permutation of a String
         *
         */
        permutation("123");
    }

    public static void permutation(String input) {
        permutation("", input);

    }
    private static void permutation(String perm, String word) {
        if(word.isEmpty()) {
            System.err.println(perm + word);
        } else {
            for (int i = 0; i<word.length(); i++) {
                permutation(perm + word.charAt(i), word.substring(0,i) + word.substring(i + 1, word.length()));
            }
        }
    }
}