package odev4_2;

public class StarbucksCustomerManager extends BaseCustomerManager {
public void save(Customer customer) {
		
		if(PersonManager.isValid(customer.getId(), customer.getFirstName())) {
			System.out.println("Veri taban�na " + customer.getFirstName() + " m��terisi eklendi.");
		}else {
			System.out.println( customer.getFirstName() + " isminde bir kay�t bulunmamaktad�r.");
		}
	}
}
