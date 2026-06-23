class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String,List<String>> mp=new HashMap<>();

        for(String str:strs){
            int[] arr=new int[26];
            for(char c:str.toCharArray()){
                arr[c-'a']++;
            }
            StringBuilder sb=new StringBuilder();
            for(int num:arr){
                sb.append(num).append(',');
            }

            mp.putIfAbsent(sb.toString(),new ArrayList<>());
            mp.get(sb.toString()).add(str);
        }
        return new ArrayList<>(mp.values());
    }
}
