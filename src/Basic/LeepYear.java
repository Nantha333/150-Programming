package Basic;
import java.util.Scanner;
public class LeepYear {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int year = in.nextInt();

        if(year%400==0 || (year%4==0 && year%100!=0)){
            System.out.println("Leep Year");
        }else{
            System.out.println("No Leap Year");
        }
    }
}
