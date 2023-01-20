import java.util.Arrays;

public class Flowers {
    private String madein;
    private String shelfLife;
    private int price;
    public  static int coll;
    public static int collPrice;
    private static Rose rose;
    private Chamomile chamomile;
    public Flowers(String madein, String shelfLife, int price) {
        this.madein = madein;
        this.shelfLife = shelfLife;
        this.price = price;
        coll++;
    }

    public Flowers(){
        coll++;
    }
     public  void buket(Flowers[] buket){
         System.out.println(collPrice);
    }


    public String getMadein() {
        return madein;
    }

    public void setMadein(String madein) {
        this.madein = madein;
    }

    public String getShelfLife() {
        return shelfLife;
    }

    public void setShelfLife(String shelfLife) {
        this.shelfLife = shelfLife;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;

    }

    public static int getColl() {
        return coll;
    }

    public static void setColl(int coll) {
        Flowers.coll = coll;
    }

    public static int getCollPrice() {
        return collPrice;
    }

    public static void setCollPrice(int collPrice) {
        Flowers.collPrice = collPrice;
    }

    public static Rose getRose() {
        return rose;
    }

    public static void setRose(Rose rose) {
        Flowers.rose = rose;
    }

    public Chamomile getChamomile() {
        return chamomile;
    }

    public void setChamomile(Chamomile chamomile) {
        this.chamomile = chamomile;
    }
}
