import java.util.ArrayList;

public class StringPermutations {

	public static void main(String[] args) {
		StringPermutations sp = new StringPermutations();
		ArrayList<String> perm = sp.findPerm("String");

		for (String s : perm) {
			System.out.println(s);
		}

	}

	public ArrayList<String> findPerm(String str) {
		ArrayList<String> perms = new ArrayList<String>();

		if (str == null) {
			return null;
		} else if (str.length() == 0) {
			perms.add("");
			return perms;
		}
		char first = str.charAt(0);
		String remain = str.substring(1);
		ArrayList<String> subPerms = findPerm(remain);

		for (String s : subPerms) {
			for (int i = 0; i <= s.length(); i++) {
				String begin = s.substring(0, i);
				String end = s.substring(i);
				perms.add(begin + first + end);
			}
		}

		return perms;
	}

}
