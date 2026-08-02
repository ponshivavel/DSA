class Solution {
    public int maxVowels(String s, int k) {
int j =0;
int sum =0;
int max=0;
        for(int i =0;i<s.length();i++){
           if("aeiou".contains(s.charAt(i)+"")){
            sum++;
        }
            if(k==i-j+1){  
                max = Math.max(sum,max);
                if("aeiou".contains(s.charAt(j++)+"")) sum--;
            }
        }
        return max;
    }
}
