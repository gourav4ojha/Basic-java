package interwiewlogical;

public class BestTime_to_Buy_and_SellStock {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

    public int maxProfit(int[] prices) {
        int buy = prices[0];
        int ans = 0;
        for(int j=1; j<prices.length;j++){
            if(prices[j] < buy) buy=prices[j];
            ans = Math.max(ans , prices[j]-buy);
        }
       return ans;
    }
}
