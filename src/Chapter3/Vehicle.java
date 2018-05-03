package Chapter3;
import java.util.Scanner;

/**
 * Created by hasnake on 5/3/18.
 */

// numOfWheels, fuelTankCapcity, maxSpeed, numOfGallonGasTank, modelName,
// color, numOfSeats, modelSubClass, navigationGPS

// create a new Vehicle object
// printout the field name and the value
// System.out.println("fieldname : " + numOfWheels);

public class Vehicle {

    int numOfWheels=10;
    double fuelTankCapacity=24.6;
    float maxSpeed=78.888f;
    double numOfGallonGasTank=8;
    String modelName="Toyota";
    String color="Blue";
    int numOfSeats=8;
    String modelSubClass="Camry";
    Boolean hasNavigationGPS=true;


    public static void main(String[] args){
        Vehicle toyota =new Vehicle();

        System.out.println("numOfWheels:" + toyota.numOfWheels);
        System.out.println("fuelTankCapacity:" + toyota.fuelTankCapacity);
        System.out.println("maxSpeed:" + toyota.maxSpeed);
        System.out.println("numOfGallonGasTank:" + toyota.numOfGallonGasTank);
        System.out.println("modelName:" + toyota.modelName);
        System.out.println("color:" + toyota.color);
        System.out.println("numOfSeats:" + toyota.numOfSeats);
        System.out.println("modelSubClass:" + toyota.modelSubClass);
        System.out.println("hasNavigationGPS:" + toyota.hasNavigationGPS);
        System.out.print("Input any model you like: ");
        Scanner input = new Scanner (System.in);
        String yourVehicleOfChoice = input.next();


    }
}
