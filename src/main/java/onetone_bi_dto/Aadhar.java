package onetone_bi_dto;

import javax.persistence.Entity;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class Aadhar 
{
@Id
@GeneratedValue(strategy=GenerationType.IDENTITY)
private int a_id;
private String a_name;
private String a_address;

private long a_phone;


@OneToOne(mappedBy="aadhar")
private User user;

@Override
public String toString() {
	return "Aadhar [a_id=" + a_id + ", a_name=" + a_name + ", a_address=" + a_address + ", a_phone=" + a_phone
			+ ", user=" + user + "]";
}

public int getA_id() {
	return a_id;
}

public void setA_id(int a_id) {
	this.a_id = a_id;
}

public String getA_name() {
	return a_name;
}

public void setA_name(String a_name) {
	this.a_name = a_name;
}

public String getA_address() {
	return a_address;
}

public void setA_address(String a_address) {
	this.a_address = a_address;
}

public long getA_phone() {
	return a_phone;
}

public void setA_phone(long a_phone) {
	this.a_phone = a_phone;
}

public User getUser() {
	return user;
}

public void setUser(User user) {
	this.user = user;
}


}
