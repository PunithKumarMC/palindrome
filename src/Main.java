import java.util.Scanner;

//Write a Java Program to Check if Input String is Palindrome.
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String sen = scanner.nextLine();
        StringBuilder sb = new StringBuilder(sen);
        sb.reverse();
        String rev= sb.toString();
        if (sen.compareTo(rev)==0){
            System.out.println("Given String is a Palindrome");
        }else {
            System.out.println("Given String is not a Palindrome");
        }
    }
}