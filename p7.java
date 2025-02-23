import java.util.*;

public class p7 {
    public static void main(String[] args) {
        String s = "cat";
        String t = "tac";

       int[] count = new int[26];

       for (int i = 0; i < s.length(); i++) {
            count[s.charAt(i) - 'a']++;
            count[t.charAt(i) - 'a']--;
       }

       for (int i : count) {
        if(i!=0){
            System.out.println("not it");
            return;
        }
       }

       System.out.println("it is ");

    }

    
}
