import java.util.InputMismatchException;
import java.util.Scanner;

public class Customer {


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Läs in användarens information
        System.out.print("Välkommen till Grandhotel. För att boka ett hotellrum behöver du fylla i lite information. Amnge ditt namn: ");
        String name = scanner.nextLine();

        int id = 0;
        boolean validId = false;
        while (!validId) {
            try {
                System.out.print("Ange ditt ID. Sista 4 siffror på personnummer(XXXX): ");
                String idInput = scanner.next();

                // Kontrollera att det är exakt 4 siffror
                if (idInput.length() == 4 && idInput.matches("\\d+")) {
                    id = Integer.parseInt(idInput);
                    validId = true;
                } else {
                    throw new InputMismatchException();
                }
            } catch (InputMismatchException | NumberFormatException e) {
                System.out.println("Felaktigt ID. Ange exakt 4 siffror.");
                scanner.nextLine(); // Rensa bufferten för att undvika en oändlig loop
            }
        }

        // Visa tillgängliga rum
        int roomChoice = 0;
        boolean validRoomChoice = false;
        while (!validRoomChoice) {
            try {
                System.out.println("Välj ett rum att boka:");
                System.out.println("1. Enkelrum");
                System.out.println("2. Dubbelrum");
                roomChoice = scanner.nextInt();
                validRoomChoice = true;

                // Kolla om rumvalet är giltigt
                if (roomChoice < 1 || roomChoice > 2) {
                    throw new InputMismatchException();
                }
            } catch (InputMismatchException e) {
                System.out.println("Felaktigt val. Ange ett heltal mellan 1 och 2.");
                scanner.nextLine(); // Rensa bufferten för att undvika en oändlig loop
                validRoomChoice = false; // Sätt tillbaka flaggan för att loopa igen
            }
        }
        String roomType = getRoomType(roomChoice);

        // Visa betalningsalternativ
        int paymentChoice = 0;
        boolean validPaymentChoice = false;
        while (!validPaymentChoice) {
            try {
                System.out.println("Välj betalningsmetod:");
                System.out.println("1. Kort");
                System.out.println("2. Kontanter");
                paymentChoice = scanner.nextInt();
                validPaymentChoice = true;

                // Kolla om betalningsvalet är giltigt
                if (paymentChoice < 1 || paymentChoice > 2) {
                    throw new InputMismatchException();
                }
            } catch (InputMismatchException e) {
                System.out.println("Felaktigt val. Ange ett heltal mellan 1 och 2.");
                scanner.nextLine(); // Rensa bufferten för att undvika en oändlig loop
                validPaymentChoice = false; // Sätt tillbaka flaggan för att loopa igen
            }
        }
        String paymentMethod = getPaymentMethod(paymentChoice);

        // Bekräfta bokningen
        System.out.println("Bokning bekräftad:");
        System.out.println("Namn: " + name);
        System.out.println("ID: " + id);
        System.out.println("Rum: " + roomType);
        System.out.println("Betalningsmetod: " + paymentMethod);

        // Stäng scanner
        scanner.close();
    }

    private static String getRoomType(int choice) {
        return switch (choice) {
            case 1 -> "Enkelrum";
            case 2 -> "Dubbelrum";
            default -> "Okänt rumstyp";
        };
    }

    private static String getPaymentMethod(int choice) {
        return switch (choice) {
            case 1 -> "Kort";
            case 2 -> "Kontanter";
            default -> "Okänd betalningsmetod";
        };
    }
}