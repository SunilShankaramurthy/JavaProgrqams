package simplejavaprograms_1;

public class PatternV {
    public static void main(String[] args) {
        int i, j, n = 8;
        for (i = 0; i <= n; i++) {
            for (j = 0; j <= n ; j++) {
                if (i<=n/2&& j == i || i<=n/2&&j==n-i)
                    System.out.print("*");
                else
                    System.out.print(" ");
            }
            System.out.println();
        }
    }
}
