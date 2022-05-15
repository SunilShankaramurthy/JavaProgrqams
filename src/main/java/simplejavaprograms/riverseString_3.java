package simplejavaprograms;

public class riverseString_3 {
    public static void main(String[] args){
        String text= "Sunil Lakshmi";
        String reverseText="";

        for (int i=text.length()-1;i>=0;i--){
            reverseText=reverseText+text.charAt(i);
        }
        System.out.println(reverseText);

    }
}
