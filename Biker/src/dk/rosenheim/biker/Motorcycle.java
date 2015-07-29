package dk.rosenheim.biker;

public class Motorcycle {

	public int rpm, gear;
	public String name;
	public Boolean started;

	public void motorcycle(Boolean started, int rpm, int gear, String name){
		this.rpm = rpm;
		this.gear = gear;
		this.started = started;
		this.name = name;
	}

	public void start(){
		this.started = true;
		this.gear = 0;
		this.rpm = 1000;
	}
	public void stop(){
		this.started = false;
		this.gear = 0;
		this.rpm = 0;
	}

	public Boolean isStarted(){
		return this.started;
	}

	public void setName(String name){
		this.name = name;
	}
	public String getName(){
		return this.name;
	}

	public void setRpm(int rpm){
		if (rpm > 8000){
			this.rpm = 8000;
		}
		else if (rpm < 1000){
			stop();
		}
		else {
			this.rpm = rpm;
		}
	}
	public int getRpm(){
		return this.rpm;
	}

	public getSpeed(){
		int speed;
		speed = this.rpm * this.gear / 200;
		return speed;
	}

	public void shiftGearsUp(){
		if(this.isStarted() == true){
			if(this.gear < 5){
				this.gear = this.gear++;
			}
		}
	}
	public void shiftGearDown(int g){
		if(this.gear < g && g > 0){
	}
}
