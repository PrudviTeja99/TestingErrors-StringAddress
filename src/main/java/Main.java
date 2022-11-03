public class Main {
    public static void main(String[] args) {
        String s1="Hello";
        String s2=s1;
        s1+="Hi";
        System.out.println(s1+" "+s2);


        StringBuffer sb1=new StringBuffer("Hello");
        StringBuffer sb2=sb1;
        sb1.append("Hiu");
        System.out.println(sb1+" "+sb2);
    }
}
