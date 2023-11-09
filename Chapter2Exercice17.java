public class Chapter2Exercice17 {
	public static void main(String[] args) {
		int ticketsTaken = 1;
		int ticketsSold = 3;
		ticketsSold += 1 + ticketsTaken++;
		/*
			1 + ticketsTaken
			= 1 + 1
			= 2
			ticketsSold = ticketsSold + 2
			= 3 + 2
			= 5
			ticketsTaken = ticketsTaken + 1
			= 1 + 1
			= 2
		*/
		ticketsTaken *= 2;	// 4
		ticketsSold += (long)1;	// 6
	}
}
