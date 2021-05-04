package hWork4.Concrete;
import hWork4.Abstract.ICustomerCheckService;
import hWork4.Entities.Customer;
import tr.gov.nvi.tckimlik.WS.KPSPublicSoapProxy;

public class CustomerCheckManager implements ICustomerCheckService {

	@Override
	public boolean CheckIfRealPerson(Customer customer) {
		
		//KPSPublicSoapProxy soap
		
		return true;
	}

}
