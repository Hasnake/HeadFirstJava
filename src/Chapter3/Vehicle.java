package Chapter3;

/**
 * Created by hasnake on 5/3/18.
 */

// numOfWheels, fuelTankCapcity, maxSpeed, numOfGallonGasTank, modelName,
// color, numOfSeats, modelSubClass, navigationGPS

// create a new Vehicle object
// printout the field name and the value
// System.out.println("fieldname : " + numOfWheels);

public class Vehicle {
    public static void main(String[] args){
        int numOfWheels=10;
        double fuelTankCapacity=24.6;
        float maxSpeed=10.888f;
        double numOfGallonGasTank=8;
        String modelName="Toyota";
        String color="Blue";
        int numOfSeats=8;
        String modelSubClass="Camry";
        Boolean navigationGPS=true;
        Vehicle toyota =new Vehicle();
        System.out.println("fieldname : " + numOfWheels);

    }
}
