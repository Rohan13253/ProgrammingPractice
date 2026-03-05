
class ArrayX
{
    int BestTimeToBuyAndSellX(int prices[])
    {
        int min = Integer.MAX_VALUE;
        int CurrProfit = 0;
        int maxProfit = 0;

        for(int i = 0; i < prices.length;i++)
        {
            if(min > prices[i])
            {
                min = prices[i];
            }

        CurrProfit = prices[i] - min;

        if(CurrProfit > maxProfit)
        {
            maxProfit = CurrProfit;
        }

        }

        return maxProfit;
    }

}

public class BestTimeToBuyAndSell {
    
}
