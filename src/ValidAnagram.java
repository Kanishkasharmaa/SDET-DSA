import java.util.*;

public class ValidAnagram {

    public static boolean validAnagram(String s,String t){
        if (s.length()!=t.length()){
            return false;
        }
        Map<Character,Integer> seen=new HashMap<>();
        for(int i=0;i<s.length();i++){
            seen.put(s.charAt(i),seen.getOrDefault(s.charAt(i),0)+1);
        }
        for(int i=0;i<t.length();i++){
            seen.put(t.charAt(i),seen.getOrDefault(t.charAt(i),0)-1);
        }
        for(Map.Entry<Character,Integer> entry: seen.entrySet()){
            if(entry.getValue()!=0) {
                return false;
            }
        }
        System.out.println(seen);
        return true;
    }
    static void main(String[] args) {
        String s="anagram";
        String t="nagraam";
        if(validAnagram(s,t)){
            System.out.println(true);
        }else{
            System.out.println(false);
        }
    }
}
