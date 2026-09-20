class Solution {
    public int reverseDegree(String s) {
        int a=0;
        for(int i=0;i<s.length();i++){
            int indRev=27-(s.charAt(i)-'a'+1);
            int product=(i+1)*indRev;
            a+=product;
        }
        return a;
    }
}
