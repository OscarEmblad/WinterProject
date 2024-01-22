public class Employee {
    private final int id;
    private final String namn;
    private double lon;

    // Konstruktor
    public Employee(int id, String namn, double lon) {
        this.id = id;
        this.namn = namn;
        this.lon = lon;
    }

    // Metoder för att hämta information om den anställde
    public int getId() {
        return id;
    }

    public String getNamn() {
        return namn;
    }

    public double getLon() {
        return lon;
    }

    // Metod för att uppdatera lönen
    public void setLon(double lon) {
        this.lon = lon;
    }

    // Överskriden toString-metod för att enkelt skriva ut informationen om den anställde
    @Override
    public String toString() {
        return "ID: " + id + ", Namn: " + namn + ", Lön: " + lon;
    }

    // Användning
    public static void main(String[] args) {
        // Skapa en instans av AnstalldPersonal
        Employee anstalld = new Employee(1, "Alina Hederberg", 50000.0);

        // Skriv ut information om den anställde
        System.out.println(anstalld);

        // Uppdatera lönen och skriv ut igen
        anstalld.setLon(55000.0);
        System.out.println("Uppdaterad lön: " + anstalld.getLon());
    }
}