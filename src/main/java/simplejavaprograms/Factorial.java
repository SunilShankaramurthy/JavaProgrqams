package simplejavaprograms;

import java.util.Scanner;

public class Factorial {
    public static void main(String[] args){
        System.out.println("Enter a number to find the factorial: ");
        Scanner scan=new Scanner(System.in);
        int num=scan.nextInt();
        int factorial=fact(num);
        System.out.println("Factorial of entered number is : "+factorial);
    }
    static int fact(int num){
        if (num==1)
            return 1;
        return fact(num-1)*num;
    }
}
