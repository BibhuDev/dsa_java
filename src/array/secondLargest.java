package array;

public class secondLargest {
    public static void main(String[] args) {
        int[] arr = {122, 23, 87, -76, 9};
        int max= arr[0];

        for(int i=0; i< arr.length; i++){
            if(arr[i]>max){
                max= arr[i];
            }
        }
        int sec_max= Integer.MIN_VALUE;
        for(int j=0; j< arr.length; j++){
            if(arr[j]>sec_max && arr[j]!=max){
                sec_max=arr[j];
            }
        }

        System.out.println(sec_max);
    }
}