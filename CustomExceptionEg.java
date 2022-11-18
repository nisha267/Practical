package CustomException;

import java.util.ArrayList;
import java.util.Arrays;

class languagecheckexception extends Exception {
	public languagecheckexception(String str) {
		super(str);
	}
}

public class CustomExceptionEg {
	ArrayList<String> language = new ArrayList<String>

	(Arrays.asList("eng", "Bengali", "Tamil"));

	public void check(String a) throws languagecheckexception {
		if (language.contains(a)) {
			throw new languagecheckexception(a + "language already exist");
		} else
			language.add(a);
		System.out.println("Language added in list + language");

	}

	public static void main(String[] args) throws languagecheckexception {
		CustomExceptionEg c = new CustomExceptionEg();
		c.check("Telegu");
		c.check("Tamil");
	}
}
