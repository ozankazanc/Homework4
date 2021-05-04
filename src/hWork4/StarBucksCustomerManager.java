package hWork4;

import hWork4.BaseCustomerManager;

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
			//
		}
		
	}
}
