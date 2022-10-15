package SingleResponsiblity;

public class Test2 {

	public static void main(String[] args) {
		Transportaion vehicle = new Transportaion();
		vehicle.run("Truck");
		vehicle.fly("Plane");
		vehicle.swim("Ship");

	}

}

class Transportaion {

	public void run(String vehicle) {
		System.out.println(vehicle + " is running on the road.");
	}

	public void fly(String vehicle) {
		System.out.println(vehicle + " is running in the air.");
	}

	public void swim(String vehicle) {
		System.out.println(vehicle + " is running on the water.");
	}
}
