package youTubeDemo;

import youTubeDemo.CreditManager.ICreditManager;

public class CustomerManager {
	private Customer _customer;
	private ICreditManager _creditManager;

	public CustomerManager(Customer customer, ICreditManager creditManager) {
		_customer = customer;
		_creditManager = creditManager;
	}

	public void Save() {

		System.out.println("Müşteri eklendi : ");
	}

	public void Delete() {
		System.out.println("Müşteri silindindi : ");
	}

	public void GiveCredit() {
		_creditManager.Calculate();
		System.out.println("Kredi verildi");

	}

}
