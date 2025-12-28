import java.lang.Math;

public class CheckArmstrong_Num{

    public static void main(String[] args) {
        int num=153;
         int sum=0;
        while(num>0){
            int rem=num%10;
          sum +=(int)Math.pow(rem,3);
           num=num/10;
                               
        }
        if (sum==num)
             System.out.println("Armstrong Number");
        else  
             System.out.println("Not an Armstrong Number");
         
    }
      

}