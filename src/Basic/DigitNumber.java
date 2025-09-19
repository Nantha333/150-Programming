package Basic;
import java.util.Scanner;
public class DigitNumber {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int sum = 0;
        while(n>0){
            int ld = n%10;
            sum+=ld;
            n/=10;
        }
        System.out.println(sum);

    }
}
