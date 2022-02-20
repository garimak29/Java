package maths;

public class DivisibilityBy30 {
    public static int solve(String A) {
        if(A.length()>6)
            return 0;
        long num = Long.parseLong(A);

        if (num >= 100000)
            return 0;
        if (num % 30 == 0)
            return 1;
        else
            return 0;


    }

    public static void main(String[] args) {
        System.out.println(solve("16272828282882828268927391273981273892173298173981"));
    }
}
