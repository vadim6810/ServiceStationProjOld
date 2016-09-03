package dao;

import javax.persistence.*;

@Entity
@Table(name="contr")

public class Contractor {

	@Id
	@Column(name="contrId")
	@GeneratedValue
	private int id;
	
	@Column(name="contrName")
	private String name;
	
	@Column(name="contrEmail")
	private String email;
	
	@Column(name="contrUrl")
	private String url;
	
	@Column(name="contrPhone")
	private String phone;
	
	public Contractor(String name, String email, String url, String phone) {
		super();
		this.name = name;
		this.email = email;
		this.url = url;
		this.phone = phone;
	}
	
	public Contractor() {
		
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
	
	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public int getId() {
		return id;
	}

	@Override
	public String toString() {
		return "Contractor [id=" + id + ", name=" + name + ", email=" + email + ", url=" + url + ", phone=" + phone
				+ "]";
	}
}
