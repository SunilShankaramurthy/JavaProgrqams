package simplejavaprograms;

public class fibonaci2 {
    public static void main(String[] args){
        int n=10;
        int t1 = 0, t2=1;
        while(t1<=n){
            System.out.print(t1+"+");
            int temp=t1+t2;
            t1=t2;
            t2=temp;
        }
    }
}
