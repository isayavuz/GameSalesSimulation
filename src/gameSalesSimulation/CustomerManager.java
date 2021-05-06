package gameSalesSimulation;

public class CustomerManager implements CustomerService {
	CustomerValidationService customerValidationService;

	public CustomerManager(CustomerValidationService customerValidationService) {
		this.customerValidationService = customerValidationService;
	}
	
	@Override
	public void add(Customer customer) {
		if(customerValidationService.checkIfRealPerson(customer)) {
			System.out.println(customer.getFirstName()+" kiþisi eklendi.");
		}else {
			System.out.println(customer.getFirstName()+" kiþisi eklenemedi. BAÞARISIZ.");
		}
		
	}

	@Override
	public void delete(Customer customer) {
		System.out.println(customer.getFirstName()+" kiþisi silindi.");
	}

	@Override
	public void update(Customer customer) {
		System.out.println(customer.getFirstName()+" kiþisi güncellendi.");
	}

}
