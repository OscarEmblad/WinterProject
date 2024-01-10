import java.util.Scanner;

public class Payment {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Välkommen till betalningssystemet!");
        System.out.println("Vänligen välj betalningsmetod:");
        System.out.println("1. Kortbetalning");
        System.out.println("2. Kontantbetalning");

        int val = scanner.nextInt();

        switch (val) {
            case 1:
                kortBetalning();
                break;
            case 2:
                kontantBetalning();
                break;
            default:
                System.out.println("Ogiltigt val. Vänligen välj 1 eller 2.");
        }

        scanner.close();
    }

    public static void kortBetalning() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ange kortnummer:");
        String kortnummer = scanner.next();

        System.out.println("Ange utgångsdatum (MM/ÅÅ):");
        String utgangsdatum = scanner.next();

        System.out.println("Kort betalning genomförd.Tack!");
    }

    public static void kontantBetalning() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ange belopp att betala kontant:");
        double belopp = scanner.nextDouble();

        System.out.println("Kontant betalning genomförd. Tack!");
    }
}
