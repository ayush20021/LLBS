import java.util.Arrays;


class A{


    int [] joinn_array( int a[] , int b[]){
        int pointer =0;
        int joined_array [] = new int[a.length+ b.length];
        int j=a.length;
        boolean status = false;
        if (a.length>b.length){
            status = true;
            pointer=a.length;
        }else {
            pointer=b.length;
        }
        for( int i = 0;i<pointer;i++){
            if(i<a.length){
                joined_array[i]=a[i];
            }
            if(i<b.length){
                joined_array[j+i]=b[i];
            }
        }
        return joined_array;

    }

    int [][] multply_array(int [][]a,int [][]b){
        int [][]c = new int[3][3];
        for (int i = 0;i<3;i++){

            for(int j=0;j<3;j++){

                c[i][j]=a[i][j]*b[i][j];
            }
        }

        return c;
    }

    int Sum_OF_Array(int []a, int b){

        if(b==a.length){
            return 0;
        }

        return a[b]+Sum_OF_Array(a,b+1);


    }

    int fibonacci(int a){

        if(a==0){
            return 0;
        } else if (a==1) {
            return 1;
        }else {

            return  fibonacci(a-1)+fibonacci(a+2);
        }


    }


//    int[] A_D(int []a){
//
//
//
//
//    }


}
public class Main {
    public static void main(String[] args) {
       int [] a1 = {1,1,1,1,1,1,1,1,1};
        int [] a2 = {101,201,301,401,501,601,4126};

        int[][] a5 = {{1,2,3,},{4,5,6},{7,8,9}};
        int[][] a4 = {{10,11,12,},{13,15,16},{17,18,19}};
        A a  = new  A();
        int counter= 0;
        int [] a3 = a.joinn_array(a1,a2);

        int [][]c = a.multply_array(a4,a5);
//        for (int i =0;i<3;i++){
//            for (int j = 0;j<3;j++){
//                if(counter%3 ==0){
//                    System.out.println();
//                }
//                System.out.print(c[i][j]+ " ");
//                counter++;
//
//
//            }
//        }

        int []a6={1,5,9,7,5,6,9,1,};
        System.out.println(a6.length/2);
        int add = a.Sum_OF_Array(a1,0);
        System.out.println(add);
        System.out.println(a.fibonacci(10));

    }


}