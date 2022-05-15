package simplejavaprograms;

import java.util.ArrayList;

public class ReverseString2 {
    public static void main(String[] args) {
        String word = "rahul sunilharish";
       String reverse="";
        for (int i = word.length() - 1; i >= 0; i--) {
           // System.out.println(word.charAt(i));
            reverse=reverse+word.charAt(i);
        }
        System.out.println(reverse);
    }
}
