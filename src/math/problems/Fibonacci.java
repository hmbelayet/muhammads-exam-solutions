package math.problems;

public class Fibonacci {
    public static void main(String[] args) {
/*
Write 40 Fibonacci numbers with java.
*/
        int n, a = 0, b = 0, c = 1;
        System.out.print("40 Fibonacci numbers: ");
        for(int i = 1; i <= 40; i++)
        {
            a = b;
            b = c;
            c = a + b;
            System.out.print(a+", ");
        }

    }
}