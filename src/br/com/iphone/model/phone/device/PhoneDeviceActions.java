package br.com.iphone.model.phone.device;

import br.com.iphone.model.phone.Contact;

public interface PhoneDeviceActions  {
    
    void call(Contact contact);
    void attend(String phoneNumber);
    void sendVoiceMail(Contact contact);

}
