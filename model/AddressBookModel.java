package model;

public class AddressBookModel {
    String firstName;
    String lastNames;
    String address;
    String city;
    String state;
    String zip;
    String phoneNumber;
    String email;

    public AddressBookModel(String firstName, String lastNames, String address, String city,
                            String state, String zip, String phoneNumber, String email) {
        this.firstName = firstName;
        this.lastNames = lastNames;
        this.address = address;
        this.city = city;
        this.state = state;
        this.zip = zip;
        this.phoneNumber = phoneNumber;
        this.email = email;
    }
    
    @Override
    public String toString() {
        return "AddressBookModel{" +
                "firstName='" + firstName + '\'' +
                ", lastNames='" + lastNames + '\'' +
                ", address='" + address + '\'' +
                ", city='" + city + '\'' +
                ", state='" + state + '\'' +
                ", zip='" + zip + '\'' +
                ", phoneNumber='" + phoneNumber + '\'' +
                ", email='" + email + '\'' +
                '}';
    }

}
