public class ex1 {
    public static void main(String[] args){

       // int a=10,b=0;
        try{
              try{
                  int c []=new int[2];
                  c[0]=10;
                  c[1]=20;
                  c[2]=30;
                  c[3]=40;

              }catch(Exception e)
              {
                  System.out.println(e);
              }
              try{
                  int a=10,b=0;
                  if(a /b==0){
                      System.out.println("can't divide");

                  }

              }catch(Exception e1)
              {
                System.out.println(e1);
              }



        }catch(Exception e2)
        {
            System.out.println(e2);
        }
    }
}
