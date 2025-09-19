package Basic;
import java.util.Scanner;
public class AmstrongNumber {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int n = in.nextInt();

        int sum=0;
        int temp =n;
        while(temp>0){
            int ld=temp%10;
            sum =sum+ ld*ld*ld;
            temp/=10;
        }
        if(sum==n){
            System.out.println("Amstrong Number");
        }else{
            System.out.println("Not Amstrong");
        }
    }
}
