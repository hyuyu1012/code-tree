public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        int a, b, c, temp;
        a = 5; b = 6; c = 7;
        temp = a;
        
        a = c;
        c = b;
        b = temp;

        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
    }
}