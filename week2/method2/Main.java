package method2;

public class Main {

	public static void main(String[] args) {
		String mesaj = "Bugün hava .ok güzel.";
		String yeniMesaj = sehirVer();
		System.out.println(yeniMesaj);
		int sayi = topla(5, 7);
		System.out.println(sayi);

	}

	public static int topla(int sayi1, int sayi2) {
		return sayi1 + sayi2;
	}

	public static String sehirVer() {
		return "Ankara";
	}

}
