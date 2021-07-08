

import java.util.Scanner;
public class Rewrite
{
       public static void name(){
       int s = 0;
       for (int i = 1; i <= 10; i++)
       {
           s = s + i;
           
        }
        System.out.print(s); 
       
    }
     public static void nametwo(){

       Scanner in = new Scanner( System.in );
        System.out.print("Enter an integer: ");
        int n = in.nextInt();
        double x = 0;
        double s;
        do
        {
            s = 1.0 / (1 + n * n);
            n++;
            x = x + s;
        }
        while (s > 0.01);
         System.out.print(x);
    }}