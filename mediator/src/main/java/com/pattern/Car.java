package com.pattern;

public class Car {
    
    private Mediator mediator;

    public void setMediator(Mediator mediator) {
        this.mediator = mediator;
    }

    public void starts() {
        mediator.startCar();
    }

    public void turnOff() {
        mediator.turnOffCar();
    }
}
