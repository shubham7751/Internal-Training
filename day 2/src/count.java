public class count {
    public static void main(String[] args) {
        int count=1;
        String s = "Shubham Is Good Boy";
        for (int i=0;i<s.length();i++){
            count++;
        }
        System.out.println(count);
        String[] j=s.split(" ");

        for(int i=j.length-1;i>=0;i--){
            System.out.println(j[i]);
        }
        String rev=" ";
        for(int i=s.length()-1;i>=0;i--){
            rev=rev+s.charAt(i);

        }
        System.out.println(rev);

//        String revj=" ";
//        String revj2=j.split(" ");
//        for(int i=j.length-1;i>=0;i--){
//            revj=revj+j.charAt(i);
//        }
    }

}
