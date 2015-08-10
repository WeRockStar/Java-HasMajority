import java.util.Arrays;

public class solve {
	public static void main(String[] args) {
		int num[] = { 1, 3, 3, 2, 24, 3, 3, 4, 3, 3 };
		// sort
		Arrays.sort(num);

		// pass and show
		System.out.println(check(num));
	}

	static boolean check(int num[]) {
		int c = 0, i = 1;
		for (int j = 0; j < num.length; j++) {
			//ถ้าเท่ากัน
			if (num[i] == num[j]) {
				++c;
				if (c > num.length / 2) {
					return true;
				}
				//ถ้าไม่เท่า
			} else {
				i = j;
				c = 1;
			}
		}

		return false;
	}
}
