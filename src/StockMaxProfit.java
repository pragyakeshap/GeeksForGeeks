	// Program to find best buying and selling days
	import java.util.ArrayList;
	 

public class StockMaxProfit {

	   // This function to find the buy sell days for maximum profit
	    void stockBuySell(int price[], int n) 
	    {
	        // Prices must be given for at least two days
	        if (n == 1)
	            return;
	         
	        int count = 0;
	 
	        // solution array
	        ArrayList<ActionType> stock = new ArrayList<ActionType>();
	 
	        // Iterate through given price array
	        int i = 0;
	        while (i < n - 1) 
	        {
	            // Find minimum value for action buy. Comparing till (n-2) since we are
	            // comparing current element to the next element. 
	            while ((i < n - 1) && (price[i + 1] <= price[i]))
	                i++;
	 	         // Reached last element  
	            if (i == n - 1)
	                break;
	 
	            ActionType axn = new ActionType();
	            axn.buy = i++;
	            // Store the index of minima
	             
	 
	            // Find maximum value for sell
	            while ((i < n) && (price[i] >= price[i - 1]))
	                i++;
	 
	            // Store the index of max value
	            axn.sell = i-1;
	            stock.add(axn);
	             
	            // Increment the number of buy/sell
	            count++;
	        }
	 
	        
	        if (count == 0)
	            System.out.println("There is no buy /sell combination where we can make profit");
	        else
	            for (int j = 0; j < count; j++)
	                System.out.println("Buy on day: " + stock.get(j).buy
	                        +"        " + "Sell on day : " + stock.get(j).sell);
	         
	        return;
	    }
	 
	    public static void main(String args[]) 
	    {
	    	StockMaxProfit trade = new StockMaxProfit();
	         
	        // stock prices on consecutive days
	        int price[] = {10, 13, 22, 30, 41, 25, 67};
	        int n = price.length;
	 
	        // fucntion call
	        trade.stockBuySell(price, n);
	    }
	    

		class ActionType 
		{
		    int buy, sell;
		}
	

}
