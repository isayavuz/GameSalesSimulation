package gameSalesSimulation;

public class CustomerManager implements CustomerService {
	CustomerValidationService customerValidationService;

	public CustomerManager(CustomerValidationService customerValidationService) {
		this.customerValidationService = customerValidationService;
	}
	
	@Override
	public void add(Customer customer) {
		if(customerValidationService.checkIfRealPerson(customer)) {
			System.out.println(customer.getFirstName()+" ki�isi eklendi.");
		}else {
			System.out.println(customer.getFirstName()+" ki�isi eklenemedi. BA�ARISIZ.");
		}
		
	}

	@Override
	public void delete(Customer customer) {
		System.out.println(customer.getFirstName()+" ki�isi silindi.");
	}

	@Override
	public void update(Customer customer) {
		System.out.println(customer.getFirstName()+" ki�isi g�ncellendi.");
	}

}
