package youTubeDemo;

import youTubeDemo.CreditManager.ICreditManager;

public class MilitaryCreditManager implements ICreditManager {

	@Override
	public void Calculate() {
		System.out.println("Asker kredisi hesaplandı");

	}

	@Override
	public void Save() {
		System.out.println("Asker kredisi verildi");

	}

	@Override
	public void Expiry() {
		System.out.println("Asker vadesi hesaplandı");

	}

}
