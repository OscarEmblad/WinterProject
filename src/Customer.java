import java.util.Scanner;

public class Customer {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Läs in användarens information
        System.out.print("Ange ditt namn: ");
        String name = scanner.nextLine();

        System.out.print("Ange ditt ID: ");
        int id = scanner.nextInt();

        // Visa tillgängliga rum
        System.out.println("Välj ett rum att boka:");
        System.out.println("1. Enkelrum");
        System.out.println("2. Dubbelrum");

        int roomChoice = scanner.nextInt();
        String roomType = getRoomType(roomChoice);

        // Visa betalningsalternativ
        System.out.println("Välj betalningsmetod:");
        System.out.println("1. Kort");
        System.out.println("2. Kontanter");

        int paymentChoice = scanner.nextInt();
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