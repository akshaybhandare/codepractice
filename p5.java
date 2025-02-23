public class p5 {

    public static void main(String[] args) {
        String palim = "A man a plan a canal Panama";
        //String palim = "tot";



        String nonWjString = palim.toLowerCase().replaceAll("\\s", "");
       char[] ac = nonWjString.toCharArray();

       int left = 0;
       int right = nonWjString.length() -1;

        while(left <= right){
            if(ac[left] != ac[right]){
                System.out.println("not a palimdrom");
                return;
            }

            left++;
            right--;
        }
        System.out.println("Yes it is");

    }
    
}
