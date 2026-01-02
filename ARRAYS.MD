
NEW FILE CREATED arrays.md

1. [Build Array from Permutation]
2. [Concatenation of Array]
3. [Running Sum of 1d Array]
4. [Richest Customer Wealth]
5. [Shuffle the Array]
6. [Kids With the Greatest Number of Candies]
7. [Number of Good Pairs]
8. [How Many Numbers Are Smaller Than the Current Number]

//Ans-2 
import java.util.Arrays;

public class concatenate_arr {
    public static void main(String[] args) {
        //declaring and defining an array num 
        int num[]={1,2,3,4};
      getConcatenation(num);//calling method 
    }
        static void getConcatenation(int[]a){
            //using arrays.copyof method to copy elements of a into b
        int[]b=Arrays.copyOf(a, 2*a.length);
         System.arraycopy(a,0, b,a.length,a.length);
         System.out.println(Arrays.toString(b));
       }
    // static String getConcatenation(int[]nums){
    //     int ans[]=new int[2*nums.length];
    //     for(int i=0;i<nums.length;i++){
    //         ans[i]=nums[i];
    //         ans[i+nums.length]=nums[i];
    //         }
    //     String x=Arrays.toString(ans);
    //     return x;
    // }
}

//ANS-7
//if arr[i]==arr[j]such thati<j in an array arr then pair(i,j)are called good pairs.
public class GoodPairs {
    public static void main(String[] args) {
          int arr[]={1,2,1,4,4,2,1};
         System.out.print( numIdenticalPairs(arr));
    }
  


    public static int numIdenticalPairs(int[]nums){
        int count=0;
        for(int i=0;i<nums.length;i++){
            for(int j=i+1;j<nums.length;j++){
           if(nums[i]==nums[j]){
            count+=1;
           }
      }
   }
    return count;
    }

}

//ANS--3
public class Sum_1dArray {
    public static void main(String[] args) {
       int nums[]={1,3,5,6} ;
       int sum=0;
       System.out.println(calculatesum(nums, sum));
    }
    static int calculatesum(int arr[],int sum){
        for(int num:arr){
            sum+=num;
        }
        return sum;
    }
}


//ANS-4
public class RichestCustomerWealth {
    public static void main(String[] args) {
        int arr[][]={
             {1,3,4},
             {2,8,3},
             {9,6,1}
    };
    
       System.out.println(calculateMaxwealth(arr));
    }
        public static int calculateMaxwealth(int num[][]){
             int max=Integer.MIN_VALUE;
             for(int m=0;m<num.length;m++){
                int rowsum=0;
                for(int n=0;n<num[m].length;n++){
                        rowsum+=num[m][n];
                }
                  if(rowsum>max){
                    max=rowsum;
                  }
                  
             }
       
       return max;
        }
 }

ANS-5
//given:arr[]={1,2,3,4,5,6}
//output:ans[]={1,4,2,5,3,6}
import java.util.Arrays;

public class ShuffleArray{
    public static void main(String[] args) {
        //declaring and defining original array
        int arr[]={1,2,3,4,5,6};
        System.out.println(shuffle_array(arr));//calling shuffle_array method


    }
    static String shuffle_array(int num[]){
        //creating desired array specifying length
        int [] ans=new int[num.length] ;
        //insert elements in ans array using for loop
        for(int i=0;i<num.length/2;i++){
         ans[2*i]=num[i];
         ans[2*i+1]=num[i+num.length/2];
        }
        //convert array ans to string to print values of ans array.
        String x=Arrays.toString(ans);
        return x;
    }
    
}
