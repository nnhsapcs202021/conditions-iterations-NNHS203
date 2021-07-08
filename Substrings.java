
public class Substrings
{   public static void loop(){
        String s = "catloop";
        int str_length = s.length();
    {

        for (int sublen = 1; sublen<= str_length;sublen ++){
            for (int index = 0; index <= (str_length-sublen);index ++){
                String ssub = s.substring(index,index+sublen);
                System.out.println(ssub);
            }}
    }
}}
