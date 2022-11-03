package classesWithAttributes;

public class Main {

	public static void main(String[] args) {
		Product product1 = new Product();
		product1.setId(1);
		product1.setName("pc");
		product1.setPrice(10000);
		product1.setDescription("oyun bilgisayarı");
		
		ProductManager productManager = new ProductManager();
		productManager.Add(product1);
		
		

	}

}
