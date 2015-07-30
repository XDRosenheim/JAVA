package dk.rosenheim.motorcycle;

public class Main {

    public static void main(String[] args) {
		Motorcycle myBike = new Motorcycle();

	    myBike.setName("Honda");
	    myBike.start();
	    myBike.toString();
	    myBike.shiftGearsUp();
		myBike.setRpm(2000);
	    myBike.shiftGearsUp();
	    myBike.setRpm(3500);
	    myBike.shiftGearsUp();
	    myBike.setRpm(4000);
	    myBike.shiftGearsUp();
	    myBike.shiftGearsUp();
	    myBike.setRpm(3500);
	    myBike.toString();
	    myBike.shiftGearDown(2);
	    myBike.setRpm(1200);
	    myBike.toString();
	    myBike.shiftGearDown(0);
	    myBike.setRpm(1000);
	    myBike.stop();
	    myBike.toString();
    }
}
