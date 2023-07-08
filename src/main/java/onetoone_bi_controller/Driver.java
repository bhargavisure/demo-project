package onetoone_bi_controller;

import onetone_bi_dao.UserDao;
import onetone_bi_dto.Aadhar;
import onetone_bi_dto.User;


public class Driver 
{
public static void main(String[] args) {
	User user =new User();
	user.setName("rani");
	user.setAddress("delhi");
	user.setPhone(783456);
	
	User user1 =new User();
	user1.setName("raju");
	user1.setAddress("mumbai");
	user1.setPhone(793400);
	
	User user2 =new User();
	user2.setName("xy");
	user2.setAddress("karnataka");
	user2.setPhone(456789);
	
	User user3=new User();
	user3.setName("AAAB");
	user3.setAddress("AP");
	user3.setPhone(543267);
	
	Aadhar aadhar=new Aadhar();
	aadhar.setA_name("rani");
	aadhar.setA_address("delhi");
	aadhar.setA_phone(783456);
	
	Aadhar aadhar1=new Aadhar();
	aadhar1.setA_name("raju");
	aadhar1.setA_address("mumbai");
	aadhar1.setA_phone(793400);
	
	Aadhar aadhar2=new Aadhar();
	aadhar2.setA_name("xy");
	aadhar2.setA_address("karnataka");
	aadhar2.setA_phone(456789);
	
	user.setAadhar(aadhar);
	user1.setAadhar(aadhar1);
	user2.setAadhar(aadhar2);
	
	UserDao dao=new UserDao();
//	dao.saveUser(user);
//	dao.saveUser(user1);
//	dao.saveUser(user2);
	user.setId(3);
	user.setName("dinga");
//	dao.findById(10);
	dao.updateUser(5, user);
}
}
