import java.util.Scanner;
public class circle {
    public static void main(String[] args){
        Scanner s=new Scanner(System.in);
        System.out.println("enter radius: ");
        int r=s.nextInt();
        double b=3.142*r*r;
        System.out.println("Area= "+b);
        double c= 2*3.142*r;
        System.out.println("parimeter is:"+c);
    }
    }
