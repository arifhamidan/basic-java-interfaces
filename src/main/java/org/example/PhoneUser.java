package org.example;

import org.interfaces.Phone;
public class PhoneUser {
    private Phone phone;
    public PhoneUser (Phone phone){
        this.phone =phone;
    }

    public void turnOnThePhone(){
        this.phone.powerOn();
    }
    public void turnOffThePhone(){
        this.phone.powerOff();
    }

    public void makePhoneLouder(){
        this.phone.volumeUp();
    }
    public void makePhoneSilent(){
        this.phone.volumeDown();
    }
    //getter dan setter
    public Phone getPhone(){
        return this.phone;
    }
    public void setPhone(){
        this.phone = phone;
    }

}
