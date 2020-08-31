
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Tar4 {

	public static void main(String[] args) {

		// if the text is in args - you don't need a scanner
		// if the text is in a String - you need a scanner

//		String str = "I am nice you are nice they are nice";
//		Scanner sc = new Scanner(str);

		System.out.println(Arrays.toString(args));

		Map<String, Integer> map = new HashMap<String, Integer>();

		for (int i = 0; i < args.length; i++) {
			String word = args[i];
			System.out.println(word);
			if (!map.containsKey(word)) {
				map.put(word, 1);
			} else {
				map.put(word, map.get(word) + 1);
			}
		}

		System.out.println(map);
		// =============

	}

}
