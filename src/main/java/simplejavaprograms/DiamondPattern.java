package simplejavaprograms;

public class DiamondPattern {
    public static void main(String[] args) {
        int n = 8;
        int j, i;
        int space = n - 1;

        for(i=1;i<=n;i++){
            for (j=1; j<=space; j++)
                System.out.print(" ");
            space--;
            for (j=1; j<=2*i-1; j++)
                System.out.print("*");
            System.out.println();
        }
        space=1;
        for (i=1; i<=n; i++){
            for (j=1; j<=space; j++)
                System.out.print(" ");
            space++;
            for (j=1; j<=2*(n-i)-1; j++)
                System.out.print("*");
            System.out.println();
        }
    }
}
