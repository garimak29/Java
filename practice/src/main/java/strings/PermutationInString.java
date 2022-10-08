package strings;

import java.util.HashMap;
import java.util.HashSet;

public class PermutationInString {

    public static int solve(String A , String B){
        int count =0;
        if(B.length() == 0 || A.length() == 0)
            return 0;
        HashMap<Character , Integer> hashmap = new HashMap<>();
        for(int i =0;i<A.length();i++){
            if(hashmap.containsKey(A.charAt(i)))
                hashmap.put(A.charAt(i),hashmap.get(A.charAt(i))+1);
            else
                hashmap.put(A.charAt(i),1);
        }

        for(int i=A.length();i<B.length()+1;i++){
            String subStr = B.substring(i-A.length(),i);
            HashMap<Character , Integer> temp = new HashMap<>(hashmap);
            int Alength = A.length();
            for(int j=0;j<subStr.length();j++){
                if(temp.containsKey(subStr.charAt(j)) && temp.get(subStr.charAt(j))>0 && Alength>0){
                    temp.put(subStr.charAt(j),temp.get(subStr.charAt(j))-1);
                    Alength--;
                }
                if(Alength == 0)
                    count++;
            }

        }
        return count;
    }
    //time limit exceeded
    public static int solve1(String A, String B) {
        HashSet<String> set = new HashSet<>();
        //calculate permutations add it to the hashmap , check if it contains the permutation then count ++
        // return the count
        int count =0;
        set = calculatePermutation(A);
        for(int i =A.length();i<B.length()+1;i++)
        {
            String str = B.substring(i-A.length() , i);
            System.out.println(str);
            if(set.contains(str))
                count++;
        }
        System.out.println(set);
        return count;
    }

    private static HashSet<String> calculatePermutation(String a) {
        HashSet<String> set = new HashSet<>();
        permutate(a , 0 , a.length(),set);
        return set;
    }

    private static HashSet<String> permutate(String a, int i, int length, HashSet<String> set) {
        if(i == length)
            return set;
        for(int k =i ; k<length;k++){
            a = swap(a , i , k);
            set.add(a);
            permutate(a , i+1 , length ,set);
            a = swap(a , i , k);
            set.add(a);
        }
        return set;
    }

    private static String swap(String a, int i, int k) {
        char temp ;
       char[] charArray = a.toCharArray();
       temp = charArray[i];
       charArray[i] = charArray[k];
       charArray[k] = temp;
       return String.valueOf(charArray);
    }

    private static int newSolution(String A,String B){

                HashMap<Character , Integer> map = new HashMap();
                for(int i =0;i< A.length();i++){
                    char c = A.charAt(i);
                    if(map.containsKey(c)){
                        map.put(c,map.get(c)+1);
                    }

                    else
                        map.put(c,1);
                }

                int count =0;
                HashMap<Character , Integer> mapNew = new HashMap();
                map = mapNew;
                for(int j=0;j<B.length()-A.length();j++){
                    map = mapNew;
                    for(int k=0;k<A.length();k++){
                        if(mapNew.containsKey(B.charAt(j)) && mapNew.get(B.charAt(j))>0){
                            mapNew.put(B.charAt(j),mapNew.get(B.charAt(j))-1);
                            if(k==A.length()-1){
                                count++;
                            }
                        }else{
                            break;
                        }

                    }
                }

                return count;


    }
    public static void main(String[] args) {
        System.out.println(solve("aca" , "acaa"));
        System.out.println(solve("abc" , "abcbacabc"));
        System.out.println(solve("q" , "qedq"));
        System.out.println(solve("q" , ""));
    }
}
/*
*
*
*     public int solve(String A, String B) {
        int n = A.length();
        int m = B.length();
        int hash1[] = new int[26];
        int hash2[] = new int[26];
        int count = 0;
        // count frequency of each char in A
        for (int i = 0; i < n; i += 1) {
            hash1[A.charAt(i) - 'a'] += 1;
        }
        // count frequency of each char in first window of size n in G
        for (int i = 0; i < n; i += 1) {
            hash2[B.charAt(i) - 'a'] += 1;
        }
        count += same(hash1, hash2);
        // move current window 1 step ahead
        for (int i = n, j = 0; i < m; i += 1, j += 1) {
            hash2[B.charAt(j) - 'a'] -= 1;
            hash2[B.charAt(i) - 'a'] += 1;
            count += same(hash1, hash2);
        }
        return count;
    }

    public int same(int[] hash1, int[] hash2) {
        for (int i = 0; i < 26; i += 1) {
            if (hash1[i] != hash2[i])
                return 0; // not a permutation of A
        }
        return 1; // got a permutation of A in G
    }
}
*
*
*
* */