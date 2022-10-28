package sesliHarfler;

public class Main {

	public static void main(String[] args) {
		char harf = 'K';

		switch (harf) {
		case 'A':
		case 'I':
		case 'O':
		case 'U':
			System.out.println("Kalın sesli harf");
			break;
		case 'E':
		case 'İ':
		case 'Ö':
		case 'Ü':
			System.out.println("İnce sesli harf");
			break;
		default:
			System.out.println("Sesli harf girilmedi.");
		}

	}

}
