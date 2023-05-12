package hiberdemo.hibernate;


import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Transient;



@Entity
public class Employee {
	
	@Id
	private int id;
	
	@Transient
	private EmployeeName name;
	
//	private String name;
	private String country;
	@OneToOne
	private equipment eq;
	public equipment getEq() {
		return eq;
	}

	public void setEq(equipment eq) {
		this.eq = eq;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public EmployeeName getName() {
		return name;
	}

	public void setName(EmployeeName name) {
		this.name = name;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}
	
	
	
	
	
}
