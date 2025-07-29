class Solution {
    public String sortSentence(String s) {
        Map<Integer, String> mp = new HashMap<>();

        for(String word : s.split(" ")){
            int lastIdx = word.length()-1;

            int idx = word.charAt(lastIdx) - '0';

            String actualWord = word.substring(0,lastIdx);
            mp.put(idx, actualWord);
        }

        StringBuilder sb = new StringBuilder();
        for(Map.Entry<Integer, String> idxWord : mp.entrySet()){
            sb.append(idxWord.getValue());
            sb.append(" ");
        }
        
        return sb.toString().trim();

    }
}