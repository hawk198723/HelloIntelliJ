package SingleResponsiblity;

public class Test1 {

	public static void main(String[] args) {
		RoadTransportaion roadVehicle = new RoadTransportaion();
		roadVehicle.run("Truck");

		AirTransportaion airVehicle = new AirTransportaion();
		airVehicle.run("Jet");
	}

}

	class RoadTransportaion {
		public void run(String vehicle) {
			System.out.println(vehicle + " is running on the road.");
		}
	}
	
	class AirTransportaion {
		public void run(String vehicle) {
			System.out.println(vehicle + " is running in the air.");
		}
	}
	
	class WaterTransportaion {
		public void run(String vehicle) {
			System.out.println(vehicle + " is running on the water.");
		}
	}