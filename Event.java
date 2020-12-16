
public class Event
{
    private int dayTill;
    private String name;
    public Event (int day,String n){
        this.dayTill = day;
        this.name = n;
    }

    public void setDay(int day){
        this.dayTill = day;}

    public void setName(String n ){
        this.name = n;}

    public int getDays(){
        return this.dayTill;
    }

    public String getName(){
        return this.name;
    }
    public String toString(){
        String str = "The event "+this.name+" will occur in "+(this.dayTill/7)+" weeks "+(this.dayTill%7)+" days";
        return str;}
}
