package com.pattern;

public class Mediator {
    
    private Radio radio;
    private Phone phone;
    private Car car;
    
    public Mediator(Radio radio, Phone phone, Car car) {
        this.radio = radio;
        this.phone = phone;
        this.car = car;
        
        this.radio.setMediator(this);
        this.phone.setMediator(this);
        this.car.setMediator(this);
    }

    public void startCar() {
        radio.starts();
        phone.turnOffMusic();
    }

    public void turnOffCar() {
        radio.turnOff();
    }

    public void phoneRinging() {
        radio.turnOff();
    }

    public void startRadio() {
        phone.turnOffMusic();
    }
}