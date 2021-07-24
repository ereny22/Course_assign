import java.util.Scanner;
public class Problem3 {
    public static void main(String [] args){
        // Write your code here
         int q ;
        int a;
        int b;
        int n;
        int i =0;
        int sum;
      
        
        Scanner input = new Scanner (System.in);
       
        q = input.nextInt();
        while (i < q ){
        a = input.nextInt();
        b = input.nextInt();
        n = input.nextInt();
        sum = (int) (a + b*Math.pow(2, 0));
         for (int j =0 ; j <= (n-1) ; j++){
        sum = (int) (sum + b*Math.pow(2, j+1));
         System.out.print(sum + "  ");
        }
        
        i++;  
    }
    }
}
