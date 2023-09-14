package day1assignment;

public class Car {
public void applygear() {
	System.out.println("applyGear");
}
public void switchOnAc() {
	System.out.println("switchOnAc");
}
public void applyAcclerate() {
	System.out.println("applyAcclerate");
}
public static void main(String[] args) {
	Car audi = new Car();
	audi.applygear();
	audi.switchOnAc();
	audi.applyAcclerate();
}
}
