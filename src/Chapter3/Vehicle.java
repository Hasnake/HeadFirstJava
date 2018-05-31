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

    int numOfWheels;
    double fuelTankCapacity=24.6;
    float maxSpeed=78.888f;
    double numOfGallonGasTank=8;
    String modelName="v";
    String color="Blue";
    int numOfSeats=8;
    String modelSubClass="Camry";
    Boolean hasNavigationGPS=true;


//Getter and Setter

    public int getNumOfWheels() {
        return this.numOfWheels;

    }

    public void setNumOfWheels(int numOfWheels) {
        this.numOfWheels = 10;
    }


    //Vehicle

    public static void main(String[] args){
        Vehicle v =new Vehicle();

       //System.out.println("numOfWheels:" + v.getNumOfWheels);
        System.out.println("fuelTankCapacity:" + v.fuelTankCapacity);
        System.out.println("maxSpeed:" + v.maxSpeed);
        System.out.println("numOfGallonGasTank:" + v.numOfGallonGasTank);
        System.out.println("modelName:" + v.modelName);
        System.out.println("color:" + v.color);
        System.out.println("numOfSeats:" + v.numOfSeats);
        System.out.println("modelSubClass:" + v.modelSubClass);
        System.out.println("hasNavigationGPS:" + v.hasNavigationGPS);
        System.out.print("Input any model you like: ");
        Scanner input = new Scanner (System.in);
        String yourVehicleOfChoice = input.next();


    }
}
