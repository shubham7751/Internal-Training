
import java.util.Scanner;
public class pair {
    public static void main(String[] args){
        Scanner s=new Scanner(System.in);
        System.out.println("enter alfabets : ");

        String []a=new String[8];
        //int count2=0;
        for(int i=0;i<a.length;i++){
            a[i]=s.nextLine();

        }
        for(int i=0;i<a.length;i++){
            int count=1;
            //count2++;
            for(int j=i+1;j<a.length;j++){
               if(a[i].equals(a[j])){
                   count++;

               }
            }

            if(count>1 ){
                System.out.println(a[i]+"   "+count);

            }
        }

//        for(String f:a){
//            System.out.println(f);
//        }
//        System.out.println(a);
    }

}
