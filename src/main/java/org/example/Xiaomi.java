package org.example;

import org.interfaces.Phone;

public class Xiaomi implements Phone{
    private int volume;
    private boolean isPowerOn;

    public Xiaomi(){
        //set volume awal atau default
        this.volume = 50;
    }
    //override semua method abstract yang ada di interface Phone
    public void powerOn(){
        isPowerOn = true;
        System.out.println("Handphone menyala ...");
        System.out.println("Selamat datang di Xiaomi");
        System.out.println("Android version 10");
    }
    public void powerOff(){
        isPowerOn = false;
        System.out.println("Mematikan Handphone");
    }

    public void volumeUp(){
        if(isPowerOn){
            if (this.volume == MAX_VOLUME){
                System.out.println("Vol sudah maksimal!!!");
                System.out.println("Volume "+ this.volume+ "%");
            }else{
                this.volume +=10;
                System.out.println("Volume sekarang "+ this.volume);
            }
        }else {
            System.out.println("Handphone mati, silahkan dinyalakan !!!");
        }
    }

    public void volumeDown(){
        if(isPowerOn){
            if(this.volume == MIN_VOLUME){
                System.out.println("Volume = " +this.volume + "%");
            }else {
                this.volume -=10;
                System.out.println("Vol Sekarang " + this.volume + " %");
            }
        }else {
            System.out.println("Handphone mati, silahkan nyalakan dulu !!!");
        }
    }

    //getter dan setter
    public int getVolume(){
        return volume;
    }
    public void setVolume(int volume){
        this.volume=volume;
    }
    public boolean isPowerOn(){
        return isPowerOn;
    }
    public void setPowerOn(boolean isPowerOn){
        this.isPowerOn = isPowerOn;
    }

}
