package gameSalesSimulation;

public class CustomerValidationManager implements CustomerValidationService{
	@Override
	public boolean checkIfRealPerson(Customer customer) {
		if(customer.getYearOfBirthDate()<2000) {
			return true;
		}
		else {
			 return false;
		}
	}

}
