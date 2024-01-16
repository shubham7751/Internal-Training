public class smethods {
    public static void main(String[] args){
        String s="Shubham";
        String j="Shubham";
        String m=new String("Shubham");
        System.out.println(s.charAt(5));
        System.out.println(s.indexOf(s));
        System.out.println(s.toUpperCase());
        System.out.println(s.toLowerCase());
        System.out.println(s.length());
        System.out.println(s.trim());
        System.out.println(s.startsWith("My"));
        System.out.println(s.endsWith("ham"));
        System.out.println(s.replace("N","M"));
        System.out.println("@"+s.equals(j));
        System.out.println(s.compareTo(j));
        System.out.println(s+j);
        System.out.println(s.concat("jawale"));
        System.out.println("->"+s+j);
        System.out.println(s.contains("IS"));
        System.out.println(s.replace("M",""));
        System.out.println(s==m);

    }
}
