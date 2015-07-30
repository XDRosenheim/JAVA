package dk.rosenheim.javaTest1;

import java.util.Scanner;

public class Main {

    public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		int[] numbers;
		int higheast, loweast, sum = 0, avg; // Hehe, east.
		while (true) {
			try {
				System.out.println("How many number do you want in the array?");
				int arraySize = input.nextInt();
				numbers = new int[arraySize];
				break;
			} catch(Exception e) {
				System.out.println("Only numbers, mate.");
				input.next();
			}
		}
	    for(int i = 0; i < numbers.length; i++) {
			while(true){
				try{
					System.out.print("Enter the number you want in slot " + i + ": ");
					numbers[i] = input.nextInt();
					break;
				}catch(Exception e){
					System.out.println("Only numbers, mate.");
					input.next();
				}
			}
	    }
	    higheast = numbers[0];
	    loweast = numbers[0];
	    for(int i : numbers) {
		    if(loweast > i) loweast = i;
		    else if(higheast < i) higheast = i;
		    sum = sum + i;
	    }
	    avg = sum / numbers.length;
	    System.out.println("Highest number in array: " + higheast);
	    System.out.println("Lowest number in array: " + loweast);
	    System.out.println("All numbers put together: " + sum);
	    System.out.println("The avgerage of all numbers: " + avg);
		System.out.print("Amount of numbers in array: " + numbers.length);
    }
}
