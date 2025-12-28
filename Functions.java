 public class Functions {
    public static void main(String[] args) {
      String name="Pankaj";
     System.out.println(sum(20,65));   
    give_message(name);
        String ans=greet(name);
        System.out.println(ans);
    }
     static int sum(int a,int b){
    int sum=a+b;
    return sum;
 }
  static void give_message(String name){
   System.out.println("Hello"+name);
 }
 static String greet(String name){
    String greeting="Namaste";
    return greeting;
 }
}
