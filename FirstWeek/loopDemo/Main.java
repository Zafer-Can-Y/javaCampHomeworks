package loopDemo;

public class Main {

	public static void main(String[] args) {

		// For
		System.out.println("1'den 10'a kadar olan sayılar ;");
		for (int i = 1; i <= 10; i++) {
			System.out.println(i);
		}
		System.out.println("1'den 10'a kadar olan çift sayılar ;");
		for (int i = 2; i <= 10; i += 2) {
			System.out.println(i);
		}
		System.out.println("1'den 10'a kadar olan tek sayılar ;");
		for (int i = 1; i <= 10; i += 2) {
			System.out.println(i);
		}
		System.out.println("For döngüsü bitti");

		// While
		System.out.println("1'den 10'a kadar olan sayılar ;");
		int a = 1;
		while (a <= 10) {
			System.out.println(a);
			a++;
		}
		System.out.println("1'den 10'a kadar olan çift sayılar ;");
		int b = 2;
		while (b <= 10) {
			System.out.println(b);
			b += 2;
		}
		System.out.println("1'den 10'a kadar olan tek sayılar ;");
		int c = 1;
		while (c <= 10) {
			System.out.println(c);
			c += 2;
		}
		System.out.println("While döngüsü bitti");

		// Do While
		System.out.println("1'den 10'a kadar olan sayılar ;");
		int j = 1;
		do {
			System.out.println(j);
			j++;
		} while (j <= 10);
		System.out.println("1'den 10'a kadar olan çift sayılar ;");
		int k = 2;
		do {
			System.out.println(k);
			k += 2;
		} while (k <= 10);
		System.out.println("1'den 10'a kadar olan tek sayılar ;");
		int l = 1;
		do {
			System.out.println(l);
			l += 2;
		} while (l <= 10);
		System.out.println("Do-While döngüsü bitti");

	}

}
