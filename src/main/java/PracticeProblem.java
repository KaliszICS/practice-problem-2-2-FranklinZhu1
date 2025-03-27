import java.util.Arrays;

public class PracticeProblem {

	public static int[] compareSearch(int[] array, int number) {
		int compare[] = new int[2];
		int seq = 0;
		for (int i = 0; i < array.length; ++i, ++seq) {
			if (array[i] == number) {
				++seq;
				break;
			}
		}
		compare[0] = seq;
		Arrays.sort(array);
		int bin = 0, lo = 0, hi = array.length - 1, mid;
		while (lo <= hi) {
			mid = (lo + hi)/2;
			if (number == array[mid]) lo = hi + 1;
			else if (number < array[mid]) hi = mid - 1;
			else lo = mid + 1; // number > array[mid]
			++bin;
		}
		compare[1] = bin;
		return compare;
	}

	public static int[] compareStringSearch(String[] array, String word) {
		int compare[] = new int[2];
		int seq = 0;
		for (int i = 0; i < array.length; ++i, ++seq) {
			if (array[i].equals(word)) {
				++seq;
				break;
			}
		}
		compare[0] = seq;
		Arrays.sort(array);
		int bin = 0, lo = 0, hi = array.length - 1, mid;
		while (lo <= hi) {
			mid = (lo + hi)/2;
			if (array[mid].compareTo(word) == 0) lo = hi + 1;
			else if (array[mid].compareTo(word) > 0) hi = mid - 1; // array at mid follows word
			else lo = mid + 1; // array at mid precedes word
			++bin;
		}
		compare[1] = bin;
		return compare;
	}
	
}
