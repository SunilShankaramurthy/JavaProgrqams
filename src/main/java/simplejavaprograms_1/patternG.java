package simplejavaprograms_1;

public class patternG {
    public static void main(String[] args) {
        int i, j, n = 8;
        for (i = 0; i <= n; i++) {
            for (j = 0; j <= n / 2; j++) {
                if (( i==0 ||i == n) && j!=0 && j!=n/2 || (i!=0 &&i!=n && j==0) || i==n/2  ||
                i>n/2 && i<n && j==n/2 || i==1 && j==n/2 )
                    System.out.print("*");
                else
                    System.out.print(" ");
            }
            System.out.println();
        }
    }
}
