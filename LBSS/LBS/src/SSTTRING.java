import java.util.Arrays;

public class SSTTRING {

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
   	
  

    public static void main(String[] args) {
//        String a=" HII HOW ARE YOU GUYZ";
//        StringBuilder s = new StringBuilder();
//
//
//
//        for(int i=0;i<a.length();i++){
//            if(a.charAt(i)!=' '){
//                s.append(a.charAt(i));
//            }
//
//        }
//
//        a=s.toString();
//        System.out.println(s);
//        String ab1 = " Hello hi";
//        int i=0;
//
//        while (true){
//
//            if(ab1.charAt(i)=='\0'){
//                System.out.println("HII");
//            }
//            i++;
//
//        }
//        System.out.println();
//        System.out.println(cccc);
        String a1=" Hello how are you ";
        reverse_word(a1);
        
        int digits [] = {1,2,9};
        int n=digits[digits.length-1]+1;
        System.out.println(n);
        if(n>9){
        	digits[digits.length-2]=1;
        	digits[digits.length-1]=0;
        }
        System.out.println(Arrays.toString(digits));
        

    }
}
