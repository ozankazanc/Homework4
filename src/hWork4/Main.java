package hWork4;

import java.time.LocalDate;

import hWork4.Abstract.BaseCustomerManager;
import hWork4.Adapters.MernisServiceAdapter;
import hWork4.Concrete.NeroCustomerManager;
import hWork4.Concrete.StarBucksCustomerManager;
import hWork4.Entities.Customer;

public class Main {

	public static void main(String[] args) {
		BaseCustomerManager customerManager = new NeroCustomerManager();
		customerManager.save(new Customer(1, "HÜSEYÝN OZAN", "KAZANÇ", LocalDate.of(1995, 02, 17), "23437215374"));

		BaseCustomerManager customerManager2 = new StarBucksCustomerManager(new MernisServiceAdapter());
		customerManager2.save(new Customer(1, "HÜSEYÝN OZAN", "KAZANÇ", LocalDate.of(1995, 05, 17), "23437215374"));

	}

}
