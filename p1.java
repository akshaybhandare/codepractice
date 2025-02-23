import java.time.*;
import java.util.*;

class p1 {
    public static int[] ap1(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            if(map.containsKey(target - nums[i])){
                int[] ans = {map.get(target - nums[i]), i };
                return ans;
             }
             map.put(nums[i],i);
        }
       return  null;
    }

    public static int[] ap2(int[] nums, int target) {
        List<Integer> set = new ArrayList<>();
        for (int i = 0; i < nums.length; i++) {
            if(set.contains(target - nums[i])){
                int[] ans = {set.indexOf(target - nums[i]), i };
                return ans;
             }
             set.add(nums[i]);
        }
       return  null;
    }

    public static void main(String[] args) {
        p1 sol = new p1();
        // int[] nums = { 3,8,3,5};
        // int target = 6;
        // int[] result = sol.ap1(nums, target);
        // for (int i : result) {
        //     System.out.println(i);
        // }

        long startTime = System.currentTimeMillis(); // Start time
        for(int i = 0; i < 10_000; i++){
            //generate random array with n elements
            int n = 10;
            int[] nums = new int[n];
            for (int j = 0; j < n; j++) {
                nums[j] = (int) (Math.random() * 100); // random number between 0 and 100
            }
            int target = (int) (Math.random() * 100);
    
            // calculate time in seconds
           
            sol.ap1(nums, target);
         

            
        }

        long endTime =  System.currentTimeMillis(); // end time
        double durationInSeconds = (endTime - startTime) / 1000.0;

        System.out.println("Time taken in seconds ap1: " + durationInSeconds);


         startTime = System.currentTimeMillis(); 

        for(int i = 0; i < 10_000; i++){
            int n = 10;
            int[] nums = new int[n];
            for (int j = 0; j < n; j++) {
                nums[j] = (int) (Math.random() * 100); // random number between 0 and 100
            }
            int target = (int) (Math.random() * 100);
    
            // calculate time in seconds
            // Start time
            sol.ap2(nums, target);

        }

         endTime =  System.currentTimeMillis(); // end time
         durationInSeconds = (endTime - startTime) / 1000.0; // Convert milliseconds to seconds

        System.out.println("Time taken in seconds ap2: " + durationInSeconds);
  
    }
}



