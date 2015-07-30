package dk.rosenheim.Person;

public class Person {
	public String name;
	public int age, height;
	public Double weight;

	//Construct
	public void Person(){}
	public void Person(int a, Double w, int h){
		this.age = a;
		this.weight = w;
		this.height = h;
	}
	public void Person(String n, int a, Double w, int h){
		this.name = n;
		this.age = a;
		this.weight = w;
		this.height = h;
	}

	// Set stuff
	public void setName(String n){
		this.name = n;
	}
	public void setAge(int a){
		this.age = a;
	}
	public void setWeight(Double w){
		this.weight = w;
	}
	public void setHeight(int h){
		this.height = h;
	}

	// Get stuff.
	public Double getWeight(){
		return this.weight;
	}
	public int getHeight(){
		return this.height;
	}
	public String getName(){
		return this.name;
	}
	public int getAge(){
		return this.age;
	}

	//BMI Calculation
	public Double getBMI(){
		return this.weight / (this.height * 2);
	}

	// PRINT ALL THE THINGS!
	@Override
	public String toString(){
		System.out.println("Name:   " + this.name);
		System.out.println("Age:    " + this.age);
		System.out.println("Height: " + this.height + "cm");
		System.out.println("Weight: " + this.weight + "kg");
		System.out.println("BMI:    " + getBMI());

		return null;
	}
}
