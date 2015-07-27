package dk.rosenheim.H4;

public class HelloWorld {

	public static void main(String[] args) {
		int thisIsAInt = 0;
		System.out.println("Hello, World!");
		
		while (thisIsAInt < 10) {
			for (int i = 0; i == thisIsAInt; i++) {
				if (thisIsAInt > 5) {
					System.out.println(thisIsAInt);
				}
				else {
					System.out.println("thisIsAInt is not over 5!");
					System.out.println("thisIsAInt is currently: " + thisIsAInt);
					System.out.println("Adding 1 to thisIsAInt");
					thisIsAInt++;
				}
			}
		}
		System.out.println(thisIsAInt);
	}
}