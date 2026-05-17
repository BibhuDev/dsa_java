package sorting;
import java.util.Scanner;

public class insertionSort {
    public static void main(String[] args) {

        int[] arr = new int[5];
        Scanner sc = new Scanner(System.in);

        for(int i=0; i< arr.length; i++){
            arr[i]= sc.nextInt();
        }

        for(int i=0; i<arr.length; i++){
            int key= arr[i];
            int j=  i-1;

            while(j>=0 && arr[j]>key){
                arr[j+1]=arr[j];

                j--;
            }

            arr[j+1]=key;
        }

        for(int j=0; j< arr.length; j++){
            System.out.print(arr[j]+" ");
        }
    }
}