public class Chapter3Exercice8 {
	static void printType(Object o) {
		if (o instanceof Integer bat) {
			System.out.print("int");
		} else if(o instanceof Integer bat && bat < 10) {
			System.out.print("small int");
		} else if (o instanceof Long bat || bat <= 20) {
			System.out.print("long");
		} default {
			System.out.print("unknown");
		}
	}

	public static void main(String[] args) {
		printType(11);
	}
}
