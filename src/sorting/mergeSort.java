package sorting;
import java.util.Scanner;

public class mergeSort {

    public static void merge(int[] arr, int low, int mid, int high){
        int[] temp= new int[high-low+1];
        int left = low;
        int right = mid+1;

        int k=0;
        while(left<= mid && right<= high){
            if(arr[left]<=arr[right]){
                temp[k]=arr[left];
                left++;
            }
            else{
                temp[k]=arr[right];
                right++;
            }

            k++;
        }

        while(left <= mid){
            temp[k] = arr[left];
            left++;
            k++;
        }

        while(right <= high){
            temp[k] = arr[right];
            right++;
            k++;
        }

        for(int i = 0; i < temp.length; i++){
            arr[low + i] = temp[i];
        }
    }

    public static void mergeSort(int[] arr, int low, int high){
        if(low>=high){
            return;
        }

        int mid= (high+low)/2;

        mergeSort(arr, low, mid);
        mergeSort(arr, mid+1, high);
        merge(arr, low, mid, high);
    }

    public static void main(String[] args) {

        int[] arr = new int[5];
        Scanner sc = new Scanner(System.in);

        for(int i=0; i< arr.length; i++){
            arr[i]= sc.nextInt();
        }

        mergeSort(arr, 0, arr.length-1);

        for(int j=0; j< arr.length; j++){
            System.out.print(arr[j]+" ");
        }
    }
}