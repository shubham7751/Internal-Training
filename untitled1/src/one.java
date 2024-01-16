class a{
    int a=100;
    void disp(int z){
        System.out.println("hello");
    }
}
class b {

    int b=200;
    int c=b;

    void disp1(int f){

        System.out.println("hi"+c+f);
    }

//    a dd=new a();
//        dd.disp(50);
}
class one{
    public static void main(String[] args) {


      b x=new b();
      x.disp1(77);

    }
}