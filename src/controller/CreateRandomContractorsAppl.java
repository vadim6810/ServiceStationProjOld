package controller;

import java.util.Iterator;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

import dao.Contractor;
import model.interfaces.ContractorRepository;

public class CreateRandomContractorsAppl {

	private static final int N_CONTRACTORS = 10;
	private static final int MAX_NAMES = 100;
	private static final int MAX_EMAILS = 100;
	private static final int MAX_URLS = 100;
	private static final int MIN_PHONE = 500000000;
	private static final int MAX_PHONE = 599999999;

	public static void main(String[] args) {
		
		AbstractApplicationContext ctx = new FileSystemXmlApplicationContext("beans.xml");
		ContractorRepository repository = (ContractorRepository) ctx.getBean("contractors");
		
		//repository.removeContractor("email74");
		
		//System.out.println(repository.getContractor("email9").toString());
		
		//createContractors(repository);
		
		//System.out.println(repository.getContractor(10));
		
		//System.out.println(repository.iterator().next());
		
		/*Iterator<Contractor> it = repository.iterator();
		while(it.hasNext()){
			System.out.println(it.next());
		}*/
		
		//repository.changeEmail("email 38", "email has been changed");
		
		ctx.close();
	}

	private static void createContractors(ContractorRepository repository) {
		
		for(int i = 0; i < N_CONTRACTORS; i++){
			repository.addContractor(getContractor());
		}
	}

	private static Contractor getContractor() {
		
		String name = "name " + getRandomNumber(1, MAX_NAMES);
		String email = "email " + getRandomNumber(1, MAX_EMAILS);
		String url = "url " + getRandomNumber(1, MAX_URLS);
		String phone = "0" + getRandomNumber(MIN_PHONE, MAX_PHONE);
		return new Contractor(name, email, url, phone);
	}

	private static int getRandomNumber(int min, int max) {
		
		return (int) (min+Math.random()*(max-min+1));
	}

}
