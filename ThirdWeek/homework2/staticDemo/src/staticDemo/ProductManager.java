package staticDemo;

public class ProductManager {
	public void add(Product porduct) {

		if (ProductValidator.isValid(porduct)) {
			System.out.println("Eklendi.");
		} else {
			System.out.println("Ürün bilgileri geçersizdir.");
		}

		ProductValidator productValidator = new ProductValidator();
		productValidator.bisey();

	}
}
