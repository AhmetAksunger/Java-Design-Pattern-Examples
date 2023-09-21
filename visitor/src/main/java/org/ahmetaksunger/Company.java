package org.ahmetaksunger;

public class Company extends Client {

    public Company(String name, String surname, String address, String phoneNumber) {
        super(name, surname, address, phoneNumber);
    }

    @Override
    public void sendMail(Visitor visitor) {
        visitor.visit(this);
    }

    @Override
    public String toString() {
        return "Company{" +
                "name='" + getName() + '\'' +
                ", surname='" + getSurname() + '\'' +
                ", address='" + getAddress() + '\'' +
                ", phoneNumber='" + getPhoneNumber() + '\'' +
                '}';
    }
}
