package Main;

import Abstract.BaseCustomerManager;
import Adapter.MernisServiceAdaptor;
import Concrete.NeroCustomerManager;
import Concrete.StarbucksCustomerManager;
import Entities.Customer;

public class Main {

	public static void main(String[] args) throws Exception {
		
		BaseCustomerManager customerManager = new StarbucksCustomerManager(new MernisServiceAdaptor());
		
		Customer customer1 = new Customer(1, "Engin", "Demiroğ", 1985,"28861499108");
		
		customerManager.save(customer1);
	
	}	
}
