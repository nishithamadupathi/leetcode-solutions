class Solution {
    public int characterReplacement(String s, int k) {
        int[] count = new int[26];
        int l=0;
        int maxCount = 0;
        int a = 0;
        for(int r=0;r<s.length();r++){
            int index= s.charAt(r)-'A';
            count[index]++;
            maxCount = Math.max(maxCount,count[index]);
            while((r-l+1)-maxCount > k){
                count[s.charAt(l)-'A']--;
                l++ ;
            }
            a=Math.max(a,r-l+1);
        }
        return a ;
    }
}
