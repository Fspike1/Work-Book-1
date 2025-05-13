package Workbook5;

public class Vehicles {
    private String color;
    private int numOfWheels;
    private String numOfPassengers;
    private int cargoCapacity;
    private int fuelCapacity;

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
        System.out.println("The vehicle color is: " + getColor());
    }

    public int getNumOfWheels() {
        return numOfWheels;


    }

    public void setNumOfWheels(int numOfWheels) {
        this.numOfWheels = numOfWheels;
        System.out.println("This vehicle has: " + getNumOfWheels() + " wheels");
    }

    public String getNumOfPassengers() {
        return numOfPassengers;
    }

    public void setNumOfPassengers(String numOfPassengers) {
        this.numOfPassengers = numOfPassengers;
        System.out.println("This vehicle has: " + getNumOfPassengers() + "passengers." );
    }

    public int getCargoCapacity() {
        return cargoCapacity;
    }

    public void setCargoCapacity(int cargoCapacity) {
        this.cargoCapacity = cargoCapacity;
        System.out.println("This vehicle has a max capacity of: " + getCargoCapacity());
    }

    public int getFuelCapacity() {
        return fuelCapacity;
    }

    public void setFuelCapacity(int fuelCapacity) {
        this.fuelCapacity = fuelCapacity;
        System.out.println("This vehicle's fuel capacity is: " + getFuelCapacity() );
    }


}


