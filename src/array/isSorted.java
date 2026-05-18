package array;
import java.util.Scanner;

public class isSorted {
    public static void main(String[] args) {

        int[] arr = new int[5];

        Scanner sc = new Scanner(System.in);

        for(int i = 0; i < arr.length; i++){
            arr[i] = sc.nextInt();
        }

        boolean sorted = true;

        for(int j = 0; j < arr.length - 1; j++){

            if(arr[j] > arr[j + 1]){
                sorted = false;
                break;
            }
        }

        if(sorted){
            System.out.println("sorted");
        }
        else{
            System.out.println("not sorted");
        }
    }
}