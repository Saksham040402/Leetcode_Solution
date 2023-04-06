class Solution {
    Map<String, String> map = new HashMap<>()
    {{
        put("2","abc");
        put("3","def");
        put("4","ghi");
        put("5","jkl");
        put("6","mno");
        put("7","pqrs");
        put("8","tuv");
        put("9","wxyz");
    }};
    List<String> list = new ArrayList<>();
    private List<String> back(String com,String nxtdigit)
    {
        if(nxtdigit.length() == 0)
        {
            list.add(com);
            return list;
        }
        String s = nxtdigit.substring(0,1);
        String letters = map.get(s);
        for(int i = 0; i < letters.length();i++)
        {
            char letter = letters.charAt(i);
            // nextdigit = nxtdigit.size()-1;
            back(com+letter,nxtdigit.substring(1));
        }
        return list;
    }
    public List<String> letterCombinations(String digits) {
        if(digits.length() != 0)
            back("",digits);
        return list;
    }
}