package Basic;
import java.util.Scanner;
public class PalindromesString {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String str= in.nextLine();
        String rev ="";

        for(int i=str.length()-1; i>=0; i--){
            rev += str.charAt(i);
        }
        if(str.equals(rev)){
            System.out.println("Palindrome");
        }else{
            System.out.println("No Palindrome");
        }
    }
}
