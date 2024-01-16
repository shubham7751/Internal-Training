
package org.example;

import java.util.Arrays;

public class demo {
    public static void main(String[] args) {
        String a="shubham jawale";
        String b=" ";
        for(int i=a.length()-1;i>=0;i--){
            b=b+a.charAt(i);
        }
        System.out.println(b);
        String c[]=b.split("  ");
        for(String x:c){
            System.out.print(x);
        }

        for(int i=c.length-1;i>=0;i--){
            System.out.print(" "+c[i]);
        }

    }
}
