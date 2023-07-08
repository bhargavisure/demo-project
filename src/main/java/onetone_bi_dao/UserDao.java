package onetone_bi_dao;




import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

import onetone_bi_dto.User;

public class UserDao 
{
public EntityManager getEntitymanager()
{
	EntityManagerFactory emf=Persistence.createEntityManagerFactory("rakesh");
	EntityManager em=emf.createEntityManager();
	return em;
	
}
public void saveUser(User user)
{
	EntityManager entityManager=getEntitymanager();
	EntityTransaction et=entityManager.getTransaction();
	et.begin();
	entityManager.persist(user);
	et.commit();
}
public void updateUser(int id,User user) {
	EntityManager em=getEntitymanager();
	EntityTransaction et=em.getTransaction();
	User user2=em.find(User.class,id);
	et.begin();
	if(user2!=null)
	{
	user.setId(id);
	user2.setName(user.getName());
	em.merge(user2);
	et.commit();
}
	else {
		System.out.println("Id not found");
		
	}
}
public void deleteUser(int id)
{
	EntityManager em=getEntitymanager();
	EntityTransaction et=em.getTransaction();	
	et.begin();
	User user=em.find(User.class,id);
	if(user!=null)
	{
	em.remove(user);
et.commit();
	}
	else
	{
		System.out.println("Id not found");
	}
}
public void findById(int id)
{
	EntityManager em=getEntitymanager();
	User user=em.find(User.class,id);
	System.out.println(user);
	if(user!=null)
	{
		System.out.println("id not found");
	}
}
public List<User>findAll()
{
	EntityManager em=getEntitymanager();
	Query query=em.createQuery("select u from User u");
	List<User>list=query.getResultList();
	System.out.println(list);
	return list;
}
}
