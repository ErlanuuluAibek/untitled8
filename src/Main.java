import java.util.Map;

public class Main {
    public static void main(String[] args) {
        Rose rose=new Rose("Russia","60 day",150);
        Chamomile chamomile=new Chamomile("China","30 day",100);
        MayLili mayLili=new MayLili("USA","30 day",200);
        Flowers flowers1=new Flowers();
        Flowers[] flowers ={rose,chamomile,mayLili};
        flowers1.buket(flowers);



    }
}