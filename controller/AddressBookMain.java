package controller;

import service.AddressBookService;

import java.util.Scanner;

public class AddressBookMain {
    public static void main(String[] args) {
        System.out.println("Welcome to address book");
        AddressBookMain.userMain();
    }

    private static void userMain() {
        Scanner scanner = new Scanner(System.in);
        int choice = 0;
        final int exit = 10;
        while (choice != exit) {
            System.out.println("Enter your choice \n1. add person\n2. print address book\n3. edit contact\n4. delete contact\n10. exit\n");
            choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    AddressBookService.getInstance().addPerson();
                    break;
                case 2:
                    AddressBookService.getInstance().display();
                    break;
                case 3:
                    AddressBookService.getInstance().editContact();
                    break;
                case 4:
                    AddressBookService.getInstance().deleteContact();
                    break;
            }
        }
    }
}
