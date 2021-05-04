package hWork4;


import java.time.LocalDate;

import hWork4.Abstract.BaseCustomerManager;
import hWork4.Concrete.NeroCustomerManager;
import hWork4.Entities.Customer;

public class Main {

	public static void main(String[] args) {
		BaseCustomerManager customerManager = new NeroCustomerManager();
		customerManager.save(new Customer(1,"ozan","kazanç",LocalDate.of(1995, 02, 02),"23437528374"));
		

	}

}
