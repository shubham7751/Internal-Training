public class strdubcount {
    public static void main(String[] args){
        String a="shubham i good boy";
       // int count=0;
        char [] r=a.toCharArray();
        for(int i=0;i<a.length();i++){
            int  count=0;
            for(int j=1;j<a.length();j++){

                if(a.charAt(i)==a.charAt(j)){
                    count++;
                }

            }
            if(count>=1){
                count++;
                System.out.print(r[i]+" "+count+"......");
            }
        }

    }
}
