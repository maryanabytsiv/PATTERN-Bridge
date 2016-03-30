package main;

import hardware.Glass;
import hardware.Pan;
import hardware.Plate;
import washer.Relative;
import washer.WashingMachine;
import washer.Yourself;

public class Main {
	
	public static void main(String[] args) {
		
		Plate plate = new Plate(new WashingMachine());
		plate.wash();
		
		Pan pan = new Pan(new Yourself());
		pan.wash();
		
		Glass glass = new Glass(new Relative());
		glass.wash();
	}
}
