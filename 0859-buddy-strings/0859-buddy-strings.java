import java.util.*;
class Solution {
    public boolean buddyStrings(String s, String goal) {
        int a = 0;
        String s1 = "";
        String s2 = "";
        int r = 0;
        if(s.length() != goal.length()){
            return false;
        }
        if(s.equals(goal)){
            for(int i = 0; i < s.length()-1; i++){
                for(int j = i + 1; j < s.length(); j++){
                    if(s.charAt(i) == s.charAt(j)){
                    r++;
                }
                
                }
            }
             if(r > 0){
            return true;
        }
        else{
            return false;
        }
        }
        else{
            for(int i = 0; i < s.length(); i++){
                if(s.charAt(i) != goal.charAt(i)){
                    a++;
                    s1 = s1 + Character.toString(s.charAt(i));
                    s2 = s2 + Character.toString(goal.charAt(i));
                }
            }
        }
        char[] charArray = s1.toCharArray();
        Arrays.sort(charArray);
        String so = new String(charArray);
        char[] charArray1 = s2.toCharArray();
        Arrays.sort(charArray1);
        String so1 = new String(charArray1);
        
       
        if((a == 2) && (so.equals(so1))){
            
            System.out.println(so+" "+so1);
            return true;
        }
        else{
            System.out.println(so+" "+so1);
            return false;

        }
    }
}