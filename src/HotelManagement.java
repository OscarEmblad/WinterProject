import java.util.Calendar;

public class Hotelmanagement {
    private String hotelName;
    private int openingHour;
    private int closingHour;

    public Hotelmanagement(String hotelName, int openingHour, int closingHour) {
        this.hotelName = hotelName;
        this.openingHour = openingHour;
        this.closingHour = closingHour;
    }

    public String getHotelName() {
        return hotelName;
    }

    public boolean isOpen() {
        // Hämta aktuell tid
        Calendar calendar = Calendar.getInstance();
        int currentHour = calendar.get(Calendar.HOUR_OF_DAY);

        // Kontrollera om hotellet är öppet
        return currentHour >= openingHour && currentHour < closingHour;
    }

    public static void main(String[] args) {
        // Skapa ett hotellobjekt med namn, öppningstimme och stängningstimme
        Hotel myHotel = new Hotel("Exempelhotellet", 8, 22);

        // Kolla om hotellet är öppet
        if (myHotel.isOpen()) {
            System.out.println(myHotel.getHotelName() + " är öppet just nu.");
        } else {
            System.out.println(myHotel.getHotelName() + " är stängt för dagen.");
        }
    }
}