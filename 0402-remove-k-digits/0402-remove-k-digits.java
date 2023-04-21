import java.util.*;
class Solution {
    public String removeKdigits(String num, int k) {
        StringBuilder sb = new StringBuilder();
        String str = "";
        int count = 0;
        int r = 0;
        if(num.length()<=k)
            return "0";
        for(int i = 0;i < num.length();i++)
        {
            if(num.charAt(i)!='0')
                count++;
        }
        if(count<=k)
            return "0";
        sb.append(num);
        
        for(int i = 0; i < sb.length()-1;i++)
        {
            if((int)(sb.charAt(i))>(int)(sb.charAt(i+1))){
                sb.delete(i,i+1);
                i = -1;
                k--;
            }
            if(k==0)
                break;

        }
        if(k!=0){
        for(int i = sb.length()-1; i >= 0; i--){
            sb.delete(i,i+1);
            k--;
            if(k==0)
                break;
            
            }
        }
        for(int i = 0; i < sb.length(); i++){
            if(r==0){
                if(sb.charAt(i) =='0'){
                    sb.delete(i,i+1);
                    i = i-1;
                    continue;
                }
            }
            r++;
        }
        str = sb.toString();
        return str;
    }
}