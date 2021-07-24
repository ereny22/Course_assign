import java.util.Scanner;

public class Problem2 {
    public static void main(String [] args){
        // Write your code here
        Scanner input = new Scanner (System.in);
         Scanner sc= new Scanner(System.in);
         String word1 ;
         int intger1;
         String word2;
         int intger2; 
         String word3;
         int intger3;
         word1 = sc.nextLine();
         intger1 = input.nextInt();
         word2 = sc.nextLine();
         intger2 = input.nextInt(); 
         word3 = sc.nextLine();
         intger3 = input.nextInt();
         
     
         
        System.out.printf ("%s %03d %n" , word1 , intger1 );
        System.out.printf ("%s %03d %n" , word2 , intger2 );
        System.out.printf ("%s %03d %n" , word3 , intger3 );  
         
    }
}
