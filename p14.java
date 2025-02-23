// find the missing number in 0..n
public class p14 {
    public static void main(String[] args) {
        int[] arr = {9,6,4,2,3,5,7,0,1};

        int max = arr[0];
        int curSum = 0;
        for (int i : arr) {
            max = Math.max(max, i);
            curSum += i;
        }

        int sum = ((max+1)*max)/2; // n(n+1)/2
        System.out.println(sum - curSum);
    }
}
