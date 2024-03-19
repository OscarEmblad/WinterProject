import java.util.Scanner;

public class MainHotel {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int choice;

        Hotelmanagement hotelManagement = new Hotelmanagement();
        Owner owner = new Owner(name, contactNumber, emailAdress);
        Customer customer = new Customer();

        do {
            System.out.println("Välkommen till GrandHotel. Hur kan vi hjälpa dig?:");
            System.out.println("1. Hotelmanagement");
            System.out.println("2. Owner");
            System.out.println("3. Customer");
            System.out.println("0. Avsluta");

            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    // Anropa metoder från Hotelmanagement-klassen
                    hotelManagement.someMethod();
                    break;
                case 2:
                    // Anropa metoder från Owner-klassen
                    owner.someMethod();
                    break;
                case 3:
                    // Anropa metoder från Payment-klassen
                    Customer.someMethod();
                    break;
                case 0:
                    System.out.println("Programmet avslutas.");
                    break;
                default:
                    System.out.println("Ogiltigt val. Vänligen välj igen.");
            }
        } while (choice != 0);

        scanner.close();
    }
}