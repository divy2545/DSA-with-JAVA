class Solution {
    public String largestWordCount(String[] messages, String[] senders) {
        HashMap<String, Integer> mp = new HashMap<>();
        int max = 0;
        String name = "";
        for(int i=0; i<senders.length; i++){
            int len = messages[i].split(" ").length;
            mp.put(senders[i], mp.getOrDefault(senders[i],0)+len);

            if(mp.get(senders[i])>max){
                max = mp.get(senders[i]);
                name=senders[i];
            }
            else if(mp.get(senders[i])==max && name.compareTo(senders[i])<0){
                name = senders[i];
            }
        }
        return name;
    }
}