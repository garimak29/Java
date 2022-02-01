package recurrsion;

public class RemoveAfromString {
    public static String solveIterative(String str){
        StringBuilder s = new StringBuilder("");
        for(int i =0;i< str.length();i++){
            if(str.charAt(i)!= 'a' && str.charAt(i)!= 'A'){
                s.append(str.charAt(i));
            }
        }
        return s.toString();
    }

    public static String solveRecurrsive(String str , String res){
        if(str.length() == 0)
            return res;
        if(str.charAt(0) != 'a' && str.charAt(0)!= 'A'){
            res+=str.charAt(0);

        }
        return solveRecurrsive(str.substring(1,str.length()) , res);

    }
    public static void main(String[] args) {
        System.out.println(solveIterative("baaaghskAl"));
        System.out.println(solveRecurrsive("baaaghskAl" , ""));
    }
}
