class Solution {
    public int longestOnes(int[] arr, int k) {
        int c =0;
        int j =0;
        int maxi = 0;
        for(int i =0;i<arr.length;i++){
            if(arr[i]==0){
                c++;
                }
                while(c>k){
                if(arr[j]==0){
                    c--;
                }
                j++;
                }
                 maxi = Math.max(maxi,i-j+1);
            }
    return maxi;
    }
}
