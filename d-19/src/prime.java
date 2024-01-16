public class prime {
    public static void main(String[] args){
       // int sum=0;
        for(int i=1;i<100;i++)
        {int sum=0;
            for(int j=2;j<=i-1;j++)
            {
                if(i%j==0){
                    sum=sum+1;
                }

            }
            if(sum==0){
                System.out.print(i+" ");
            }
        }
    }
}
