package recurrsion;

public class SkipAppleFromTheString {

    public static String skipApple(String str , String apple){
        if(str.isEmpty())
            return "";

        if(str.startsWith(apple)){
            return skipApple(str.substring(apple.length()) , apple);
        }
        else
            return str.charAt(0)+skipApple(str.substring(1) , apple);
    }


    public static String solveRecurrsion(String str , String apple , String res){
        if(str.length() == 0)
        {
            return res;
        }
        if(str.length()>= apple.length()) {
            String subString = str.substring(0, apple.length());
            if (!subString.equalsIgnoreCase(apple)) {
                res += str.charAt(0);
                return solveRecurrsion(str.substring(1,str.length()) , apple , res);
            }
            else
                return solveRecurrsion(str.substring(apple.length(),str.length()) , apple , res);
        }
        res+=str.charAt(0);
      return solveRecurrsion(str.substring(1,str.length()) , apple , res);
    }
    public static void main(String[] args) {
        System.out.println(skipApple("garima is an apple of my eye apple is good" , "apple" ));

        System.out.println(solveRecurrsion("garima is an apple of my eye apple is good" , "apple" , ""));
    }
}
