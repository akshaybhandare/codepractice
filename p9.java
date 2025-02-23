import java.util.*;

public class p9 {

    public static void main(String[] args) {
        // [3,2,0,-4]
        ListNode root = new ListNode(3, new ListNode(2, new ListNode(0 , new ListNode(-4))))    ;
        root.next.next.next.next = root.next;

        Map<Integer,Integer> map = new HashMap<>();// val, in
        
       ListNode myRoot =  root;
        while(myRoot!=null){
            if(map.containsKey(myRoot.val)){
                System.out.println("Cyclic");
                return;
            }

            map.put(myRoot.val, myRoot.val);
            myRoot = myRoot.next;
            
        }

        System.out.println("not cyclic");
    }


    

    static class ListNode {
             int val;
             ListNode next;
             ListNode(int x) {
                 val = x;
                 next = null;
             }
             ListNode(int x, ListNode next){
                val =x;
                this.next = next;
             }
         }
}
