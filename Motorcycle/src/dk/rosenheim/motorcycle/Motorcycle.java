package dk.rosenheim.motorcycle;

public class Motorcycle {

	public int rpm, gear;
	public String name;
	public Boolean started;

	public void motorcycle(Boolean started, int rpm, int gear, String name) {
		this.rpm = rpm;
		this.gear = gear;
		this.started = started;
		this.name = name;
	}

	// Start and stop
	public void start() {
		this.started = true;
		this.gear = 0;
		this.rpm = 1000;
	}
	public void stop() {
		this.started = false;
		this.gear = 0;
		this.rpm = 0;
	}

	// Get engine status as true/false
	public Boolean isStarted() {
		return this.started;
	}

	// Set/get Name
	public void setName(String name) {
		this.name = name;
	}
	public String getName() {
		return this.name;
	}

	// Set/get RPM
	public void setRpm(int rpm) {
		if (rpm > 8000) {
			this.rpm = 8000;
		} else if (rpm < 1000) {
			stop();
		} else {
			this.rpm = rpm;
		}
	}
	public int getRpm() {
		return this.rpm;
	}

	// Get speed
	public int getSpeed() {
		int speed;
		speed = this.rpm * this.gear / 200;
		return speed;
	}

	// Change gear
	public void shiftGearsUp() {
		if (this.isStarted()) {
			if (this.gear < 5) {
				this.gear = this.gear + 1;
			}
		}
	}
	public void shiftGearDown(int g) {
		if (this.gear > g && g > 0) {
			this.gear = g;
		}
	}

	// Get gear
	public int getGear(){
		return this.gear;
	}

	// Output all stats
	@Override
	public String toString(){
		System.out.println("Status of \"" + getName() + "\"");
		if(!this.isStarted()) {
			System.out.println("Engine is off.");
		}
		else {
			System.out.println("Engine status:  On");
			System.out.println("      RPM:      " + getRpm());
			System.out.println(" Current gear:  " + getGear());
			System.out.println("     Speed:     " + getSpeed() + "km/h");
			if(getSpeed() == 0){
				System.out.println("Ya standing still, mate.");
			}
		}
		return null;
	}
}