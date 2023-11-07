public class Q2 {



    int [] swap(int []a,int i,int j){

        int temp = a[i];
        a[i]=a[j];
        a[j] = temp;

        return a;
    }

        int partation(int []a,int l,int r){

            int pivot=a[l];


            int i = l;
            int j = r;

            while (i<j){

                while (a[i]<=pivot){
                    i++;
                };
                while (a[j]>pivot){j--;}

                if(i<j){
                    swap(a,i,j);
                }


            }
            swap(a,j,l);


            return j;

        }


         void   quictsort(int []a,int l, int r){

        if(l<r){
            int pvot  = partation(a,l,r);
            quictsort(a,l,pvot-1);
            quictsort(a,pvot+1,r);

        }

    }



    public static void main(String[] args) {

        Q2 q = new Q2();
        int[] array = { 10, 7, 8, 9, 1, 5 };

        q.quictsort(array,0,array.length-1);



    }






}
