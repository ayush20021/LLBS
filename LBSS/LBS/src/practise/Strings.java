package practise;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

public class Strings {

    static  void  Q80(String  a){
        StringBuilder s1 = new StringBuilder();
        for (int i =0;i<a.length();i++){
            if(a.charAt(i)!=' '){
                s1.append(a.charAt(i));
            }
        }
        System.out.println(s1);
    }

    static void reverse_word(String a){
        StringBuilder s = new StringBuilder();
        String updated_string=" ";
        int counter=0;
        int l=0;
        boolean status = false;
        for ( int i =0; i<a.length();i++) {
            if(a.charAt(i)==' '){
                status = true;
            }
            counter=i;
            if(status) {
                while (counter!=l) {
                    counter--;
                    s.append(a.charAt(counter));
                }
                l=i;
            }
            if(status){
                s.append(a.charAt(i));
                status = false;
            }
        }
        updated_string=s.toString();
        System.out.println(updated_string);
    }


    static  void  Q93(String a){
        char c[] = a.toCharArray();
        int b = c.length;
        char temp;
        for (int i = 0;i<b-1;i++){
            for (int j = 0;j<b-i-1;j++){
                if(c[j]>c[j+1]){
                    temp = c[j];
                    c[j]=c[j+1];
                    c[j+1]=temp;
                }
            }
        }

        System.out.println(Arrays.toString(c));


    }


   static void  Palandrome(String a){
        String b="";
        for (int i=a.length()-1;i>=0;i--){
            b += a.charAt(i);
        }

        if(a.equals(b)){
            System.out.println("Y");
        }else {
            System.out.println("N");
        }
   }

    static  void  Find_length(String a){
        char c [] = a.toCharArray();
        int count=0;
        for (int i=0;i<c.length;i++){
            count++;
        }
        System.out.println(count);
    }


        static  void  COUNTER(String a){
            int counter = 0;
            a=a.trim();
            for (int i=0;i<a.length();i++){
                if(a.charAt(i)==' '){
                    counter++;
                }
            }
            System.out.println(counter+1);
        }


        static  void Vovel_counter(String  a){
        int count=0;
        a=a.toLowerCase();
        for (int i=0;i<a.length();i++){
            if(a.charAt(i)=='a'||a.charAt(i)=='e'||a.charAt(i)=='i'||a.charAt(i)=='o'||a.charAt(i)=='u'){
                count++;
            }
        }
            System.out.println(count);

        }


        static  void SUBSTRING(String a,String c){
        a=a.toLowerCase();
        int count=0;
        String[] b =a.split(" ");
            for (String s : b) {
                if (s.equals(c)) {
                    count++;
                }
            }

            System.out.println(count);

        }


        static void reverse_wordV1 (String a){
        String []  without_space =a.split(" ");
        StringBuilder final_string = new StringBuilder(a.length());
        for (int i = 0;i< without_space.length;i++){
            String b= without_space[i];
            int length=b.length()-1;
            StringBuilder reversed_word = new StringBuilder();
            while (length>=0){
                reversed_word.append(b.charAt(length));
                length--;
            }
            final_string.append(" ");
            final_string.append(reversed_word);

        }
           System.out.println(final_string);
        }

        static void counter(String  a){
        StringBuilder repeted_chracters = new StringBuilder(a.length());
            Set<Character> words =new HashSet<>(a.length());
            for (int i=0;i<a.length();i++){
                if(words.contains(a.charAt(i))){
                    String ch = Character.toString(a.charAt(i));
                    if(repeted_chracters.indexOf(ch)<0){
                        repeted_chracters.append(a.charAt(i));
                    }
                }else {
                    words.add(a.charAt(i));
                }
            }
            System.out.println(repeted_chracters);
        }



        static void first_Unique(String a){
        StringBuilder Unoque_Character = new StringBuilder(a.length());
        for (int i =0;i<a.length();i++){
            String ch = Character.toString(a.charAt(i));
            if(Unoque_Character.indexOf(ch)<0){
                Unoque_Character.append(a.charAt(i));
            }
        }
            System.out.println(Unoque_Character.charAt(0));
        }

        static  void  caplize(String a){
        StringBuilder final_String = new StringBuilder(a.length());
        StringBuilder word = new StringBuilder(a.length());
        String []words_without_space =a.split(" ");
            for (String temp : words_without_space) {
                if (temp.length() == 1) {
                    char c = Character.toUpperCase(temp.charAt(0));
                    word.append(c);
                } else {
                    int final_length = temp.length() - 1;
                    char c = Character.toUpperCase(temp.charAt(0));
                    char c2 = Character.toUpperCase(temp.charAt(final_length));
                    word.append(temp);
                    word.setCharAt(0, c);
                    word.setCharAt(final_length, c2);
                }
                final_String.append(word);
                final_String.append(" ");
                word.setLength(0);

            }
            System.out.println(final_String);
        }














    public static void main(String[] args) {
        String a = " Hello I am Ayush ";
//        //Q80(a);
//        reverse_word(a);
//        String b ="Ayush";
//        Q93(b);
  //      Palandrome("rapr");

//        Find_length("Ayush");
       // COUNTER("Hello h Hii ");
      //  Vovel_counter("Ayush");
       // SUBSTRING("innovation drives businesses to foster innovation, leading to innovative solutions and innovative,","innovation");
        //reverse_wordV1(a);
       // counter("aay");
        String input1 = "abcdefghi";
        first_Unique(input1);
        String input2 = "aabbccdde";
        first_Unique(input2);
        String input3 = "aabbcc";
        first_Unique(input3);
//        String input5 = "";
//        first_Unique(input5);
     //   String input4 = "a! b!c";
      //  first_Unique(input4);
        caplize("Hello hoe are you");



    }


}
public static void main(String[] args) {
    String str = "aaaaaakaaaaaa";
    int count = 0;

    for (int i = 0; i < str.length(); i++) {
        char currentChar = str.charAt(i);
        boolean isUnique = true;

        for (int j = 0; j < str.length(); j++) {
            if (i != j && currentChar == str.charAt(j)) {
                isUnique = false;
                break;
            }
        }

        if (isUnique) {
            System.out.println(currentChar);
            count++;
            break;
        }
    }

    if (count == 0) {
        System.out.println("No unique characters found.");
    }
}
