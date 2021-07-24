import java.util.Scanner;
public class Problem1 {
    public static void main(String [] args){
        // Write your code here
        int a  ;
       int b  ;
       int count = 0;
      int i =0;
       
        Scanner input = new Scanner (System.in);
        a = input.nextInt();
        b = input.nextInt();
     
       while (i < 10){
      if (a <= b){
          count++;
         a = a*3 + a;
         b = b*2 + b ;
      }
      else{
          System.out.println (count);
          break;
      }
      i++;
        
       }
    }
}
