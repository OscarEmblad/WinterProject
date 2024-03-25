// Hotelmanagement-klassen hanterar information om ett hotell, som namn och öppettider
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;


public class Hotelmanagement {
    private final String hotelName;  // Namnet på hotellet
    private final int openingHour;   // Öppningstimmen för hotellet
    private final int closingHour;   // Stängningstimmen för hotellet

    // Konstruktor för att skapa ett nytt Hotelmanagement-objekt med givna parametrar
    public Hotelmanagement(String hotelName, int openingHour, int closingHour) {
        this.hotelName = hotelName;
        this.openingHour = openingHour;
        this.closingHour = closingHour;
    }

    // Metod för att hämta hotellets namn
    public String getHotelName() {
        return hotelName;
    }

    // Metod för att kontrollera om hotellet är öppet baserat på aktuell tid
    public boolean isOpen() {
        // Hämta aktuell tid från kalendern
        Calendar calendar = Calendar.getInstance();
        int currentHour = calendar.get(Calendar.HOUR_OF_DAY);

        // Kontrollera om hotellet är öppet vid den aktuella tiden
        return currentHour >= openingHour && currentHour < closingHour;
    }

    // Metod för att visa hotellets öppettider
    public void displayOpeningHours() {
        System.out.println( hotelName + " är öppet från " + openingHour + ":00 till " + closingHour + ":00.");
    }

    // Metod för att visa den aktuella tiden
    public void displayCurrentTime() {
        // Skapa en enkel datumformat för att formatera tiden
        SimpleDateFormat dateFormat = new SimpleDateFormat("HH:mm");
        // Hämta och formatera den aktuella tiden
        String currentTime = dateFormat.format(new Date());
        System.out.println("Aktuell tid är: " + currentTime);
    }

    // Huvudmetod som körs vid körning av programmet
    public static void main(String[] args) {
        // Skapa ett hotellobjekt med angivet namn, öppningstimme och stängningstimme
        Hotelmanagement myHotel = new Hotelmanagement("GrandHotel", 6, 22);

        // Kontrollera om hotellet är öppet och skriv ut relevant meddelande
        if (myHotel.isOpen()) {
            System.out.println(myHotel.getHotelName() + " är öppet just nu.");
        } else {
            System.out.println(myHotel.getHotelName() + " är stängt för dagen.");
        }

        // Visa hotellets öppettider
        myHotel.displayOpeningHours();

        // Visa den aktuella tiden
        myHotel.displayCurrentTime();
    }
}