package youTubeDemo;

public class CreditManager {
	public void Calculate() {
		System.out.println("Kredi hesaplandı");
	}

	public void Save() {
		System.out.println("Kredi verildi");
	}

	public void Expiry() {
		System.out.println("Vade belirlendi");
	}

	interface ICreditManager {
		public void Calculate();

		public void Save();

		public void Expiry();
	}

}
