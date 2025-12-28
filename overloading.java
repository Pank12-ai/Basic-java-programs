public class overloading{
    public static void main(String[] args) {
        fun("pankaj","aakash","rajeev");
        fun("pankaj","aakash");

    }
    static String fun(String a,String b,String c){
       return fun(a,b,c);
    }
    static String fun(String a,String b){
        return fun(a,b);
    }

}