public class Owner {

    private String name;
    private String contactNumber;
    private String emailAddress;

    public Owner(String name, String contactNumber, String emailAddress) {
        this.name = name;
        this.contactNumber = contactNumber;
        this.emailAddress = emailAddress;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getContactNumber() {
        return contactNumber;
    }

    public void setContactNumber(String contactNumber) {
        this.contactNumber = contactNumber;
    }

    public String getEmailAddress() {
        return emailAddress;
    }

    public void setEmailAddress(String emailAddress) {
        this.emailAddress = emailAddress;
    }

    @Override
    public String toString() {
        return "HotelOwner{" +
                "name='" + name + '\'' +
                ", contactNumber='" + contactNumber + '\'' +
                ", emailAddress='" + emailAddress + '\'' +
                '}';
    }

    public static void main(String[] args) {
        // Exempel på användning
        Owner hotelOwner = new Owner("Steven Bing", "123-4567890", "StevenBing@gmail.com");
        System.out.println("Hotel Owner Information:");
        System.out.println(hotelOwner);
    }
}