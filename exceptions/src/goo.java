
class shubh {
    public int sum(int x, int y) throws ArrayIndexOutOfBoundsException
    {
        int a = x;
        int b = y;
        int c = a / b;
        return c;
    }
}
    public class goo {
        public static void main(String[] args){
            shubh x=new shubh();
            try {
                x.sum(3, 0);
            }catch(Exception e){
                System.out.println(e);
            }
            }
}

