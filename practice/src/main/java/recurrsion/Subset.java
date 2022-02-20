package recurrsion;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Subset {
    static void subsetString(String str, String processed) {
        if (str.isEmpty()) {
            System.out.println(processed);
            return;
        }


        subsetString(str.substring(1), processed + str.charAt(0));

        subsetString(str.substring(1), processed);

    }

    static ArrayList<String> subsetString1(String str, String processed, ArrayList<String> res) {
        if (str.isEmpty()) {
            // if(!processed.isEmpty())
            res.add(processed);
            return res;
        }


        subsetString1(str.substring(1), processed + str.charAt(0), res);

        subsetString1(str.substring(1), processed, res);
        return res;
    }

    // without passing res in the argument
    static ArrayList<String> subsetString2(String str, String processed) {
        if (str.isEmpty()) {

            ArrayList<String> res = new ArrayList<String>();
            res.add(processed);
            return res;


        }


        ArrayList<String> left = subsetString2(str.substring(1), processed + str.charAt(0));

        ArrayList<String> right = subsetString2(str.substring(1), processed);
        left.addAll(right);
        return left;
    }

    static List<List<Integer>> subsetArrayRemoveDuplicate(List<Integer> arr){
        List<List<Integer>> outer = new ArrayList<>();
        //arr.sort();
        // blank subset
        outer.add(new ArrayList<>());
        for(int num:arr){
            int n = outer.size();
            for(int i =0;i<n;i++){
                List<Integer> internal = new ArrayList<>(outer.get(i));
                internal.add(num);
                outer.add(internal);
            }
        }
        return outer;
    }

    static List<List<Integer>> subsetArray(List<Integer> arr){
        List<List<Integer>> outer = new ArrayList<>();
        // blank subset
        outer.add(new ArrayList<>());
        for(int num:arr){
            int n = outer.size();
            for(int i =0;i<n;i++){
                List<Integer> internal = new ArrayList<>(outer.get(i));
                internal.add(num);
                outer.add(internal);
            }
        }
        return outer;
    }
    public static void main(String[] args) {
        subsetString("abc", "");
        System.out.println(subsetString1("abc", "", new ArrayList<String>()));
        System.out.println(subsetString2("abc", ""));
        List<List<Integer>> arr = (subsetArray(Arrays.asList(1,2,3)));
        for(int i =0;i<arr.size();i++)
            System.out.println(arr.get(i));
    }
}
