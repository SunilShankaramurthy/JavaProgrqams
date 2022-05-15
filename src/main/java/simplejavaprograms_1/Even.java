package simplejavaprograms_1;

public class Even {
    public static void main(String[] args){
        String sentence="He is super";
        String[] sent = sentence.split(" ");
        String temp = null;
        int t = 0;
        int i=0;
        for (i=0;i<sent.length;i++) {
          //  System.out.println(sent[i]);
            if(sent[i].length()%2==0){

                if (sent[i].length()>t){
                    t=sent[i].length();
                    temp=sent[i];}
            }
        }
        System.out.println(temp);
        }



}
