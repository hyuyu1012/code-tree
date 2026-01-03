import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = 4;
        int val = 0;
        for(int i = 0; i < n; i++) {
            for(int j = 0; j < n; j++) {
                int temp = sc.nextInt();
                val = val + temp;
            }
            System.out.println(val);
            val = 0;
        }   
    }
}