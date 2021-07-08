import java.util.Scanner;
public class Leapyear{
    public static void main(String[] args)
   {
             Scanner in = new Scanner(System.in);
             System.out.print("Which year do you want check");
             int year = in.nextInt();
             if (year%100 == 0 && year%400 != 0)
             {
                System.out.println("This year is not a leap year");
            }
             else if (year%4== 0 || year%400==0)
             {System.out.println("This year is a leap year");
                }
    }
}