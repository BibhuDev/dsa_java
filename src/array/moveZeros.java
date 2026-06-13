package array;
import java.util.*;

public class moveZeros {
    public static void main(String[] args) {
        int[] arr= {1, 4, 0, 5, 6, 0, 0, 2, 6, 3, 0};
        int n=arr.length;

        int j=-1;
        for(int i=0; i<n; i++){
            if(arr[i]==0){
                j=i;
                break;
            }
        }

        for(int i=j+1; i<n; i++){
            if(arr[i]!=0){
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;

                j++;
            }
        }

        for(int i=0; i<n; i++){
            System.out.print(arr[i]+" ");
        }
    }
}