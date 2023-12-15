import org.example.PezDispenser;

public class PezDispenserUsage {
    public static void main(String[] args) {
        PezDispenser Batman = new PezDispenser("BATMAN", "Black");

        //Start eat

        Batman.eatCandy();



        //Load Candy ;

        Batman.candyReload(5);
        System.out.println(Batman);
    }
}
