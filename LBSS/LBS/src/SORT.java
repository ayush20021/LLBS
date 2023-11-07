import java.util.Arrays;

public class SORT {

    public static void main(String[] args) {

        int []a= {5,4,9,2,1};
        sort(a,0,a.length-1);
        System.out.println(Arrays.toString(a));


    }


    static  void sort(int []a , int l, int r){

        if(l>=r){
            return;
        }

        int s= l;
        int e=r;
        int mid = s+(e-s)/2;
        int pivot = a[mid];


        while (s<=e){
            while (a[s] <pivot){
                s++;
            }
            while (a[e] >pivot){
                e--;
            }



            if(s<=e){
                int temp = a[s];
                a[s]=a[e];
                a[e]=temp;
                s++;
                e--;
            }
        }

        sort(a,l,e);
        sort(a,s,r);






    }
}
