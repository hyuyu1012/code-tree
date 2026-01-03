import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int arr[][] = new int[2][4];
        Scanner sc = new Scanner(System.in);

        int entireAvg = 0;
        int widthAvg = 0;
        int heightAvg = 0;

        for(int i = 0; i < arr.length; i++) {
            for(int j = 0; j < arr[i].length; j++) {
                arr[i][j] = sc.nextInt();
                widthAvg += arr[i][j];
                entireAvg += arr[i][j];
            }
            System.out.print(widthAvg/4.0 + " ");
            widthAvg = 0;
        }
        System.out.println();

        for(int i = 0; i < 4; i++) {
            for(int j = 0; j < 2; j++) {
                heightAvg += arr[j][i];
            }
            System.out.print(heightAvg/2.0 + " ");
        }
        System.out.println();
        System.out.println(entireAvg/8.0 + " ");
    }
}
