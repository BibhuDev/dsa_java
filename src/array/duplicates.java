package array;
import java.util.Scanner;

//remove duplicates from an array
public class duplicates {
    public static void main(String[] args) {

        int[] arr = new int[5]; //sorted array
        Scanner sc = new Scanner(System.in);

        for(int i = 0; i < arr.length; i++){
            arr[i] = sc.nextInt();
        }

        int i=0;
        for(int j=1; j< arr.length; j++){
            if(arr[i]!=arr[j]){
                arr[i+1]=arr[j];
                i++;
            }
        }
        System.out.println(i+1);
    }
}
