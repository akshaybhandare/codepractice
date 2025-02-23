import java.util.*;


public class p11 {
    public static void main(String[] args) {
        int[] arr = {2,2,4,4,3};
        int res = 0;
        for (int i = 0; i < arr.length; i++) {
            res = res ^ arr[i];
        }

        System.out.println(res);
     }
}
