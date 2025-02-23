
// calculate profit and loss
public class p4 {
    

    public static void main(String[] args) {
        int[] sells = {2,3,8,1,9,10};

        int profit = 0, buy = sells[0];
        for (int sell : sells) {
            if(sell>buy){
                profit = Math.max(profit, sell - buy);
            }else{
                buy  = sell;
            }
        }

        System.out.println(profit);
    }
}
