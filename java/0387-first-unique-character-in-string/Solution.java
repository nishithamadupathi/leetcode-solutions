import java.util.HashMap;
class Solution {
    public int firstUniqChar(String s) {
        HashMap<Character, Integer> mapS = new HashMap<>();
        for(int i=0;i<s.length(); i++){
            char c = s.charAt(i);
            mapS.put(c,mapS.getOrDefault(c,0)+1);
        }
        for(int i=0;i<s.length();i++){
            char c = s.charAt(i);
            if(mapS.get(c)==1){
                return i;
            }
        }
        return -1;
    }
}
