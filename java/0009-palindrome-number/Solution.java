class Solution {
    public boolean isPalindrome(int x) {
        int a=x;
        int reverse=0;
        while(x>0){
            int d=x%10;
            reverse = reverse*10 +d;
            x/=10;
        }
        if(a==reverse)
            return true;
        else 
            return false;
    }
}
