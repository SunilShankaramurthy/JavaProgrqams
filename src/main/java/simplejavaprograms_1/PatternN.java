package simplejavaprograms_1;

public class PatternN {
    public static void main(String[] args) {
        int i, j, n = 8;
        for (i = 0; i <= n; i++) {
            for (j = 0; j <= n ; j++) {
                if (j==0 || j==n || j==i)
                    System.out.print("*");
                else
                    System.out.print(" ");
            }
            System.out.println();
        }
    }
}
