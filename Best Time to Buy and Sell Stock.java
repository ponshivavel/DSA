class Solution {
    public int maxProfit(int[] p) {
        int buy = p[0];
        int sell =0;
        for(int i =1;i<p.length;i++){
            buy=Math.min(buy,p[i]);
            sell =Math.max(sell,p[i]-buy);
        }
      return sell;  
    }
}
