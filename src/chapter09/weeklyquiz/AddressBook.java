package chapter09.weeklyquiz;

import java.util.ArrayList;
import java.util.Scanner;

public class AddressBook {
	Scanner scanner = new Scanner(System.in);
	private static ArrayList<Contact> list = new ArrayList<>();

	public static void displayContacts() {
		if (list.isEmpty())
			System.out.println("연락처가 비어있습니다.");

		for (Contact contact : list) {
			System.out.print("이름: " + contact.getName() + ", 전화번호: " + contact.getPhoneNumber());

			compareClass(contact);
		}
	}

	public static void searchContact(String name) {
		int cnt = 0;

		for (Contact contact : list) {
			if (name.equals(contact.getName())) {
				cnt++;

				System.out.print("이름: " + contact.getName() + ", 전화번호: " + contact.getPhoneNumber());

				compareClass(contact);
			}

		}
		if (cnt == 0)
			System.out.println("연락처를 찾을 수 없습니다.");

		// if (!list.contains(name))
		// 	System.out.println("연락처를 찾을 수 없습니다.");
	}

	public static void addList(Contact contact) {
		list.add(contact);
	}

	public static void compareClass(Contact contact) {
		if (contact instanceof PersonalContact)
			System.out.println(", 관계: " + ((PersonalContact)contact).getRelationship());
		if (contact instanceof BusinessContact)
			System.out.println(", 회사: " + ((BusinessContact)contact).getCompany());
	}
}
