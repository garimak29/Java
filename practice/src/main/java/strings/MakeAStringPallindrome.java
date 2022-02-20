package strings;

public class MakeAStringPallindrome {
    public static int solve(String A) {
        char[] charArray = A.toCharArray();
        int res = 0;
        for(int i =0;i<charArray.length/2;i++){
            if(charArray[i]!= charArray[charArray.length-i-1] && res < 2)
                res++;

        }
        if(res >= charArray.length/2 || res == 2)
            return charArray.length-1;
        return res;
    }

    public static void main(String[] args) {
        System.out.println(solve("adpooefxzbcoejuvpvaboygp"));
        System.out.println(solve("banana"));
        System.out.println(solve("zrzbmnmgqoo"));
    }
}
