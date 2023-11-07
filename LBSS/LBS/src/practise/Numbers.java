package practise;

public class Numbers {

    static  void  Amstromnumber(int a){

        double total=0;

        while (a>0){
            double temp = a%10;
            temp = Math.pow(temp,3);
            total=total+temp;
            a=a/10;

        }
        System.out.println(total);
    }

    static  void Power_of_number(int a,int b){
        double number=0;
        for (int i = 1;i<=b;i++){
            int temp = a*a;
            number=number+temp;
        }

    }


    static  void palandrome(int a){
        int  number =0;
        while (a>0){
            int temp = a%10;
            number=number*10+temp;
            a=a/10;

        }

    }


    static  void  Perfect_Square(int a){
        if(a <0){
            System.out.println("NO");
        }

        int sqrt = (int) Math.sqrt(a);

        if(sqrt*sqrt == a){
            System.out.println("Yes");
        }else {
            System.out.println("NO");
        }


    }

    static  void Sum_of_Odd_Number(int a){

        int number = 0;
        while (a>0){
            int temp= a%10;
            if(temp%2!=0){
                number=number+temp;
            }
            a=a/10;

        }
        System.out.println(number);

    }

    static void  decimal_to_Binary(int a){
        int [] binary=new int[40];
        int counter = 0;
        while (a>0){
            binary[counter++]=a%2;
            a=a/10;


        }
        for (int i = counter-1;i>=0;i--){
            System.out.println(binary[i]);
        }

    }

   static int factorial(int a){
        if(a ==0){
            return 1;
        }

        return a*factorial(a-1);
   }

    static void strong_number(int a){
        int original_number= a;
        int number = 0;
        while (a>0){
            int temp =a%10;
            number+=factorial(temp);
            a=a/10;

        }
        if(original_number==number){
        System.out.println("Strong Number");}else {
            System.out.println("Not a strong Number");
        }




    }


    static  void    Perfect_Number(int a){
        int sum=0;
        for (int i =1 ;i<=a/2;i++){
            if(a%i==0){
                sum+=i;
            }
        }
        if(a==sum){
            System.out.println("Perfect Number");
        }else {
            System.out.println("Not a perfect Number");
        }
    }

    static int Sum_of_digit(int a){

        if(a==0){
            return  0;
        }else {

        return  (a%10+Sum_of_digit(a/10));

        }

    }

    static void quradic_eq(double a, double b, double c){
        double dis = b * b -4 * a * c;
        if(dis>0){
            double r1 = (-b+Math.sqrt(dis))/(2*a);
            double r2 = (-b-Math.sqrt(dis))/(2*a);
            System.out.println(r1 +" and "+ r2);
        }
        if(dis ==0){
            double r1 = -b/(2*a);
            System.out.println(r1);
        }
        if(dis<0){
            double r1 = -b/(2*a);
            double r2 = (Math.sqrt(-dis))/2*a;
            System.out.println(r1);
            System.out.println(r2);
        }


    }

    static  int Natural_Numbers_Addition(int a){

        if(a==1){
            return   1;
        }

        return a+Natural_Numbers_Addition(a-1);
    }


    static  void  Decimal_to_Binary(long binary){
        int decimal = 0;
        int power = 0;

        while (binary != 0) {
            long lastDigit = binary % 10;
            decimal += (int) (lastDigit * Math.pow(2, power));
            power++;
            binary /= 10;
        }

        System.out.println(decimal);


    }

     static boolean isPrime(int number) {
        if (number <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }
    static  void  sum_of_prime(int a, int b){
        int total=0;
        for (int i = a;i<=b;i++){
            if(isPrime(i)){
              total=total+i;
            }
        }
        System.out.println(total)
        ;
        
    }

    public static void main(String[] args) {
       // Amstromnumber(153);
       // Power_of_number(3,3);
       // palandrome(121);
       // Perfect_Square(25);
       // Sum_of_Odd_Number(1249);
       // decimal_to_Binary(25);
       // strong_number(145);
       // Perfect_Number(28);
       // System.out.println(Sum_of_digit(125));
       // System.out.println(Natural_Numbers_Addition(5));
       // Decimal_to_Binary(10101);
       // sum_of_prime(1,20);
        quradic_eq(5,85,9);


    }

}
