import java.util.*;
public class accio{

   

   
    public static int reverse(int n)
    {
         /* Function to return the reverse of a number n */
int rev=0;
while(n>0){
    int d =n%10;
    rev=rev*10+d;
    n=n/10;
}
    System.out.println(rev);
    return rev;


        
      
        
        
        
       
       
        /* Do not change the code beyond this point*/
        
    
    }
     public static void main(String[]args)
    {
        Scanner sc=new Scanner(System.in);
        int n =sc.nextInt();
        
        int output = reverse(n);
        System.out.println(output);
    }
}
