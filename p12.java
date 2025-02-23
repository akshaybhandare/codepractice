// reverse linked list
public class p12 {
    public static void main(String[] args) {
        ListNode root = new ListNode(1, new ListNode(2, new ListNode(3, new ListNode(4, new ListNode(5)))));

     ListNode curr = root;
     ListNode prev = null;


        while(curr!=null){
           ListNode temp = curr.next;
           curr.next = prev;
           prev = curr;
           curr = temp;

        }
        System.out.println(prev);
    }


    

  public static class ListNode {
      int val;
      ListNode next;
      ListNode() {}
      ListNode(int val) { this.val = val; }
      ListNode(int val, ListNode next) { this.val = val; this.next = next; }
  }
 
}
