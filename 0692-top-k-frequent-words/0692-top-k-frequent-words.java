class Solution {
    public List<String> topKFrequent(String[] words, int k) {
        HashMap<String, Integer> mp = new HashMap<>();

        for(int i=0; i<words.length; i++){
            mp.put(words[i],mp.getOrDefault(words[i], 0)+1);
        }

        List<Map.Entry<String, Integer>> list = new ArrayList<>(mp.entrySet());
        list.sort((a,b)-> {
            if(b.getValue().equals(a.getValue())){
                return a.getKey().compareTo(b.getKey());
            }
            return b.getValue() - a.getValue();
        });
        
        List<String> ans = new ArrayList<>();

        for(int i=0; i<k; i++){
            ans.add(list.get(i).getKey());
        }

        return ans;

    }
}