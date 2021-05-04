package hWork4.Abstract;
import hWork4.Entities.Customer;

public abstract class BaseCustomerManager implements ICustomerService {

	@Override
	public void save(Customer customer) {
		System.out.println(customer.getFirstName() + " eklendi.");
	}

}
