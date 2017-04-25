
public class Van extends Vehicle{
    private double cargoVolume;
    
    Van(String id, String brand, DateTime entryTime, double volume){
        super(id, brand, entryTime);
        this.cargoVolume = volume;
    }
    
    //setter for vehicle cargoVolume
    public void setCargoVolume(double volume){ 
        cargoVolume = volume;
    }
    
    //getter for vehicle cargoVolume
    public double getCargoVolume(){ 
        return cargoVolume;
    }
}
