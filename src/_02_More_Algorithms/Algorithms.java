package _02_More_Algorithms;

import java.util.List;

public class Algorithms {
	public static int findBrokenEgg(List<String> eggs) {
		for (int i = 0; i < eggs.size(); i++) {
			if (eggs.get(i).contains("cracked")) {
				return i;
			}
		}

		return -1;
	}

	public static int countPearls(List<Boolean> bs) {
		int count = 0;
		for (int i = 0; i < bs.size(); i++) {
			if (bs.get(i) == true) {
				count++;
			}
		}

		return count;

	}

	public static Double findTallest(List<Double> ds) {
		double save = 0.0;
		for (int i = 0; i < ds.size(); i++) {
			if (ds.get(i) >= save) {
				save = ds.get(i);
			}
		}

		return save;

	}

	public static String findLongestWord(List<String> ss) {
		String save = " ";

		for (int i = 0; i < ss.size(); i++) {
			if (ss.get(i).length() > save.length()) {
				save = ss.get(i);
			}
		}

		return save;

	}

	public static boolean containsSOS(List<String> ss) {
		for (int i = 0; i < ss.size(); i++) {
			if (ss.get(i).contains("... --- ...")) {
				return true;
			}
		}

		return false;

	}

	public static List<Double> sortScores(List<Double> ds) {

		for (int i = 0; i < ds.size() - 1; i++) {

			for (int j = i + 1; j < ds.size(); j++) {
				if (ds.get(i).compareTo(ds.get(j)) > 0) {
					Double temp = ds.get(i);
					ds.set(i, ds.get(j));
					ds.set(j, temp);

				}
			}
		}

		return ds;

	}

	public static List<String> sortDNA(List<String> ds) {

		for (int i = 0; i < ds.size() - 1; i++) {

			for (int j = i + 1; j < ds.size(); j++) {
				if (ds.get(i).length()>ds.get(j).length()) {
					String temp = ds.get(i);
					ds.set(i, ds.get(j));
					ds.set(j, temp);

				}
			}
		}

		return ds;

	}

}
