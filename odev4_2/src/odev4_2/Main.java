package odev4_2;

public class Main {

	public static void main(String[] args) {
  BaseCustomerManager customerManager = new NeroCustomerManager();
  Customer customer = new Customer(1,"Hatice", "K�z�lta�", "12345678901");
  customerManager.Save(customer);
	}

}
