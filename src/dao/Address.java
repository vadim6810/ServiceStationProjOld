package dao;

import java.util.ArrayList;

import javax.persistence.*;

@Entity
@Table(name="address")

public class Address {

	@Id
	@Column(name="addrId")
	@GeneratedValue
	private int id;
	
	@Column(name="addrArea")
	ArrayList<Integer> area;
	
	@Column(name="addrCity")
	ArrayList<String> City;
	
	/*@Column(name="addrStreet")
	String street;
	
	@Column(name="addrHouse")
	String house;
	
	@Column(name="addrTxt")
	String txt_address;*/
}
