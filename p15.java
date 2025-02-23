// reverse ["h","e","l","l","o"]
public class p15 {
    public static void main(String[] args) {
        String s = "hello";
        char[] ss = s.toCharArray();
 
        int left = 0;
        int right = ss.length - 1;

        while (left < right) {
           char temp = ss[left];
           ss[left] = ss[right];
        ss[right] = temp ;

           left++;
           right--; 
        }

        System.out.println(ss);

    }
}
