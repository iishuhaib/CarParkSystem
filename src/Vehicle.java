
abstract public class Vehicle {
	protected String plateID;
	protected String brandName;
	protected DateTime entryTime;

	// constructor
	Vehicle(String id, String brand, DateTime entryTime) {
		this.plateID = id;
		this.brandName = brand;
		this.entryTime = entryTime;
	}

	public String getPlateID() {
		return plateID;
	}

	// setter for vehicle idPlate
	public void setPlateID(String id) {
		this.plateID = id;
	}

	public String getBrandname() {
		return brandName;
	}

	// setter for vehicle brandName
	public void setBrandName(String brand) {
		this.brandName = brand;
	}

	public String getEntryTime() {
		return entryTime.getHours() + " : " + entryTime.getMins() + " " + entryTime.getDay() + " / " + entryTime.getMonth()
				+ " / " + entryTime.getYear();
	}

	public void setEntryTime(DateTime entryTime) {
		this.entryTime = entryTime;
	}

	public DateTime getEntryTimeObject() {
		return entryTime;
	}
}
