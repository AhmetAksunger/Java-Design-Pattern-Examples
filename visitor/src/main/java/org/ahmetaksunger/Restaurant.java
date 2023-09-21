package org.ahmetaksunger;

public class Restaurant extends Client {

    public Restaurant(String name, String surname, String address, String phoneNumber) {
        super(name, surname, address, phoneNumber);
    }

    @Override
    public void sendMail(Visitor visitor) {
        visitor.visit(this);
    }

    @Override
    public String toString() {
        return "Restaurant{" +
                "name='" + getName() + '\'' +
                ", surname='" + getSurname() + '\'' +
                ", address='" + getAddress() + '\'' +
                ", phoneNumber='" + getPhoneNumber() + '\'' +
                '}';
    }
}
