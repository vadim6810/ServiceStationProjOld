package model.interfaces;

import dao.Contractor;

public interface ContractorRepository extends Iterable<Contractor>{

	boolean addContractor(Contractor contractor);
	
	boolean deleteContractor(int id);
	
	Contractor getContractor(int id);
}
