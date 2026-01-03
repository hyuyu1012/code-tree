import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);
        String strArr[] = sc.next().split("-");
        System.out.print(strArr[0]);
        System.out.print(strArr[1]);
    }
}