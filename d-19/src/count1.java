
import java.util.*;
public class count1 {
    public static void main(String[] args){
        Scanner s=new Scanner(System.in);
        System.out.println("enter alfabets : ");
          int count=0;
        String []a=new String[8];
        int count2=0;
        for(int i=0;i<a.length;i++){
            a[i]=s.nextLine();

        }
         HashSet<String> h=new HashSet<>();
        for(String g:a){
            if(h.add(g)==false){
                count++;
            }

        }
        System.out.println(count);
        //if(b==false)
        System.out.println();

//        for(String f:a){
//            System.out.println(f);
//        }
//        System.out.println(a);
    }

}
