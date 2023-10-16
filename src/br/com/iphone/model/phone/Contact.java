package br.com.iphone.model.phone;

import br.com.iphone.model.Person;

public class Contact extends Person {
    
    private String phoneNumber;

    public Contact() {
        super();
    }

    public Contact(String phoneNumber, String name){
        super(name);
        this.phoneNumber = phoneNumber;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

}
