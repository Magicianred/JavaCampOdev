package odev4_2;

public abstract class BaseCustomerManager implements CustomerService{
@Override
public void Save (Customer customer) {
	System.out.println("kaydedildi: " + customer.getFirstName());
}
}
