package Basic;
import java.util.Scanner;
public class PrimeNumbers {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();

        boolean prime=true;
        for(int i=2; i<n; i++){
            if(n%2==0){
                prime=false;
            }

        }
        if(prime){
            System.out.println("Prime");
        }else{
            System.out.println("No Prime");
        }
    }

}
