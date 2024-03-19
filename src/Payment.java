import java.util.InputMismatchException;
import java.util.Scanner;

public class Payment {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Välkommen till betalningssystemet!");
        System.out.println("Vänligen välj betalningsmetod:");
        System.out.println("1. Kortbetalning");
        System.out.println("2. Kontantbetalning");

        boolean isValidInput = false;

        while (!isValidInput) {
            try {
                int val = scanner.nextInt();

                switch (val) {
                    case 1 -> isValidInput = kortBetalning();
                    case 2 -> isValidInput = kontantBetalning();
                    default -> {
                        System.out.println("Ogiltigt val. Vänligen välj 1 eller 2.");
                        scanner.nextLine(); // Rensa bufferten
                    }
                }
            } catch (InputMismatchException e) {
                System.out.println("Felaktig inmatning. Ange en giltig siffra. Försök igen.");
                scanner.nextLine(); // Rensa bufferten
            }
        }

        scanner.close();
    }

    public static boolean kortBetalning() {
        Scanner scanner = new Scanner(System.in);

        boolean isValidInput = false;

        while (!isValidInput) {
            try {
                System.out.println("Belopp 5000. Ange kortnummer (Sista 4 siffror) (XXXX):");
                String kortnummer = scanner.next();

                if (!kortnummer.matches("\\d{4}")) {
                    throw new InputMismatchException("Ogiltigt kortnummer. Ange 4 siffror.");
                }

                System.out.println("Ange utgångsdatum (MM/ÅÅ):");
                String utgangsdatum = scanner.next();

                if (!utgangsdatum.matches("\\d{2}/\\d{2}")) {
                    throw new InputMismatchException("Ogiltigt utgångsdatum. Ange i formatet MM/ÅÅ.");
                }

                System.out.println("Kort betalning genomförd. Tack!");
                isValidInput = true;
            } catch (InputMismatchException e) {
                System.out.println("Felaktig inmatning: " + e.getMessage());
                scanner.nextLine(); // Rensa bufferten
            }
        }

        // scanner.close(); // Ta inte bort kommentaren här
        return isValidInput;
    }

    public static boolean kontantBetalning() {
        Scanner scanner = new Scanner(System.in);

        boolean isValidInput = false;

        while (!isValidInput) {
            try {
                System.out.println("Belopp 5000. Ange 5000 för att betala!:");
                double belopp = scanner.nextDouble();

                if (belopp != 5000) {
                    throw new InputMismatchException("Ogiltigt belopp. Ange 5000.");
                }

                System.out.println("Kontant betalning genomförd. Tack!");
                isValidInput = true;
            } catch (InputMismatchException e) {
                System.out.println("Felaktig summa: " + e.getMessage());
                scanner.nextLine(); // Rensa bufferten
            }
        }

        // scanner.close(); // Ta inte bort kommentaren här
        return isValidInput;
    }
}