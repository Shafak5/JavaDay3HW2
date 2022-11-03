package interfaces;

public class Main {

	public static void main(String[] args) {
		CustomerManager customerManager = new CustomerManager(new MySqlCustomerDal());
		customerManager.add();
		
		//birinci yöntem
//		CustomerManager customerManager = new CustomerManager();
//		customerManager.customerDal = new MySqlCustomerDal();
//		customerManager.add();
	}

}
