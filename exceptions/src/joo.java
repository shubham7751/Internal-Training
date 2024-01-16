
import java.sql.SQLOutput;
import java.util.Scanner;
public class joo {
    public static void main(String[] args){
        System.out.println("enter your age");
        Scanner s=new Scanner(System.in);
        int a=s.nextInt();
        if(a<18){
            throw new ArithmeticException("not vote ");
           // System.out.print("Can't vote ");
        }
        else{
            System.out.println("you are eligibal to vote");
        }

    }

}
