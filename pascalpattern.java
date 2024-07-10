/*
    1
   121
  12321
 1234321
123454321
 1234321
  12321
   121
    1

 */
/*this output is show only when we take thne rows=5 */
import java.util.Scanner;
public class pascalpattern {

    
      public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
    
        System.out.print("Enter the number of rows: ");
        int rows = sc.nextInt();
    
        for (int i = 1; i <= rows; i++) {
          
          for (int j = 1; j <= rows - i; j++) {
            System.out.print(" ");
          }
    
          
          for (int j = 1; j <= i; j++) {
            System.out.print(j);
          }
    
          
          for (int j = i - 1; j >= 1; j--) {
            System.out.print(j);
          }
    
          System.out.println();
        }
    
        
        for (int i = rows - 1; i >= 1; i--) {
          
          for (int j = 1; j <= rows - i; j++) {
            System.out.print(" ");
          }
    
          
          for (int j = 1; j <= i; j++) {
            System.out.print(j);
          }
    
          
          for (int j = i - 1; j >= 1; j--) {
            System.out.print(j);
          }
    
          System.out.println();
        }
      }
    }   
    

