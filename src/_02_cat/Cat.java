package _02_cat;
/*
 *    Copyright (c) The League of Amazing Programmers 2013-2019
 *    Level 1
 */

		/* Do the following things without changing the Cat class 
	
		* Create a CatRunner class in the cat package, with a main method that creates a Cat object.

        * 1. Make the Cat meow
        
		* 2. Get the Cat to print it's name

		* 3. Kill the Cat! 
		
		*/


public class Cat {
public static void KitKat(){
	meow();
	printName();
	kill();
}
	private static String name = "Jeff";
	private static int lives = 9;

	Cat(String name) {
		this.name = name;
	}

	public Cat() {
		// TODO Auto-generated constructor stub
	}

	static void meow() {
		System.out.println("meeeeeooooooooooowwwwwwwww!!");
	}

	public static void printName() {
		if (name == null)
			System.out.println("i don't know my own name!");
		else
			System.out.println("my name is " + name);
	}

	static void kill() {
		lives-=1000;
		if (lives > 0)
			System.out.println("nice try, but I still have " + lives + " lives left");
		else if (lives < 0)
			System.out.println("that's overkill yo!");
		else
			System.out.println("DEAD CAT :(");
	}


}


