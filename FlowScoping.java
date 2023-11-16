public class FlowScoping {
	void printOnlyIntegers(Number number) {
		if (!(number instanceof Integer data))
			return;
		System.out.print(data.intValue());
	}

/*

  void printOnlyIntegers(java.lang.Number);
    Code:
       0: aload_1
       1: instanceof    #7                  // class java/lang/Integer
       4: ifeq          15
       7: aload_1
       8: checkcast     #7                  // class java/lang/Integer
      11: astore_2
      12: goto          16
      15: return
      16: getstatic     #9                  // Field java/lang/System.out:Ljava/io/PrintStream;
      19: aload_2
      20: invokevirtual #15                 // Method java/lang/Integer.intValue:()I
      23: invokevirtual #19                 // Method java/io/PrintStream.print:(I)V
      26: return

*/



	void printOnlyIntegersWithAnElse(Number number) {
		if (!(number instanceof Integer data))
			return;
		else
			System.out.print(data.intValue());
	}

/*

  void printOnlyIntegersWithAnElse(java.lang.Number);
    Code:
       0: aload_1
       1: instanceof    #7                  // class java/lang/Integer
       4: ifeq          15
       7: aload_1
       8: checkcast     #7                  // class java/lang/Integer
      11: astore_2
      12: goto          16
      15: return
      16: getstatic     #9                  // Field java/lang/System.out:Ljava/io/PrintStream;
      19: aload_2
      20: invokevirtual #15                 // Method java/lang/Integer.intValue:()I
      23: invokevirtual #19                 // Method java/io/PrintStream.print:(I)V
      26: return

*/




	void printOnlyIntegersWithAnElseAndInverting(Number number) {
		if (number instanceof Integer data)
			System.out.print(data.intValue());
		else
			return;
	}

/*

  void printOnlyIntegersWithAnElseAndInverting(java.lang.Number);
    Code:
       0: aload_1
       1: instanceof    #7                  // class java/lang/Integer
       4: ifeq          25
       7: aload_1
       8: checkcast     #7                  // class java/lang/Integer
      11: astore_2
      12: getstatic     #9                  // Field java/lang/System.out:Ljava/io/PrintStream;
      15: aload_2
      16: invokevirtual #15                 // Method java/lang/Integer.intValue:()I
      19: invokevirtual #19                 // Method java/io/PrintStream.print:(I)V
      22: goto          26
      25: return
      26: return

*/
}
