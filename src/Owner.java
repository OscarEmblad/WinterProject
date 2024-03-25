// Owner-klassen håller  information om en ägare, inklusive namn, kontakt och e-post. Den har metoder för att hämta och presentera ägarinformation samt en metod för att interaktivt fråga användaren om vilken information de vill veta om ägaren.
import java.util.Scanner;

public class Owner {

    // Instansvariabler för ägarens information
    private String name;
    private String contactNumber;
    private String emailAddress;

    // Konstruktor för att skapa en ägare med specificerad information
    public Owner(String name, String contactNumber, String emailAddress) {
        this.name = name;
        this.contactNumber = contactNumber;
        this.emailAddress = emailAddress;
    }

    // Getter-metod för att hämta ägarens namn
    public String getName() {
        return name;
    }

    // Getter-metod för att hämta ägarens kontaktnummer
    public String getContactNumber() {
        return contactNumber;
    }

    // Getter-metod för att hämta ägarens e-postadress
    public String getEmailAddress() {
        return emailAddress;
    }

    // Override av toString-metoden för att skapa en strängrepresentation av ägaren
    @Override
    public String toString() {
        return "Owner{" +
                "name='" + name + '\'' +
                ", contactNumber='" + contactNumber + '\'' +
                ", emailAddress='" + emailAddress + '\'' +
                '}';
    }

    // Metod för att låta användaren fråga om ägarens information
    public void askOwnerInformation() {
        Scanner scanner = new Scanner(System.in);
        boolean continueAsking = true;

        System.out.print("Vill du ha information om ägaren? (Ja/Nej): ");
        String responseOwnerInfo = scanner.nextLine();

        if (responseOwnerInfo.equalsIgnoreCase("Ja")) {
            while (continueAsking) {
                try {
                    System.out.print("Vill du veta ägarens namn? (Ja/Nej): ");
                    String responseName = scanner.nextLine();
                    if (!responseName.equalsIgnoreCase("Ja") && !responseName.equalsIgnoreCase("Nej")) {
                        throw new IllegalArgumentException("Ogiltigt svar. Ange antingen 'Ja' eller 'Nej'.");
                    } else if (responseName.equalsIgnoreCase("Ja")) {
                        System.out.println("Ägarens namn: " + getName());
                    }

                    System.out.print("Vill du veta ägarens kontaktnummer? (Ja/Nej): ");
                    String responseContactNumber = scanner.nextLine();
                    if (!responseContactNumber.equalsIgnoreCase("Ja") && !responseContactNumber.equalsIgnoreCase("Nej")) {
                        throw new IllegalArgumentException("Ogiltigt svar. Ange antingen 'Ja' eller 'Nej'.");
                    } else if (responseContactNumber.equalsIgnoreCase("Ja")) {
                        System.out.println("Ägarens kontaktnummer: " + getContactNumber());
                    }

                    System.out.print("Vill du veta ägarens emailadress? (Ja/Nej): ");
                    String responseEmailAddress = scanner.nextLine();
                    if (!responseEmailAddress.equalsIgnoreCase("Ja") && !responseEmailAddress.equalsIgnoreCase("Nej")) {
                        throw new IllegalArgumentException("Ogiltigt svar. Ange antingen 'Ja' eller 'Nej'.");
                    } else if (responseEmailAddress.equalsIgnoreCase("Ja")) {
                        System.out.println("Ägarens emailadress: " + getEmailAddress());
                    }

                    System.out.print("Känner du dig nöjd? Vill du svara på frågorna igen? (Ja/Nej): ");
                    String responseContinue = scanner.nextLine();
                    if (!responseContinue.equalsIgnoreCase("Ja") && !responseContinue.equalsIgnoreCase("Nej")) {
                        throw new IllegalArgumentException("Ogiltigt svar. Ange antingen 'Ja' eller 'Nej'.");
                    }
                    continueAsking = responseContinue.equalsIgnoreCase("Ja");

                } catch (IllegalArgumentException e) {
                    System.out.println(e.getMessage());
                }
            }
        }

        scanner.close();
    }

    public static void main(String[] args) {
        Owner hotelOwner = new Owner("Steven Bing", "072-5421246", "StevenBing@gmail.com");

        // Skriv ut ägarens information här (om du vill)
        // System.out.println("Hotel Owner Information:");
        // System.out.println(hotelOwner);

        // Anropa askOwnerInformation för att ställa frågor om ägaren
        hotelOwner.askOwnerInformation();
    }
}