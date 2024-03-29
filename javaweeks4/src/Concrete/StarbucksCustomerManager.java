package Concrete;

import Abstract.BaseCustomerManager;
import Abstract.CustomerCheckService;
import Entities.Customer;


public class StarbucksCustomerManager extends BaseCustomerManager  {
	
	private CustomerCheckService customerCheckService;
	
	
	public StarbucksCustomerManager(Abstract.CustomerCheckService customerCheckService) {
		this.customerCheckService = customerCheckService;
	}

	@Override
	public  void save(Customer customer) throws Exception  {
		if(this.customerCheckService.checkIfRealPerson(customer)) {
				super.save(customer);
		}else {
				throw new Exception("Not a valid person");
		}
				
	}


}
