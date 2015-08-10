import java.util.Arrays;

public class solve1 {
	public static void main(String[] args) {
		int num[] = { 1, 3, 3, 2, 24, 3, 3, 4, 3, 3 };
		Arrays.sort(num);
		System.out.println(check(num));
	}

	static boolean check(int num[]) {
		int c = 0, i = (int) Math.ceil(num.length / 2);
		for (int j = 0; j < num.length; j++) {
			if (num[i] == num[j]) {
				c++;
			}
		}
		if(c > i)
			return true;

		return false;
	}
}
