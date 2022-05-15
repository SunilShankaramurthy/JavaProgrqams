package simplejavaprograms_1;

public class PatterK {
    public static void main(String[] args) {
        int i, j, n = 8;
        for (i = 0; i <= n; i++) {
            for (j = 0; j <= n ; j++) {
                if (j==0 || i<=n/2 && j==n/2-i || i>n/2 && j==i-1)
                    System.out.print("*");
                else
                    System.out.print(" ");
            }
            System.out.println();
        }
    }
}
