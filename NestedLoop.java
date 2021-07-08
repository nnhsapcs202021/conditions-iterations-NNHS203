
/**
 * Write a description of class NestedLoop here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class NestedLoop
{
    // instance variables - replace the example below with your own
    private int x;

    /**
     * Constructor for objects of class NestedLoop
     */
    public static void  forLoop()
    {

        for (int i = 1; i <3;i ++){
            for (int n = 1; n <5;n ++){
                System.out.println(i+""+n);
            }}
    }

    public static void whileLoop(){
        int j = 1;
        while (j<=2){
            int k =1;
            while (k <=4 ){
                System.out.println(j+""+k);
                k ++;
                j++;}

        }

    }

    public static void doLoop(){
        int l =1; 
        do {
            int m = 1;
            do {
                System.out.println(l+""+m);
                l++;
                m++;}
            while (m<=4);} 
        while (l <=2);
    }}
