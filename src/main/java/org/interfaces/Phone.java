package org.interfaces;

public interface Phone {
    // constant field/attribute
    int MAX_VOLUME = 100;
    int MIN_VOLUME = 0;

    //abstract method;
    void powerOn();
    void powerOff();
    void volumeUp();
    void volumeDown();

}