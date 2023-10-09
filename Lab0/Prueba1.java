import java.util.*;

public class Prueba1 {
    public static void main(String[] args){
        airline airline1 = new airline("SafeNSlow");
        airline airline2 = new airline("CheapNFast");
        
        LinkedList<airline> airlineList = new LinkedList<airline>();
        airlineList.add(airline1);
        airlineList.add(airline2);

        for( airline airline : airlineList ) {
            airline.printName();
        }
     }
}
