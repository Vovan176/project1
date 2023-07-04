import java.util.*;

public class ContactBook {
    private List<Contact> contacts;
    private String name;

    public ContactBook() {
        contacts = new ArrayList<>();
    }

    public void addContact(String name, String phoneNumber) {
        Contact contact = new Contact(name, phoneNumber);
        contacts.add(contact);
        System.out.println("Контакт додано: " + contact);
    }

    public void deleteContact(String name) {
        boolean found = false;
        Iterator<Contact> iterator = contacts.iterator();
        while (iterator.hasNext()) {
            Contact contact = iterator.next();
            if (contact.getName().equalsIgnoreCase(name)) {
                iterator.remove();
                System.out.println("Контакт видалено: " + contact);
                found = true;
                break;
            }
        }
        if (!found) {
            System.out.println("Контакт з іменем '" + name + "' не знайдено.");
        }
    }

    public void showAllContacts() {
        for (Contact contact : contacts) {
            System.out.println(contact);
        }
    }

    public void searchByName(String searchName) {
        boolean found = false;
        for (Contact contact : contacts) {
            if (contact.getName().equalsIgnoreCase(name)) {
                System.out.println("Знайдений контакт: " + contact);
                found = true;
                break;
            }
        }
        if (!found) {
            System.out.println("Контакт з іменем '" + name + "' не знайдено.");
        }
    }

    public void searchByNumber(String number) {
        boolean found = false;
        for (Contact contact : contacts) {
            if (contact.getPhoneNumber().equals(number)) {
                System.out.println("Знайдений контакт: " + contact);
                found = true;
                break;
            }
        }
        if (!found) {
            System.out.println("Контакт за номером '" + number + "' не знайдено.");
        }
    }

    public void editContact(String name) {
        boolean found = false;
        for (Contact contact : contacts) {
            if (contact.getName().equalsIgnoreCase(name)) {
                System.out.print("Введіть нове ім'я: ");
                String newName = new Scanner(System.in).nextLine();
                System.out.print("Введіть новий номер телефону: ");
                String newPhoneNumber = new Scanner(System.in).nextLine();
                contact.setName(newName);
                contact.setPhoneNumber(newPhoneNumber);
                System.out.println("Контакт відредаговано: " + contact);
                found = true;
                break;
            }
        }
        if (!found) {
            System.out.println("Контакт з іменем '" + name + "' не знайдено.");
        }
    }
}