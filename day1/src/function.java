import java.util.Scanner;
class a{
    void sum(){
        int a=20;
        int b=30;
        int c=a+b;
        System.out.println("Addition is:"+c+" ");
    }
    int add(int b,int c){
        int x=b;
        int y=c;
        int g=x-y;
        return g;
    }
}
class b{
    public void mul(){
        int a=4;
        int b=7;
        int c=a*b;
        int k=b/a;
        System.out.println(" Multiply is:"+c+" ");
        System.out.println(" division is:"+k+" ");
    }

}
public class function {
    public static void main(String[] args){
        Scanner s=new Scanner(System.in);
        System.out.println("enter b: ");
        int b=s.nextInt();
a f=new a();
f.sum();
System.out.println("Substraction is"+f.add(b,9));
b x=new b();
x.mul();

    }
}

