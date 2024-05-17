package com.pattern;

public class Config {
    private Radio radio;
    private Phone phone;
    private Car car;
    private Mediator mediator;

    public void initialize() {
        radio = new Radio();
        phone = new Phone();
        car = new Car();

        mediator = new Mediator(radio, phone, car);
    }

    public void demonstrateSystem() {
        System.out.println("Estado inicial:");
        System.out.println("Radio encendida: " + radio.on());
        System.out.println("Música en teléfono: " + phone.musicOn());

        phone.turnOnMusic();
        System.out.println("\nMúsica encendida en el teléfono.");
        System.out.println("Música en teléfono: " + phone.musicOn());

        car.starts();
        System.out.println("\nCoche encendido.");
        System.out.println("Radio encendida: " + radio.on());
        System.out.println("Música en teléfono: " + phone.musicOn());

        car.turnOff();
        System.out.println("\nCoche apagado.");
        System.out.println("Radio encendida: " + radio.on());

        radio.starts();
        System.out.println("\nRadio encendida manualmente.");
        System.out.println("Radio encendida: " + radio.on());
        System.out.println("Música en teléfono: " + phone.musicOn());

        phone.phoneCall();
        System.out.println("\nLlamada telefónica entrante.");
        System.out.println("Radio encendida: " + radio.on());
    }
}
