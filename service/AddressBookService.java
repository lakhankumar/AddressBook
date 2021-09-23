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

    @Override
    public void editContact() {
        int choice = 1;
        final int exit = 7;
        boolean flag = false;
        System.out.println("enter person first name you want to edit");
        String firstName = scan.nextLine();
        while (choice != exit) {
            for (int i = 0; i < addressBook.size(); i++) {
                if (addressBook.get(i).getFirstName().equalsIgnoreCase(firstName)) {
                    flag=true;
                    AddressBookModel person = addressBook.get(i);
                    System.out.println("Hi  " + person.getFirstName());
                    System.out.println("which field you want to edit\n1. Address\n2. City\n3. State\n4. Zipcode\n" +
                            "5. Phone Number\n6. Email\n7. Exit");
                    choice = scan.nextInt();
                    switch (choice) {
                        case 1:
                            System.out.println("Hi Person " + person.getFirstName() + " Please edit your address");
                            String address = scan.nextLine();
                            scan.next();
                            person.setAddress(address);
                            break;
                        case 2:
                            System.out.println("Hi  " + person.getFirstName() + " Please edit your city");
                            String city = scan.next();
                            person.setCity(city);
                            break;
                        case 3:
                            System.out.println("Hi " + person.getFirstName() + " Please edit your state");
                            String state = scan.next();
                            person.setState(state);
                            break;
                        case 4:
                            System.out.println("Hi " + person.getFirstName() + " Please edit your zip");
                            String zip = scan.next();
                            person.setZip(zip);
                            break;
                        case 5:
                            System.out.println("Hi " + person.getFirstName() + " Please edit your phone number");
                            String phone = scan.next();
                            person.setPhoneNumber(phone);
                            break;
                        case 6:
                            System.out.println("Hi " + person.getFirstName() + " Please edit your email address");
                            String email = scan.next();
                            person.setEmail(email);
                            break;
                    }
                }
            }
            if (flag==false){
                System.out.println("Person details are invalid");
                break;
            }
            else {
                System.out.println("your contact details have been successfully updated");
            }
        }
    }
}
