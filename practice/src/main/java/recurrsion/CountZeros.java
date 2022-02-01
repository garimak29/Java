package recurrsion;

public class CountZeros {
    public static int count(int num){
        if(num == 0){
            return 0;
        }
        if(num%10 == 0){
            return 1+ count(num/10);
        }
        else
            return count(num/10);
    }
    public static void main(String[] args) {
        System.out.println(count(1000890890));
    }
}
