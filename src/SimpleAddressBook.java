import java.util.ArrayList;
import java.util.Scanner;

public class SimpleAddressBook {

    private static ArrayList<Contact> contacts = new ArrayList<>();

    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println();
            System.out.println("1. Add Contact");
            System.out.println("2. View Contacts");
            System.out.println("3. Remove Contact");
            System.out.println("4. Exit");
            System.out.println("Choose an option: ");
            int option = scanner.nextInt();
            scanner.nextLine();
            switch (option) {
                case 1:
                    System.out.println("Enter the Name:");
                    String name = scanner.nextLine();
                    System.out.println("Enter Phone Number");
                    String phoneNumber = scanner.nextLine();
                    contacts.add(new Contact(name, phoneNumber));
                    System.out.println("Contact added..");
                    break;
                case 2:
                    if (contacts.isEmpty()) {
                        System.out.println("No contacts available.");
                    } else {
                        for (int i = 0; i < contacts.size(); i++)
                            System.out.println((i + 1) + ". " + contacts.get(i));
                    }
                    break;
                case 3:
                    System.out.println("Enter contact's index number to remove: ");
                    int index = scanner.nextInt();
                    if (index > 0 && index <= contacts.size()) {
                        contacts.remove(index);
                        System.out.println("Contact removed..");
                    } else
                        System.out.println("Invalid contact index number");
                    break;
                case 4:
                    System.out.println("Exiting...");
                    return;
                default:
                    System.out.println("Invalid option, try again.");
            }
        }
    }

    static class Contact {
        String name;
        String phoneNumber;

        Contact(String name, String phoneNumber) {
            this.name = name;
            this.phoneNumber = phoneNumber;
        }

        @Override
        public String toString() {
            return "Name: " + name + ", Phone Number: " + phoneNumber;
        }
    }
}
