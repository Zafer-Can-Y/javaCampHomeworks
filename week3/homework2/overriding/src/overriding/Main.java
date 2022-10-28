package overriding;

public class Main {

	public static void main(String[] args) {
		BaseCreditManager[] krediManagers = new BaseCreditManager[] { new TeacherCreditManager(),
				new FarmerCreditManager(), new StudentCreditManager() };

		for (BaseCreditManager krediManager : krediManagers) {
			System.out.println(krediManager.calculate(1000));
		}

	}

}
