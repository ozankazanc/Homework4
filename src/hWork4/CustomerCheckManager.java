package hWork4;
import hWork4.Abstract.ICustomerCheckService;
import tr.gov.nvi.tckimlik.WS.KPSPublicSoapProxy;

public class CustomerCheckManager implements ICustomerCheckService {

	@Override
	public boolean CheckIfRealPerson(Customer customer) {
		
		//KPSPublicSoapProxy soap
		
		return true;
	}

}
