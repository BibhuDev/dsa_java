package sorting;
import java.util.Scanner;

public class recursiveBubbleSort {

    public static void bubble(int[] arr, int n){
        if(n==1){
            return;
        }
        for(int i=0; i<n-1; i++){
            if(arr[i]>arr[i+1]){

                int temp= arr[i];
                arr[i]= arr[i+1];
                arr[i+1]=temp;
            }
        }
        bubble(arr, n-1);
    }

    public static void main(String[] args) {

        int[] arr = new int[5];
        Scanner sc = new Scanner(System.in);

        for(int i=0; i< arr.length; i++){
            arr[i]= sc.nextInt();
        }

        bubble(arr, arr.length);

        for(int j=0; j< arr.length; j++){
            System.out.print(arr[j]+" ");
        }
    }
}