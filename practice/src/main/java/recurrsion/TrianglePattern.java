package recurrsion;

public class TrianglePattern {

    public static void print(int n) {
        if (n == 0)
            return;
        for (int i = n; i > 0; i--)
            System.out.print("*");
        System.out.println();
        print(n - 1);
    }

    //2 loops used in iteration , use 2 variables in the recurrsion
    public static void printWithoutLoop(int r, int c) {
        if (r == 0)
            return;
        if (c < r) {
            System.out.print("*");
            printWithoutLoop(r , c+1);
        } else {
            System.out.println();
            printWithoutLoop(r-1,0);
        }
    }

    public static void printWithoutLoop2(int r, int c) {
        if (r == 0)
            return;
        if (c < r) {

            printWithoutLoop2(r , c+1);
            System.out.print("*");
        } else {

            printWithoutLoop2(r-1,0);
            System.out.println();
        }
    }

    public static void main(String[] args) {
        print(4);
        printWithoutLoop(4,0);
        printWithoutLoop2(4,0);
    }
}
