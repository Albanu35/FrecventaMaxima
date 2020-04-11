import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class MaxFrecvence {

	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList<String>(Arrays.asList("John", "Lucy", "Anna", "Kelly", "Dean", "Lucy"));
		int max = 0;
		int crtN = 0;
		String crtKey = null;
		ArrayList<String> unique = new ArrayList<String>(list);

		for (String key : unique) {
			crtN = Collections.frequency(list, key);
			if (max < crtN) {
				max = crtN;
				crtKey = key;
			}
		}
		System.out.println("The name " + crtKey + " appears " + max + " times");
	}
}
