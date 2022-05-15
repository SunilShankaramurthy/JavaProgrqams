package simplejavaprograms;

import javax.xml.transform.stream.StreamSource;
import java.util.SortedSet;

public class fibonacci {
    public static void main(String[] args){
        int t1=0;
        int t2=1;
        int n=100;
        while (t1<=n){
            System.out.print(t1+"+");
            int sum=t1+t2;
            t1=t2;
            t2=sum;
        }

    }

}
