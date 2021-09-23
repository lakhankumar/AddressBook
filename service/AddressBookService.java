package service;

import model.AddressBookModel;

import java.util.ArrayList;
import java.util.Scanner;

public class AddressBookService implements IAddressBook {

    private static AddressBookService instance;
    private ArrayList<AddressBookModel> addressBook = new ArrayList<>();
    Scanner scan = new Scanner(System.in);

    private AddressBookService() {
    }

    public static synchronized AddressBookService getInstance() {
        if (instance == null) {
            instance = new AddressBookService();
        }
        return instance;
    }

    @Override
    public void addPerson() {
        AddressBookModel person1 = new AddressBookModel("lakhan","kumar","attapur",
                                    "hyderabad","telangana","500048","905904xxx","lakhan@gmail.com");
        addressBook.add(person1);
    }

    @Override
    public void newPerson() {
        System.out.println("Enter the Firstname: ");
        String firstName = scan.nextLine();
        System.out.println("Enter the Lastname: ");
        String lastName = scan.nextLine();
        System.out.println("Enter the Address: ");
        String address = scan.nextLine();
        System.out.println("Enter the City: ");
        String city = scan.nextLine();
        System.out.println("Enter the State: ");
        String state = scan.nextLine();
        System.out.println("Enter the Zip code: ");
        String zip = scan.nextLine();
        System.out.println("Enter the Phone Number: ");
        String phoneNumber = scan.nextLine();
        System.out.println("Enter the Email");
        String email = scan.nextLine();
        AddressBookModel person2 = new AddressBookModel(firstName, lastName, address, city, state, zip, phoneNumber, email);
        addressBook.add(person2);
        System.out.println("Successfully Added!!");
    }

    @Override
    public void display() {
        for (AddressBookModel person : addressBook) {
            System.out.println(person);
        }
    }
}
