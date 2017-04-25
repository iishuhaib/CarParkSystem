
public class MotorBike extends Vehicle {
	protected int bikeEngineSize;

	MotorBike(String id, String brand, DateTime entryTime, int size) {
		super(id, brand, entryTime);
		this.bikeEngineSize = size;
	}

	// setter for vehicle engineSize
	public void setEngineSize(int size) {
		bikeEngineSize = size;
	}

	// getter for vehicle engineSize
	public int getEngineSize() {
		return bikeEngineSize;
	}
}
