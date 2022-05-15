package simplejavaprograms;

public class ReverseString {
    public static void main(String[] args) {
        String input = "Geeks for Geeks";
        byte[] strAsByteArray = input.getBytes();
        byte[] result = new byte[strAsByteArray.length];
        for (int i = 0; i < strAsByteArray.length; i++)
            result[i]=strAsByteArray[strAsByteArray.length-i-1];
        System.out.println(new String(result));

        byte[] strAsByteArray1=input.getBytes();
        byte[] result1=new byte[strAsByteArray1.length];
        for ( int j=0;j<=strAsByteArray1.length-1; j++)
            result1[j]=strAsByteArray1[strAsByteArray1.length-j-1];
        System.out.println(new String(result1));
    }


}
