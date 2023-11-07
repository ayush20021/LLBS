public class Recursuin {


    public static void main(String[] args) {



        print(1);
        System.out.println(fatroial(6));





    }

     static int fatroial(int i) {

        if(i == 0){
            return 1;
        }else {


            return  i * (fatroial(i-1));

        }



     }

    static void print(int i) {

        if(i>=5){
            System.out.println(i);
        return;}
        System.out.println(i);
        print(i+1);
    }


}
