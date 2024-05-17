package com.pattern;

public class Phone {
    
    private boolean musicOn = false;
    private Mediator mediator;

    public void setMediator(Mediator mediator) {
        this.mediator = mediator;
    }

    public void phoneCall() {
        mediator.phoneRinging();
    }

    public void turnOnMusic() {
        musicOn = true;
    }

    public void turnOffMusic() {
        musicOn = false;
    }

    public boolean musicOn() {
        return musicOn;
    }
}
