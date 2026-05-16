package sorting;
import java.util.Scanner;

public class selectionSort {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int[] arr = new int[5];
        for(int i=0; i<5; i++){
            arr[i] = sc.nextInt();
        }

        for(int i=0; i< arr.length-1; i++){
            int minIndex = i;
            for(int j=i+1; j< arr.length; j++){
                if(arr[j]<arr[minIndex]) {
                    minIndex = j;
                }
            }
            int temp= arr[i];
            arr[i]=arr[minIndex];
            arr[minIndex]=temp;
        }

        for(int j=0; j< arr.length; j++){
            System.out.print(arr[j]+" ");
        }
    }
}