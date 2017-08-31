//https://www.interviewcake.com/question/java/stock-price

package sorting;

public class StockBuySell {

	public static void main(String[] args) {
		int[] stock_prices_yesterday = {10, 7, 5, 8, 11, 9};
		get_max_profit(stock_prices_yesterday);
	}

	private static void get_max_profit(int[] stock_prices_yesterday) {

		int len= stock_prices_yesterday.length;
		int max_profit=0;
		int profit=0;
		int i,j;
		for(i=0;i<len-1;i++)
		{
			for(j=i+1;j<len;j++)
			{
				if(stock_prices_yesterday[j]>stock_prices_yesterday[i])
				{
					profit=stock_prices_yesterday[j]-stock_prices_yesterday[i];
					if(max_profit<profit)
						max_profit=profit;
				}
			}
		}
		System.out.println("max profit "+max_profit);
	}

}
