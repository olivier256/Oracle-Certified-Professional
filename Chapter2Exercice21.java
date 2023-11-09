public class Chapter2Exercice21 {
	public static void main(String[] args) {
		int myFavoriteNumber = 8;
		int bird = ~myFavoriteNumber;	// -9 ?
/*
	byte	0b11111111 = -1
		0b11111110 = -2
		0b11111101 = -3
		...
		0b10000001 = -127
		0b10000000 = -128
		0b00000001 = 1
		0b00000010 = 2
		...
		0b01111111 = 127
	==> ~a == -a - 1
Applying Unary Operators / Complement and Negation Operators
“to find the bitwise complement of a number, multiply it by negative one and then substract one”
<=>
~a == -a - 1
*/

		int plane = -myFavoriteNumber;	// -8
		var superman = bird == plane ? 5 : 10;	// 10
		System.out.println(bird + "," + plane + "," + --superman);
	}
}
