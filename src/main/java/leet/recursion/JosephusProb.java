package leet.recursion;

public class JosephusProb {
    public static void main(String[] args) {
        // print the person who would be saved if n is the number of person and k is the position of person who would be killed
        int k = 2;
        int n = 5;
        System.out.println(josephus(n, k));
    }

    private static int josephus(int n, int k) {
        if (n == 1) {
            return n;
        }
        return (josephus(n - 1, k) + k) % n;
    }
}
