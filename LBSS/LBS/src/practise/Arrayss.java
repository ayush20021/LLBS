package practise;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import java.util.*;
public class Arrayss {

    public  static void SORT(int []a ,int l,int r){
        if(l>=r){
            return;
        }
        int s= l;
        int e=r;
        int mid = s+(e-s)/2;
        int pivot = a[mid];
        while(s<=e){
            while(a[s]<pivot){
                s++;
            }
            while (a[e]>pivot){
                e--;
            }
            if(s<=e){
                int temp=a[s];
                a[s]=a[e];
                a[e]=temp;
                s++;
                e--;
            }
        }
        SORT(a,l,e);
        SORT(a,s,r);
    }


    static  void Q35First_haf_in_Assending_secon_haf_in_decending(int []a){
        SORT(a,0,a.length-1);
        System.out.println(Arrays.toString(a));
        int mid = a.length/2;
        int []b = new int[a.length];
        int j =a.length-1;
        System.out.println(mid);
        for (int i =0 ;i<=mid;i++){
            b[i]=a[i];
        }
        for (int i =mid;i< a.length;i++){
            b[i]=a[j];
            j--;
        }

        System.out.println(Arrays.toString(b));
    }

    static void array_without_dublicate(Integer []a){
        Set<Integer> b = new HashSet<>(Arrays.asList(a));
        Integer[] c = b.toArray(new Integer[0]);
        System.out.println(Arrays.toString(c));
    }

    static  void Q66(int []a){
        int [] b = new int[a.length];
        int odd= 1;
        int even=0;
        for (int i=0;i<a.length;i++){
            if(a[i]>0){
                b[even]=a[i];
                even+=2;
            }else {
                b[odd]=a[i];
                odd+=2;
            }
        }

        System.out.println("Sorted  Array : "+Arrays.toString(b));


    }


    static  void Q67(int [][]a){
        int row =a.length;
        int colom = a[0].length;
        int[]b = new int[row*colom];
        int counter = 0;
        for (int i=0;i<a.length;i++){
            for (int j =0;j<a.length;j++){
                b[counter++]=a[i][j];
            }
        }
        int ans1= 0;
        if(counter%2==0){
            int mid = counter/2;
             ans1 = b[mid]+b[mid-1]/2;
        }else {
            int mid = counter/2;
             ans1=b[mid];
        }
        System.out.println(ans1);
    }

    static  void  Q68(int []a, int []b){
        Set<Integer> U = new HashSet<>();
        int total =a.length+b.length;
        int b1 = a.length;
        for (int i = 0;i<total;i++){
            if(i <a.length) {
                if (!U.contains(a[i])) {
                    U.add(a[i]);
                }
            }
            if(i <b.length) {
                if (!U.contains(b[i])) {
                    U.add(b[i]);
                }
            }
        }
        System.out.println("Union is : "+U);
        // INtersection
        int c = b.length;
        int a1=a.length;
        int a2=b.length;
        if(a.length>b.length){
            c=a.length;
        }
        int [] b3 = new int [c];
        int i = 0, j = 0, k = 0;
        while (i<a1 && j<a2){
            if(a[i]<b[j]){
                i++;
            }
            if(a[i]>b[j]){
                j++;
            }
            if(a[i]==b[j]){
                b3[k++]=a[i];
                i++;
                j++;
            }
        }
        System.out.print("Intersection are : ");
        for (int x =0;x<k;x++){                              // Only for Printing values
            System.out.print(b3[x]+" ");
        }
    }

    static  boolean amagram(String a, String b){
        StringBuilder b1 = new StringBuilder(a);
        String s1 = "";
        if(a.length()!=b.length()){
            return  false;
        }else {
            for(int i= 0;i<b.length();i++){
                s1 = Character.toString(b.charAt(i));       // Typecasting character to string
                if(b1.lastIndexOf(s1)<0){                   // if -1 then value is not present
                    return  false;
                }
            }
        }
        return true;
    }

    public static void main(String[] args) {

       // Integer[] a = {5,7,8,9,5,6,6,3,1};
       // int [] b={-2,-3,1,-1,2,-8,6,10};
        //SORT(a,0,a.length-1);


       // Q35First_haf_in_Assending_secon_haf_in_decending(a);
      //  array_without_dublicate(a);
       // System.out.println("Current Array : "+Arrays.toString(b));
      //  Q66(b);
       // System.out.println(Arrays.toString(b));
       // int [][] c= {{1,2,3},{4,5,6},{7,8,9}};
       // Q67(c);

//        int[] a1 = {1, 3, 3, 5, 7, 9};
//        int[] a2 = {3, 4, 5, 5, 5, 6, 7};
//        System.out.println("Given Array1 :"+Arrays.toString(a1));
//        System.out.println("Given Array2 :"+Arrays.toString(a2));
//        Q68(a1,a2);
       if( amagram("tab","bat")){
           System.out.println("Yes");
       }else {
           System.out.println("NO");
       }






    }
}
