package arrays;

import java.lang.reflect.Constructor;
import java.util.HashMap;

class Solution {

    public static void main(String[] args){
        int[] nums = {1,7,3,6,5,6};
        System.out.println(isIsomorphic("foo","bar"));
        System.out.println(isIsomorphic("egg","add"));
        System.out.println(isIsomorphic("paper","title"));
    }
    public static boolean isIsomorphic(String s, String t) {

        HashMap<Character , Character> map = new HashMap();
        //edge case
        if(s.length() != t.length())
            return false;

        //actual solution
        for(int i =0;i<s.length();i++){




            if(map.containsKey(s.charAt(i)) && map.get(s.charAt(i)) != t.charAt(i)){
                return false;
            } else if (map.containsKey(t.charAt(i)) && map.get(t.charAt(i)) != s.charAt(i)) {
                return false;
            } else if(!map.containsKey(s.charAt(i)) || !map.containsKey(t.charAt(i))){
                map.put(s.charAt(i),t.charAt(i));
                map.put(t.charAt(i),s.charAt(i));
            }

            Constructor constructor;

        }
        return true;
    }


}