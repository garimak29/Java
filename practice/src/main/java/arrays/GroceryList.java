package arrays;

public class GroceryList {

    public static void main(String[] args) {
        String[] str = {"apples 1 2", "banana-1;2", "cats 234 233", "mama n m", "mama n m","sadnjka,1,1"};
        System.out.println(findTotal(str));
    }

    private static String findTotal(String[] str) {
        StringBuilder ans = new StringBuilder();
        int sum = 0;
        for (int i = 0; i < str.length; i++) {
            System.out.println(str[i]);
            String[] newArray = str[i].replaceAll("[^0-9]+", " ").trim().split(" ");
            if (newArray[0].matches("^\\d+") && newArray[1].matches("^\\d+")) {
                sum += Integer.parseInt(newArray[0]);
                ans.append(newArray[0]);
                if (i != str.length - 1) {
                    ans.append("+");
                }


            }}
         //   System.out.println("sda "+ans.charAt(ans.length()-1));

            if(ans.charAt(ans.length()-1)=='+'){
                ans= new StringBuilder(ans.substring(0, ans.length() - 1));
            }
            ans.append("=" + sum);

        return ans.toString();
    }
}
