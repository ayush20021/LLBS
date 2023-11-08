import java.util.*;

class LBS {

	public int Fibonacci(int a) {
		int n = a;

		int status = 1;
		for (int i = n; i >= 1; i--) {

			status = status * i;

		}
		return status;
	}

	void Q80(String a) {
		StringBuilder s = new StringBuilder();

		for (int i = 0; i < a.length(); i++) {
			if (a.charAt(i) != ' ') {
				s.append(a.charAt(i));
			}

		}

		a = s.toString();
		System.out.println(s);

	}

	void email_Verify(String a) {
		int D1 = 0;
		int D2 = 0;
		// boolean statud= false;
		for (int i = 0; i < a.length(); i++) {

			if (a.charAt(i) == '@') {
				D1++;
			}

			if (a.charAt(i) == '.') {
				D2++;
			}
			if (a.charAt(i) == '+' || a.charAt(i) == '-' || a.charAt(i) == '_' || a.charAt(i) == '&') {

				System.out.println("Invalid");
			}

		}

		if (D1 + D2 >= 2) {
			System.out.println("Valid");
		} else {
			System.out.println("Invalid");
		}

	}

	public void table(int a) {

		for (int i = 0; i <= 12; i++) {

			System.out.println(a + " " + "*" + " " + i + " = " + a * i);

		}

	}

	int total_number = 0;
	int elements = 0;

	public int Mean(int[][] a) {
		int[] ab = new int[9];

		for (int i = 0; i < a.length; i++) {

			for (int j = 0; j < a.length; j++) {

				total_number = total_number + a[i][j];

				ab[elements] = a[i][j];
				elements++;

			}
		}

		System.out.println(Arrays.toString(ab));

		int data = 0;
		int p = 0;
		if (elements % 2 == 0) {
			data = elements / 2;
			data--;
			p = ab[data] + ab[data + 1] / 2;
			return ab[p];
		} else {
			data = elements / 2;
			return ab[data];
		}

	}

	public void Union_and_Intersection(int[] a, int[] b) {
		int size = b.length;
		if (a.length > b.length) {
			size = a.length;
		}
		int[] n1 = new int[size];

		if (a[0] >= b[0]) {
			n1[0] = b[0];
		} else {
			n1[0] = a[0];
		}
		int max = 0;
		int prev_number = 0;

		for (int i = 0; i < a.length; i++) {
			max = b[i];

			if (n1[i] > max) {

			}

		}

	}

	public void Union_and_Intersection_V2(int[] a, int[] b) {
		Set<Integer> U = new HashSet<>();
		for (int j : a) {
			U.add(j);
		}
		for (int j : b) {
			U.add(j);
		}
		System.out.println("Union is " + U);
		Set<Integer> I = new HashSet<>();
		for (int i = 0; i < a.length; i++) {
			I.add(a[i]);
		}
		System.out.print("Intersection is : ");
		int prev = 0;
		for (int i = 0; i < b.length; i++) {
			int n = b[i];

			if (I.contains(n)) {
				if (n != prev) {
					prev = n;
					System.out.print(n + " ");
				}
			}
		}

	}

	int[] Os1sand2s_SORT(int[] a) {
		int b = 0;
		int c = 0;
		int d = 0;
		int[] s = new int[a.length];
		for (int i = 0; i < a.length; i++) {

			if (a[i] == 0) {
				b++;
			}
			if (a[i] == 1) {
				c++;
			}
			if (a[i] == 2) {
				d++;
			}

		}
		int ststus = 0;

		for (int i = 0; i < s.length; i++) {

			if (i < b) {
				s[i] = 0;
				continue;
			}

			if (i < b + c) {

				s[i] = 1;
				continue;
			}

			if (i < b + c + d) {

				s[i] = 2;

			}

		}

		return s;

	}

	void reverse_word(String a) {
		StringBuilder s = new StringBuilder();
		String s1 = "";
		int b = 0;
		int c = 0;
		int d = 0;
		int i = 0;
		char ch = ' ';
		boolean status = false;
		for (i = b; i < a.length(); i++) {
			if (a.charAt(i) != ' ') {
				b = i;

				while (b < a.length()) {
					if (a.charAt(b) != ' ') {
						b++;
						c++;
					} else {
						continue;
					}
				}
				b = c;

				d = c;
				d--;
				while (d >= 0) {
					s.append(a.charAt(d));
					d--;
				}
				if (c > 2) {
					s.append(a.charAt(c));
				}
				// b=0;
				// c=0;
				d = 0;
				i = b;

			}
			// Hello
			// olleH
			//

		}

		s1 = s.toString();

	}

}

public class Main {
	public static void main(String[] args) {

		LBS l = new LBS();
		// System.out.println( l.Fibonacci(2));
		// l.table(12);

		int[][] matrix = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 10 } };

		System.out.println(l.Mean(matrix));

		int[] array1 = { 1, 3, 3, 5, 7, 9 };
		int[] array2 = { 3, 4, 5, 5, 5, 6, 7 };

		// l.Union_and_Intersection_V2(array1,array2);
		int[] nums = { 0, 1, 2, 0, 1, 2, 0, 1, 2 };
		int[] ab = l.Os1sand2s_SORT(nums);
		System.out.println(Arrays.toString(ab));
		String name = "Ayush";

		int[][] m1 = { { 1, 2 }, { 3, 4 }, { 5, 6 } };

		int[][] m2 = { { 7, 8, 9 }, { 10, 11, 12 }, };

		String a = "innovation drives businesses to foster innovation, leading to innovative solutions and innovative products in the market";
		String b = "innovative";
		int j = 0;
		int k = 0;
		int counter = 0;
		int c = 0;
		for (int i = 0; i < a.length(); i++) {
			if (a.charAt(i) == b.charAt(c)) {
				k = i;
				j = 0;
				while (c < b.length()) {
					if (a.charAt(k) == b.charAt(c)) {
						j++;
						k++;
						c++;
					} else {
						break;
					}
				}
			}
			if (j == b.length()) {
				counter++;
				j = 0;
			}
			c = 0;
		}
		System.out.println("The Substring " + b + " is present " + counter + " time");

		//String data = "Hello How";
		//l.reverse_word(data);

	// The Repo have been updated 
 }
}