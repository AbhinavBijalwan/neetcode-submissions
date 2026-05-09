class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<List<Integer>, List<String>> groupMap = new HashMap<>();
        for (String s : strs) {
            List<Integer> countList = new ArrayList<>(26);
            for (int i = 0; i < 26; i++) {
                countList.add(0);
            }
            for (int i = 0; i < s.length(); i++) {
                int index = s.charAt(i) - 'a';
                countList.set(index, countList.get(index) + 1);
            }
            if (groupMap.containsKey(countList)) {
                groupMap.get(countList).add(s);
            } else {
                groupMap.put(countList, new ArrayList<>());
                groupMap.get(countList).add(s);
            }
        }
        return new ArrayList<>(groupMap.values());
    }
}
