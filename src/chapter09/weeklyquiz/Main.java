package chapter09.weeklyquiz;

import java.util.Scanner;

public class Main {
	static Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) {

		while (true) {
			showMenu();
			int num = scanner.nextInt();
			scanner.nextLine();

			switch (num) {
				case 1:
					businessContactAdd();
					break;
				case 2:
					personalContactAdd();
					break;
				case 3:
					AddressBook.displayContacts();
					break;
				case 4:
					System.out.print("검색할 이름을 입력하세요: ");
					String str = scanner.nextLine();
					AddressBook.searchContact(str);
					break;
				case 5:
					System.out.println("프로그램을 종료합니다.");
					return;
				default:
					System.out.println("올바른 번호를 입력하세요.");
			}

		}
	}

	public static void showMenu() {
		System.out.println("1. 비즈니스 연락처 추가");
		System.out.println("2. 개인 연락처 추가");
		System.out.println("3. 연락처 출력");
		System.out.println("4. 연락처 검색");
		System.out.println("5. 종료");
		System.out.print("메뉴를 선택해주세요: ");
	}

	public static void businessContactAdd() {
		BusinessContact contact = new BusinessContact();

		System.out.print("이름을 입력하세요: ");
		String name = scanner.nextLine();

		System.out.print("전화번호를 입력하세요: ");
		String tel = scanner.nextLine();

		System.out.print("회사명을 입력하세요: ");
		String company = scanner.nextLine();

		contact.setName(name);
		contact.setPhoneNumber(tel);
		contact.setCompany(company);

		AddressBook.addList(contact);

	}

	public static void personalContactAdd() {
		PersonalContact contact = new PersonalContact();

		System.out.print("이름을 입력하세요: ");
		String name = scanner.nextLine();

		System.out.print("전화번호를 입력하세요: ");
		String tel = scanner.nextLine();

		System.out.print("관계를 입력하세요: ");
		String relationship = scanner.nextLine();

		contact.setName(name);
		contact.setPhoneNumber(tel);
		contact.setRelationship(relationship);

		AddressBook.addList(contact);
	}
}
