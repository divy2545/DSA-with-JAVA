class Solution {
    public String customSortString(String order, String s) {
        HashMap<Character, Integer> mp = new HashMap<>();
        for(char ch: s.toCharArray()){
            mp.put(ch, mp.getOrDefault(ch, 0)+1);
        }

        StringBuilder sb = new StringBuilder();

        for(char ch: order.toCharArray()){
            while(mp.containsKey(ch)){
                    sb.append(ch);
                    mp.put(ch, mp.get(ch)-1);
                    if(mp.get(ch)==0) mp.remove(ch);
                }
            }
        

       for(Map.Entry<Character, Integer> entry :mp.entrySet()){
        for(int i=0; i<entry.getValue(); i++){
            sb.append(entry.getKey());
        }
       }

       return sb.toString();
    }
}