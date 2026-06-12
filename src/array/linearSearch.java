package array;
import java.util.Scanner;

public class linearSearch {
    public static void main(String[] args) {

        int[] arr = new int[5];
        Scanner sc = new Scanner(System.in);

        for(int i = 0; i < arr.length; i++){
            arr[i] = sc.nextInt();
        }

        int k = sc.nextInt();

        for(int i=0; i< arr.length; i++){
            if(arr[i]==k){
                k=i;
            }
        }
        System.out.println("target found at index: "+k);
    }
}