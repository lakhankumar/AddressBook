package controller;

import model.AddressBookModel;

public class AddressBookMain {
    public static void main(String[] args) {
        System.out.println("Welcome to address book");
        AddressBookModel addressBookModel = new AddressBookModel("lakhan","torne","attapur",
                                            "hyderabd","telangana","500048","905904xxxx",
                                            "lakhan@gmail.com");
        System.out.println(addressBookModel);
    }

}
