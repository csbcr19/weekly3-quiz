package weekly3;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
public class AddressBook {
    List <Contact> contacts = new ArrayList<>();

    public void displayContacts() {
        if (contacts.isEmpty()) {
            System.out.println("연락처가 비어있습니다.");
        } else {
            for (Contact contact : contacts) {
                System.out.println(contact.getName() + ", " + contact.getPhoneNumber());
            }
        }
    }
    public void searchContact(String name) {
        Scanner sc = new Scanner(System.in);
        System.out.print("검색할 이름을 입력하세요: ");
        String name = sc.next();
        for (Contact contact : contacts) {
            if (contact.getName().equals(name)) {
                System.out.println(contact.getName() + ", " + contact.getPhoneNumber());
            }
        }

        System.out.println("연락처를 찾을 수 없습니다.");
    }
}
