import java.util.Scanner;
public class main{
    public static void main(String[] args){
        
        Scanner s = new Scanner(System.in);
        System.out.println("What is the name of the event?");
        String name = s.nextLine();
        System.out.println("How many days till the event?");
        int day = s.nextInt();
        
        Event e1 = new Event(day,name);
        System.out.println(e1);
        e1.setDay(day-1);
        System.out.println(e1);
  }
}