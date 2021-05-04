package hWork4.Adapters;

import java.rmi.RemoteException;

import hWork4.Abstract.ICustomerCheckService;
import hWork4.Entities.Customer;
import tr.gov.nvi.tckimlik.WS.*;

public class MernisServiceAdapter implements ICustomerCheckService {

	@Override
	public boolean CheckIfRealPerson(Customer customer) {

		KPSPublicSoapProxy kps = new KPSPublicSoapProxy();
		try {
			boolean result = kps.TCKimlikNoDogrula(Long.parseLong(customer.getNationalityId()), customer.getFirstName(),
					customer.getLastName(), customer.getDateOfBirth().getYear());
			return result;
		} catch (NumberFormatException e) {
			// TODO Auto-generated catch block
			return false;
		} catch (RemoteException e) {
			// TODO Auto-generated catch block
			return false;
		}
	}

}
