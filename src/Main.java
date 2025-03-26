import java.util.Random;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {

    public static void showArray(int[] a){
        for(int i=0; i<a.length; i++){
            System.out.print(a[i] + ", ");
        }
    }

    public static int[] countingSort(int[] in, int k){
        int[] count = new int[k+1];
        int[] out = new int[in.length];

//        for(int i=0; i < count.length; i++){
//            count[i] = 0;
//        }

        for(int i=0; i <= in.length - 1; i++){
            int currItem = in[i] ;
            count[currItem]++;
        }

        for(int i=1; i <=k; i++){
            count[i] = count[i] + count[i-1];
        }

        for(int i=in.length-1; i>=0; i--){
            int currItem = in[i] ;
            count[currItem]--;
            out[count[currItem]] = currItem;
        }
        return out;
    }


    public static int[] genData(int size, int maxValue){
        int[] data = new int[size];
        Random rand = new Random();
        for(int i=0; i<size; i++){
            data[i] = rand.nextInt(maxValue +1);
        }
        return data;
    }


    public static void main(String[] args) {

        int[] a = {10,2,6,4,7,3,5,8,9,1};
        showArray(a);

        int[] out = countingSort(a, 10);

        System.out.println("\nSorted Array: ");
        showArray(out);


        int[] myData = genData(1000, 499);
        System.out.println("\nPart4 Array: ");
        showArray(myData);

        System.out.println("\nPart4 Sorted Array: ");
        myData = countingSort(myData, 499);
        showArray(myData);






    }
}