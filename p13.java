// majority element

import java.util.*;

public class p13 {
    public static void main(String[] args) {
        int[] arr = {3,2,3};
        int moreThan = (arr.length / 2);

        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < arr.length; i++) {
           map.put(arr[i], map.getOrDefault(arr[i], 0)+1);
        }

        for (int i = 0; i < arr.length; i++) {
            if(map.get(arr[i]) > moreThan ){
                System.out.println(arr[i]);
                return;
            }

        }
    }
    
} 
