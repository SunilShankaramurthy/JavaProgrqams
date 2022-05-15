package simplejavaprograms;

import java.nio.charset.Charset;

public class Palindormep2 {
    public static void main(String[] args) {
        String word = "RACECAR";
        int len = word.length() - 1;
        boolean result=true;

        for (int i = 0; i <= word.length()/2 - 1; i++) {
            if (word.charAt(i) != word.charAt(len - i)) {
                result=false;
                System.out.println("The word %s is not a Palindorm "+ word);
                break;
            }
        }
        if(result)
            System.out.println("The word '%s' is a Palindorm "+ word);

    StringBuffer stringBuffer=new StringBuffer(word).reverse();
    if (stringBuffer.toString().equals(word))
        System.out.println("The word '%s' is a Palindorms "+ word);
    else
        System.out.println("The word '%s' is not a Palindorms "+ word);
    }

}
