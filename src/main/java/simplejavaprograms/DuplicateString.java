package simplejavaprograms;

import com.sun.corba.se.impl.orbutil.graph.GraphImpl;

import java.util.*;

public class DuplicateString {
    public static void main(String[] args){
        String word= "suhasini";
        LinkedHashSet<Character> set=new LinkedHashSet<>();
        for (int i=0;i<=word.length()-1;i++)
            set.add(word.charAt(i));

        for (Character ch:set)
            System.out.print(ch);

        System.out.println();
        String words= "suhasini sunil suhasini";
        String[] s=words.split(" ");
        LinkedHashSet<String> stringSet=new LinkedHashSet<>();
        for (int i=0;i<=s.length-1;i++)
            stringSet.add(s[i]);

        for (String ch:stringSet)
            System.out.print(ch+" ");


    }

}
