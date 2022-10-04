package stringsDemo;

public class Main {

	public static void main(String[] args) {
		String mesaj = "Bugün hava çok güzel.";
		System.out.println(mesaj);

		/*
		 * System.out.println("Eleman sayısı : " + mesaj.length());
		 * System.out.println("5. eleman : " + mesaj.charAt(4)); // 5.elemanı bulma
		 * (charAt(index)) System.out.println(mesaj.concat("Yaşasın!")); // metin
		 * birleştirme mesaj.concat("metin")) String mesaj2 = mesaj.concat("Gülümse");
		 * // birleştirilien metni başka bir yerde kullanma System.out.println(mesaj2);
		 * System.out.println(mesaj.startsWith("B")); // java küçük büyük harf duyarlı
		 * System.out.println(mesaj.endsWith(".")); char[] karakterler = new char[5];
		 * mesaj.getChars(0, 5, karakterler, 0); // kaçtan kaça kadar, nereye, kaçıncı
		 * indekste başlasın System.out.println(karakterler);
		 * System.out.println(mesaj.indexOf('a')); // kaçıncı sırada 'a' var (ilk)
		 * System.out.println(mesaj.indexOf("av")); // kelime grupları da aranabilir.
		 * System.out.println(mesaj.lastIndexOf("a")); // aramaya sağdan başlar.
		 */

		String yeniMesaj = mesaj.replace(' ', '-'); // metindeki karakterleri değiştirir.
		System.out.println(yeniMesaj);
		System.out.println(mesaj.substring(2, 5)); // metni parçalama

		for (String kelime : mesaj.split(" ")) { // kelimeleri ayırma
			System.out.println(kelime);

		}
		
		System.out.println(mesaj.toLowerCase()); // harfleri küçültür.
		System.out.println(mesaj.toUpperCase()); // harfleri büyütür.
		System.out.println(mesaj.trim());

	}

}
