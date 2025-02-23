import java.util.*;

public class p2 {


    public boolean isValid(Map<Character, Character> up, String s) {
        
        Deque<Character> stack = new ArrayDeque<>();
    
        char[] arr = s.toCharArray();

        for (char c : arr) {
            if(up.containsValue(c)){
                stack.push(c);
            }else{
                if(stack.isEmpty() || !stack.peek().equals(up.get(c))){
                    return false;
                }
                stack.pop();
            }
        }
        return true;
            
    }

    public static void main(String[] args) {
        Map<Character, Character> up = new HashMap<>();
        up.put(')','(');
        up.put('}','{' );
        up.put(']','[');

        p2 sol = new p2();

        String s = "[()[]{}]";
        boolean result = sol.isValid(up,s);
        System.out.println(result);
    }



}
