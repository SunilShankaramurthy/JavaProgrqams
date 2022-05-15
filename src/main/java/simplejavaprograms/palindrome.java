package simplejavaprograms;

public class palindrome {
    public static void main(String[] args){
       String input="RACECAR";
       checkPalindrome(input);
    }
    static void checkPalindrome(String input){
        boolean result=true;
        int length=input.length();
        int l=length-1;
        System.out.println("length of the given string is "+length);
        System.out.println("first char of the given string is "+input.charAt(0));
        System.out.println("last char of the given string is "+input.charAt(length-1));
        for(int i=0;i<=length/2;i++){
            if (input.charAt(i) != input.charAt(length-i-1)){
                result=false;
                break;
            }
        }
        System.out.println(input+ " is a palindrome =" +result);
    }

}
