// En kod som fungerar som en enkel hotellhanterare. Den använder en scanner för att läsa in användarinput från terminalen och presenterar en meny där användaren kan göra olika val.
import java.util.Scanner;

public class MainHotel {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); // Skapar en Scanner för att läsa in användarinmatning
        int choice; // Variabel för att hålla användarens val

        // En loop som fortsätter tills användaren väljer att avsluta programmet
        do {
            System.out.println("Välkommen till GrandHotel. Hur kan vi hjälpa dig?:"); // Skriver ut välkomstmeddelande och meny
            System.out.println("1. Tider - öppning och stängning");
            System.out.println("2. Information om ägaren");
            System.out.println("3. Customer");
            System.out.println("0. Avsluta");

            choice = scanner.nextInt(); // Läser in användarens val

            // En switch-sats som utför olika åtgärder baserat på användarens val
            switch (choice) {
                case 1 -> { // Om användaren väljer 1: Hotelmanagement
                    Hotelmanagement myHotel = new Hotelmanagement("GrandHotel", 6, 22); // Skapar ett Hotelmanagement-objekt med angivna parametrar
                    if (myHotel.isOpen()) { // Kontrollerar om hotellet är öppet
                        System.out.println(myHotel.getHotelName() + " är öppet just nu."); // Skriver ut meddelande att hotellet är öppet
                    } else {
                        System.out.println(myHotel.getHotelName() + " är stängt för dagen."); // Skriver ut meddelande att hotellet är stängt
                    }
                    myHotel.displayOpeningHours(); // Visar öppettiderna för hotellet
                    myHotel.displayCurrentTime(); // Visar aktuell tid
                }
                case 2 -> { // Om användaren väljer 2: Owner
                    Owner hotelOwner = new Owner("Steven Bing", "072-5421246", "StevenBing@gmail.com"); // Skapar en Owner med angivna uppgifter
                    hotelOwner.askOwnerInformation(); // Ber ägaren att ange information
                }
                case 3 -> { // Om användaren väljer 3: Customer
                    Customer customer = new Customer(); // Skapar ett Customer-objekt
                    customer.main(null); // Startar huvudmetoden i Customer-klassen med null som argument
                }
                case 0 -> System.out.println("Programmet avslutas."); // Om användaren väljer 0: Avsluta programmet
                default -> System.out.println("Ogiltigt val. Vänligen välj igen."); // Om användaren väljer ett ogiltigt alternativ
            }
        } while (choice != 0); // Loopar så länge användaren inte har valt att avsluta programmet

        scanner.close(); // Stänger Scanner-objektet när programmet avslutas
    }
}