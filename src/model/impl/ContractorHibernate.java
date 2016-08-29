package model.impl;

import java.util.Iterator;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import org.springframework.transaction.annotation.Transactional;

import dao.Contractor;
import model.interfaces.ContractorRepository;

public class ContractorHibernate implements ContractorRepository{
	
	@PersistenceContext(unitName="springHibernate")
	
	EntityManager em;

	@Transactional
	public boolean addContractor(Contractor contractor) {
		
		if(getContractor(contractor.getId()) != null)
			return false;
		em.persist(contractor);
		return true;
	}

	@Transactional
	public boolean deleteContractor(int id) {
		
		Contractor contractor = getContractor(id);
		if(contractor == null)
			return false;
		em.remove(contractor);
		return true;
	}

	public Iterator<Contractor> iterator() {
		Query query = em.createQuery("select c from Contractor c");
		return query.getResultList().iterator();
	}

	public Contractor getContractor(int id){
		
		return em.find(Contractor.class, id);
	}
}
