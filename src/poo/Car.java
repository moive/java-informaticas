package poo;

public class Car {
	private int wheels;
	private int large;
	private int width;
	private int engine;
	private int weigth;
	String color;
	int totalWeigth;
	boolean leatherSeats, climateControl;
	
	public Car() {
		wheels = 4;
		large = 2000;
		width = 300;
		engine = 1600;
		weigth = 500;
	}
	
	public String getLarge() {
		return "The large of the car is " + large;
	}
	
	public void set_color() {
		color = "blue";
	}
	
	public String getColor() {
		return "The color of the car is: " + color;
	}
}