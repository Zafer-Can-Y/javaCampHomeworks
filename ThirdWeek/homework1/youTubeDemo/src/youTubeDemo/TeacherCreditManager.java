package youTubeDemo;

import youTubeDemo.CreditManager.ICreditManager;

public class TeacherCreditManager implements ICreditManager {

	@Override
	public void Calculate() {
		System.out.println("Öğretmen kredisi hesaplandı");

	}

	@Override
	public void Save() {
		System.out.println("Öğretmen kredisi verildi");

	}

	@Override
	public void Expiry() {
		System.out.println("Öğretmen vadesi hesaplandı");

	}

}
