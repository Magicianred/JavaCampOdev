package odev4_2;

public class StarbucksCustomerManager extends BaseCustomerManager {
public void save(Customer customer) {
		
		if(PersonManager.isValid(customer.getId(), customer.getFirstName())) {
			System.out.println("Veri tabanýna " + customer.getFirstName() + " müþterisi eklendi.");
		}else {
			System.out.println( customer.getFirstName() + " isminde bir kayýt bulunmamaktadýr.");
		}
	}
}
