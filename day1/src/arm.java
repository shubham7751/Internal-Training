import java.util.Scanner;
public class arm {
    public static void main(String[] args){
        Scanner sh=new Scanner(System.in);
            System.out.println("enter no: ");
        int c,r;
        int n=sh.nextInt();
        int s=0;
        c=n;
        while(n>0){
            r=n%10;
            s=(r*r*r)+s;
            n=n/10;

        }
        if(c==s){
            System.out.println("is armstrong no");
        }
        else{
            System.out.println("is not armstrong no");
        }
    }
}
