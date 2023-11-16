public class PatternVariablesAndExpressions {
	void compareIntegersGreaterThan5(Number number) {
		if (number instanceof Integer data && data.compareTo(5)>0) {
			System.out.print("OK");
		}
	}

	void compareIntegersGreaterThan5Explained(Number number) {
		if (number instanceof Integer data) {
			if (data.compareTo(5)>0) {
				System.out.print("OK");
			}
		}
	}


	/*

	void compareIntegersGreaterThan5Or(Number number) {
		if (number instanceof Integer data || data.compareTo(5)>0) {
			System.out.print("OK");
		}
	}

error: cannot find symbol
                if (number instanceof Integer data || data.compareTo(5)>0) {
                                                      ^
  symbol:   variable data




	void compareIntegersGreaterThan5OrExplained(Number number) {
		if (number instanceof Integer data) {
			System.out.print("OK");
		} else if (data.compareTo(5)>0) {
			System.out.print("OK");
		}
	}


error: cannot find symbol
                } else if (data.compareTo(5)>0) {
                           ^
  symbol:   variable data

	*/
}