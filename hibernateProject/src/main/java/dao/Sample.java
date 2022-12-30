package dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;


import dto.Student;

public class Sample {

	EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("dev");
	EntityManager entityManager=entityManagerFactory.createEntityManager();
	EntityTransaction entityTransaction=entityManager.getTransaction();
	
	public void addStudent(int id,String name,String branch)
    {
    	entityTransaction.begin();
    	Student student=new Student();
    	student.setStudent_id(id);
    	student.setStudent_name(name);
    	student.setStudent_branch(branch);
    	
    	entityManager.persist(student);
    	entityTransaction.commit();
    }
	
	public void fetchStudent(int id)
    {
    	Student student=entityManager.find(Student.class, id);
    	System.out.println(student);
    	
    }
	
	public void removeStudent(int id)
    {
    	entityTransaction.begin();
    	Student student=entityManager.find(Student.class, id);
    	entityManager.remove(student);
    	entityTransaction.commit();
    }
	
	public void updateStudent(int id,String name)
    {   entityTransaction.begin();
    	Student student=entityManager.find(Student.class, id);
    	student.setStudent_name(name);
    	entityManager.merge(student);
    	entityTransaction.commit();
    	
    }
	
	 public void fetchAll()
	    {
	    	Query query=entityManager.createQuery("select a from Student a");
	        List<Student> list=	query.getResultList();
	        for(Student student:list)
	        System.out.println(student);
	    }
	 
	   public void deleteAll()
	    {
	    	Query query=entityManager.createQuery("delete from Student");
	    	entityTransaction.begin();
	    	query.executeUpdate();
	    	entityTransaction.commit();
	    }
}
