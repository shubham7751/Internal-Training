class test{
    public void sum(){
        System.out.println("hiii");
    }
}
class b{

    public void fun(test t)
    {
       t.sum();
    }
}
class zoo{
    public static void main(String[] args) {
        b bb=new b();
        test t=new test();

        bb.fun(t);
    }
}