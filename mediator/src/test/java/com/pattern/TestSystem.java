package com.pattern;

import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;

public class TestSystem {

	private Radio radio;
	private Phone phone;
	private Car car;
	private Mediator mediator;
	
	@Before
	public void init() {
        radio = new Radio();
        phone = new Phone();
        car = new Car();
        mediator = new Mediator(radio, phone, car);
    }
	
	@Test
	public void test_on_off_car() {
		assertFalse(radio.on());
		assertFalse(phone.musicOn());
		
		phone.turnOnMusic();
		assertTrue(phone.musicOn());
		
		car.starts();
		
		assertTrue(radio.on());
		assertFalse(phone.musicOn());
	
		car.turnOff();
		assertFalse(radio.on());
	}

	@Test
	public void test_ring_phone() {
		radio.starts();
		assertTrue(radio.on());
		
		phone.phoneCall();
		
		assertFalse(radio.on());
	}
	
	@Test
	public void test_enciende_radio() {
		
		phone.turnOnMusic();
		assertTrue(phone.musicOn());
		
		radio.starts();
		
		assertFalse(phone.musicOn());
	}
}
