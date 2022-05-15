package simplejavaprograms_1;

public class PatterZ {
    public static void main(String[] args) {
        int i, j, n = 8;
        for (i = 0; i <= n; i++) {
            for (j = 0; j <= n ; j++) {
                if (i==0 || i==n  || j ==n-i )
                    System.out.print("*");
                else
                    System.out.print(" ");
            }
            System.out.println();
        }
    }
}
