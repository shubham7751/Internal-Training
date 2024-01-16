import java.util.Scanner;
class countno{
    public static void main(String args[]){
        Scanner s = new Scanner(System.in);
//        int count = 0;
      System.out.println("Enter no is:");
        int a = s.nextInt();
//        while(a!=0){
//            a = a/10;
//            count++;
//        }
//        System.out.println("total Digites enter is: "+count);
        String b=Integer.toString(a);
        System.out.println("total count is:  "+b.length());
    }
}