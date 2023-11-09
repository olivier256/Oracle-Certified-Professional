/*
The first expression is evaluated from left to right since the order of precedence of operator & and ^ is the same
*/

public class Chapter2Exercice13 {
	public static void main(String[] args) {
		boolean sunny = true, raining = false, sunday = true;
		boolean goingToTheStore = sunny & raining ^ sunday;
		boolean goingToTheZoo = sunday && !raining;
		boolean stayingHome = !(goingToTheStore && goingToTheZoo);
		System.out.println(goingToTheStore + "-" + goingToTheZoo + "-" + stayingHome);
		boolean goingToTheStore2 = (sunny & raining) ^ sunday;
		System.out.println(goingToTheStore2);
		boolean goingToTheStore3 = sunny & (raining ^ sunday);
		System.out.println(goingToTheStore3);
	}
}
