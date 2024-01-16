
import java.util.Scanner;
public class fibo {
    public static void main(String[] args) {
        int a = 0, b = 1, c;
        Scanner s=new Scanner(System.in);
        System.out.println("Enter no: ");
        int n=s.nextInt();
        for (int i = 0; i <= n; i++) {
            System.out.print(a+" ");
            c = a + b;

            a = b;
            b = c;
        }
    }
}
