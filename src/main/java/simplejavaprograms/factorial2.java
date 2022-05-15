package simplejavaprograms;

public class factorial2 {
    public static void main(String[] args){
        int n=5;
   System.out.println(fact(n));
    }
    public static int fact(int n){
        if (n==1)
            return n;
        return fact(n-1)*n;
    }
}
