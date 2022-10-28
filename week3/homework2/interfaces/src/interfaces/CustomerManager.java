package interfaces;

public class CustomerManager {

	private ICustomerDal customerDal;
	
	public CustomerManager(ICustomerDal cutomerDal) {
		this.customerDal = cutomerDal;
	}

	public void add() {
		// iş kodları
		customerDal.add();
	}

}
