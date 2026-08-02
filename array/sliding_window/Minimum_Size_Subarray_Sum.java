class Solution {
    public int minSubArrayLen(int target, int[] arr) {
        int min = Integer.MAX_VALUE;
        int sum =0;
        int j =0;
        for(int i =0;i<arr.length;i++){
              sum+=arr[i];
              while(target<=sum){
                 min = Math.min(min,i-j+1);
                 sum-=arr[j++];
              }
        }
        if(min == Integer.MAX_VALUE) return 0;
        return min;
    }
}
