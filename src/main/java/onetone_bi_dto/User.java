package onetone_bi_dto;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.CascadeType;
@Entity
public class User 
{
@Override
	public String toString() {
		return "User [id=" + id + ", name=" + name + ", address=" + address + ", phone=" + phone + "]";
	}

@Id
@GeneratedValue(strategy=GenerationType.IDENTITY)
private int id;
private String name;
private String address;
private long phone;

@OneToOne(cascade=CascadeType.ALL)
private Aadhar aadhar;

public int getId() {
	return id;
}

public void setId(int id) {
	this.id = id;
}

public String getName() {
	return name;
}

public void setName(String name) {
	this.name = name;
}

public String getAddress() {
	return address;
}

public void setAddress(String address) {
	this.address = address;
}

public long getPhone() {
	return phone;
}

public void setPhone(long phone) {
	this.phone = phone;
}

public Aadhar getAadhar() {
	return aadhar;
}

public void setAadhar(Aadhar aadhar) {
	this.aadhar = aadhar;
}

}
