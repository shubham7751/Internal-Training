class foo{
    public double fo(float c,double v){
        float z=c;
        double r=v;
        double k= z+r;
        return k;
    }
}
class basic{
    public static void main(String [] args) {
        goo g = new goo();
        noo n = new noo();
        foo f = new foo();
        g.go();
        n.no(60);
        double ss= f.fo(33,66.55);
        System.out.println(ss);
    }
}

class goo{
    public void go(){
        int a=10;
        System.out.println(a);
    }
}
class noo{
    public void no(int b){
        int x=b;
        System.out.println(b);

    }
}

