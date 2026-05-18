package sorting;
import java.util.Scanner;

public class quickSort {

    public static int partition(int[] arr, int low, int high){

        int pivot= arr[high];

        int i= low-1;
        for(int j=low; j<high; j++){
            if(arr[j]<high){
                i++;

                int temp= arr[i];
                arr[i]=arr[j];
                arr[j]= temp;
            }
        }

        int temp= arr[high];
        arr[high]= arr[i+1];
        arr[i+1]=temp;

        return i+1;
    }

    public static void quickSort(int[] arr, int low, int high){
        if(low<high){
            int pivotIndex = partition(arr, low, high);
            quickSort(arr, low, pivotIndex-1);
            quickSort(arr, pivotIndex+1, high);
        }
    }

    public static void main(String[] args) {

        int[] arr = new int[5];
        Scanner sc = new Scanner(System.in);

        for(int i=0; i< arr.length; i++){
            arr[i]= sc.nextInt();
        }

        quickSort(arr, 0, arr.length-1);

        for(int j=0; j< arr.length; j++){
            System.out.print(arr[j]+" ");
        }
    }
}