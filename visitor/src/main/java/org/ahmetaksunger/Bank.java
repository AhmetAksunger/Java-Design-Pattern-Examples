package org.ahmetaksunger;

import lombok.ToString;

@ToString
public class Bank extends Client {

    public Bank(String name, String surname, String address, String phoneNumber) {
        super(name, surname, address, phoneNumber);
    }

    @Override
    public void sendMail(Visitor visitor) {
        visitor.visit(this);
    }

    @Override
    public String toString() {
        return "Bank{" +
                "name='" + getName() + '\'' +
                ", surname='" + getSurname() + '\'' +
                ", address='" + getAddress() + '\'' +
                ", phoneNumber='" + getPhoneNumber() + '\'' +
                '}';
    }
}
