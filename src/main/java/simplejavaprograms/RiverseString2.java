package simplejavaprograms;

import java.io.BufferedReader;
import java.util.Arrays;

public class RiverseString2 {
    public static void main(String[] args){
        String input="Sunil Anil";
        String[] in=input.split(" ");
        System.out.println(in.length);
        StringBuffer stringBuffer=new StringBuffer(input);
        System.out.println(stringBuffer.reverse());
        for(int i=in.length-1;i>=0;i--){
            System.out.print(in[i]);
        }
    }
}
