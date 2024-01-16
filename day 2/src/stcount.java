public class stcount {
    public static void main(String[] args){
        String  a="Shuhbhuam";
        int count=0;
        for(int i=0;i<a.length();i++){
            for(int j=i+1;j<a.length();j++){
                if(a.charAt(i)==a.charAt(j)){
                    count++;
                    System.out.print(a.charAt(i));
                    System.out.println(count);
                }
            }
        }

        }

    }

