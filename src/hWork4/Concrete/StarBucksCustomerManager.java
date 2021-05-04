package hWork4.Concrete;

import hWork4.Abstract.BaseCustomerManager;
import hWork4.Abstract.ICustomerCheckService;
import hWork4.Entities.Customer;

public class StarBucksCustomerManager extends BaseCustomerManager {

	private ICustomerCheckService customerService;

	public StarBucksCustomerManager(ICustomerCheckService customerService) {
		this.customerService = customerService;
	}

	@Override
	public void save(Customer customer) {
		if(customerService.CheckIfRealPerson(customer))
		{
			super.save(customer);
			
		}
		else
		{
			System.out.println("Bu kiþi bulunmamaktadir.");
		}
		
	}
}
