package simplejavaprograms;

import java.util.Arrays;

public class ReverseStringWords {
    public static void main(String[] args) {
        String text = "Sunil Lakshmi Kantha";
        String reverseText = "";
        String reverseText1 = "";

        String[] word = text.split(" ");
        for(int i= word.length-1; i>=0;i--)
            reverseText=reverseText+" "+word[i];
        System.out.println("reserseString="+reverseText);
      //  StringBuilder sb = new StringBuilder(reverseText);
     //   sb.reverse();
    //    reverseText1 += sb.toString() + " ";
        word=reverseText.split(" ");
        //System.out.println("reserseString="+reverseText);
        for (String words : word) {
            StringBuilder sb = new StringBuilder(words);
            sb.reverse();
            reverseText1 += sb + " ";


        }
        System.out.println(reverseText1);
    }
}
