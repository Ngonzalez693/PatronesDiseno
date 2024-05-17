package com.pattern;

public class Radio {
    
    private boolean on = false;
    private Mediator mediator;

    public void setMediator(Mediator mediator) {
        this.mediator = mediator;
    }

    public void starts() {
        on = true;
        mediator.startRadio();
    }

    public void turnOff() {
        on = false;
    }

    public boolean on() {
        return on;
    }
}
