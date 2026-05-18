package array;

public class largestElement {
    public static void main(String[] args) {
        int[] arr= {123, 54, 1234, 11, -2345};
        int max= arr[0];

        for(int i=0; i<arr.length; i++){
            if(arr[i]> max){
                max= arr[i];
            }
        }

        System.out.println(max);
    }
}