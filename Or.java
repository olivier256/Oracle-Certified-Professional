public class Or {
	void conditional(boolean b, boolean c) {
		if (b || c) {
			System.out.println("OK");
		}
	}

/*

  void conditional(boolean, boolean);
    Code:
       0: iload_1
       1: ifne          8
       4: iload_2
       5: ifeq          16
       8: getstatic     #7	// Field java/lang/System.out:Ljava/io/PrintStream;
      11: ldc           #13	// String OK
      13: invokevirtual #15	// Method java/io/PrintStream.println:(Ljava/lang/String;)V
      16: return

*/




	void logical(boolean b, boolean c) {
		if (b | c) {
			System.out.println("OK");
		}
	}

/*

  void logical(boolean, boolean);
    Code:
       0: iload_1
       1: iload_2
       2: ior
       3: ifeq          14
       6: getstatic     #7	// Field java/lang/System.out:Ljava/io/PrintStream;
       9: ldc           #13	// String OK
      11: invokevirtual #15	// Method java/io/PrintStream.println:(Ljava/lang/String;)V
      14: return

*/

}
