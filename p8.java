public class p8 {
    public static void main(String[] args) {
        int[] arr = {-1,0,3,5,9,12};
        int target = 3;

        int low = 0;
        int high = arr.length-1;
        

        while (low<=high) {
            int mid = low + (high - low) /2;

            if(arr[mid] == target) System.out.println("found"+mid);
            if(target < arr[mid]){
                high = mid -1;
            }else{
                low = mid +1;
            }

        }


    }
}
