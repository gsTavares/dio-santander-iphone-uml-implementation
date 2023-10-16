package br.com.iphone.model.phone.device;

import java.util.List;
import java.util.Optional;
import java.util.function.Predicate;

import br.com.iphone.model.phone.Contact;

public class PhoneDevice implements PhoneDeviceActions {

    List<Contact> contacts;

    public PhoneDevice() {

    }

    public PhoneDevice(List<Contact> contacts) {
        this.contacts = contacts;
    }

    public List<Contact> getContacts() {
        return contacts;
    }

    public void setContacts(List<Contact> contacts) {
        this.contacts = contacts;
    }

    @Override
    public void attend(String phoneNumber) {
        Predicate<Contact> findByPhoneNumber = c -> c.getPhoneNumber().equals(phoneNumber);
        Optional<Contact> contact = contacts.stream().filter(findByPhoneNumber).findFirst();
        contact.ifPresentOrElse(
                (c) -> System.out.println("Answering " + c.getName() + " call"),
                () -> System.out.println("Answering " + phoneNumber + " call"));

    }

    @Override
    public void call(Contact contact) {
        System.out.println("Calling to " + contact.getPhoneNumber() + " ("  + contact.getName() + ")");
    }

    @Override
    public void sendVoiceMail(Contact contact) {
        System.out.println("Sending voicemail to " + contact.getName());
    }

}
