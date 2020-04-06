package _01_race_car;
/*
 *    Copyright (c) The League of Amazing Programmers 2013-2019
 *    Level 1
 */



public class RaceCarRunner2 {
	static int positionInRace = 5;
	static boolean damaged = false;
	public static void main(String[] args) {
		/* Do the following things without changing the RaceCar class */
		
		// 1. Create a RaceCar and place it in 5th position
RaceCar Kar = new RaceCar("cybertruck",positionInRace);
		// 2. Print the RaceCar's position in the race
System.out.println("Your position in the race is " + positionInRace);
		// 3. Crash the RaceCar
		crash();
		// 4. If the car is damaged. Bring it in for a pit stop.

		// 5. Help the car move into first place.

	}
	private static void crash() {
		// TODO Auto-generated method stub
		positionInRace += 3;
		if (positionInRace > 15) 
			positionInRace = 15;
		damaged = true;
		System.out.println("\nYour car has been damaged and needs a pit stop.\nThree cars zoomed by you.");
	}
}
