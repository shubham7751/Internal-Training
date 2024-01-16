import java.util.Scanner;
public class pilandrome {
    public static void main(String[] args){
        Scanner sh=new Scanner(System.in);
        System.out.println("enter no: ");
        int n=sh.nextInt();
      int c,r;int s=0;
      c=n;
      while(n>0){
          r=n%10;
          s=(s*10)+r;
          n=n/10;
      }
      if(c==s){
          System.out.println("is palindrome no: ");
      }
      else{
          System.out.println("is not palindrome no: ");
      }

    }


}
