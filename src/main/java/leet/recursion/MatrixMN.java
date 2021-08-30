package leet.recursion;

public class MatrixMN {
    public static void main(String[] args) {

        System.out.println(pathCombination(3, 3));
    }

    private static int pathCombination(int m, int n) {
        if (m == 1 || n == 1)
            return 1;
        return pathCombination(m - 1, n) + pathCombination(m, n - 1);
    }
}
