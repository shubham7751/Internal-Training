
import java.util.*;
public class hashstr {
    public static void main(String[] args){
        String a="shu bh amaaa";
        int count=0;
        char [] c=a.toCharArray();


        Set<Character> h=new HashSet<>();
        for(char k:c){
            boolean b=h.add(k);
            if(b==false){
                count++;
                System.out.print(" "+k);
            }
        }
        System.out.println();
        System.out.println("count of dublicate is : "+count);
        System.out.println();
        System.out.println(h);
    }
}
