package test;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.hibernate.Query;

import javax.persistence.EntityTransaction;
//import javax.persistence.Query;

import org.hibernate.Session;
import org.hibernate.Transaction;


public class HibernateMain {
	
	public static void main(String[] args) {
		
		Session session = HibernateUtil.getSessionFactory().getCurrentSession();
		Transaction transaction = session.beginTransaction();
		try {
			
			
			
			transaction.commit();
			
		}catch (Exception e) {
			transaction.rollback();
			e.printStackTrace();
		}finally {
			if (session.isOpen())
				session.close();
		}
	}

	public HibernateMain() {
		// TODO Auto-generated constructor stub
	}

}
