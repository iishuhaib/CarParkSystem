
public class Car extends Vehicle{
	private int noOfDoors;
	private String carColor;
	
	public Car(String id, String brand, DateTime entryTime, int noOfDoors, String carColor) {
		super(id, brand, entryTime);
		this.noOfDoors = noOfDoors;
		this.carColor = carColor;
	}
	public int getNoOfDoors() {
		return noOfDoors;
	}
	public void setNoOfDoors(int noOfDoors) {
		this.noOfDoors = noOfDoors;
	}
	public String getCarColor() {
		return carColor;
	}
	public void setCarColor(String carColor) {
		this.carColor = carColor;
	}
}
