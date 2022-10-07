package youTubeDemo;

public class Main {

	public static void main(String[] args) {

		/*
		 * int[] numbers1 = new int[] { 1, 2, 3 }; int[] numbers2 = new int[] { 10, 20,
		 * 30 }; numbers1 = numbers2; numbers2[0] = 1000;
		 * System.out.println(numbers1[0]); System.out.println("----------");
		 * 
		 * CreditManager creditManager = new CreditManager(); creditManager.Calculate();
		 * creditManager.Save(); creditManager.Expiry();
		 * 
		 * System.out.println("----------");
		 * 
		 * Customer customer = new Customer(); Person person = new Person();
		 * person.setId(1); person.setFirstName("Engin"); person.setLastName("Demirog");
		 * person.setNationalIdentity("123456"); person.setCity("Ankara");
		 * 
		 * System.out.println("Müşter id numarası : " + customer.getId());
		 * System.out.println(person.getFirstName());
		 * System.out.println(person.getLastName());
		 * System.out.println(person.getNationalIdentity());
		 * System.out.println(person.getCity()); System.out.println("----------");
		 * 
		 * CustomerManager customerManager = new CustomerManager(customer);
		 * customerManager.Save(); customerManager.Delete();
		 * System.out.println("----------");
		 * 
		 * Company company = new Company(); company.setTaxNumber("012345");
		 * company.setCompanyName("ABC"); company.setId(100);
		 * 
		 * CustomerManager customerManagerPerson = new CustomerManager(new Person()); //
		 * şahıs CustomerManager customerManagerCompany = new CustomerManager(new
		 * Company()); // şirket
		 */

		// Yukarıdaki kodlar dersin 1. ve 2. saati için geçerli

		CustomerManager customerManager = new CustomerManager(new Customer(), new TeacherCreditManager());
		customerManager.GiveCredit();

	}

}
