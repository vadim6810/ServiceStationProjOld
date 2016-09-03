package model.interfaces;

import dao.Contractor;

public interface ContractorRepository extends Iterable<Contractor>{

	boolean addContractor(Contractor contractor);
	
	boolean removeContractor(int id);
	
	boolean removeContractor(String email);
	
	Contractor getContractor(int id);
	
	Contractor getContractor(String email);
	
	boolean changeEmail(String oldEmail, String newEmail);

}
