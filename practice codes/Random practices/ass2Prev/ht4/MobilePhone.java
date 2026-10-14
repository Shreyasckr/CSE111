public class MobilePhone {
    private String[] contactNames;
    private int[] contactNumbers;
    private int contactCapacity;
    private int contactCount;

    // Method to set the maximum storage for contacts
    public void setContactCapacity(int capacity) {
        this.contactCapacity = capacity;
        this.contactNames = new String[capacity];
        this.contactNumbers = new int[capacity];
        this.contactCount = 0;
    }

    // Method to add a new contact if space is available
    public void addContact(String name, int number) {
        if (contactCount < contactCapacity) {
            contactNames[contactCount] = name;
            contactNumbers[contactCount] = number;
            contactCount++;
            System.out.println("The contact of " + name + " is added.");
        } else {
            System.out.println("Storage Full!!");
        }
    }

    // Method to display current status and contact list
    public void details() {
        System.out.println("Total Contacts: " + contactCount);
        System.out.println("Contact List:");
        for (int i = 0; i < contactCount; i++) {
            System.out.println(contactNames[i] + ":" + contactNumbers[i]);
        }
    }

    // Method to simulate making a call by searching for a number
    public void makeCall(int number) {
        String foundName = "";
        boolean exists = false;

        for (int i = 0; i < contactCount; i++) {
            if (contactNumbers[i] == number) {
                foundName = contactNames[i];
                exists = true;
                break;
            }
        }

        if (exists) {
            System.out.println("Calling " + foundName + " . . .");
        } else {
            System.out.println("Calling " + number + " . . .");
        }
    }
}