public class Solution1 {

    public static int getMaxProfit(int[] stockPrices) {

    if (stockPrices.length < 2) {
        throw new IllegalArgumentException("Getting a profit requires at least 2 prices");
    }

    int minPrice = stockPrices[0];
    int maxProfit = stockPrices[1] - stockPrices[0];
    for (int i = 1; i < stockPrices.length; i++) {
        int currentPrice = stockPrices[i];

        int potentialProfit = currentPrice - minPrice;
        maxProfit = Math.max(maxProfit, potentialProfit);

        minPrice = Math.min(minPrice, currentPrice);
    }

    return maxProfit;
    }

    public static void main(String[] args) {
        int[] arr={7,4,3,2};
        
        int a=getMaxProfit(arr);
        
        System.out.println(a);
            
       
    }
}