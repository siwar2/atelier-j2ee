package metier;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;

import entities.cours;
import util.HibernateUtil;

public class ICourImpl implements IcourMetier {

	@Override
	public void add(cours c) {
		Session session = HibernateUtil.getSessionFactory().getCurrentSession() ;
		session.beginTransaction();
		try {
		session.save(c);
		} catch(Exception e) {
			session.getTransaction().rollback();
			e.printStackTrace();
		}
		session.getTransaction().commit();
		
	}

	@Override
	public void delete(long id) {
		Session session = HibernateUtil.getSessionFactory().getCurrentSession() ;
		session.beginTransaction();
		Object c=session.get(cours.class , id); 
		if (c ==null) throw new RuntimeException ("cours introuvable ") ;
		session.delete(c);
		session.getTransaction().commit(); 
	}

	@Override
	public List<cours> listcours() {
		Session session = HibernateUtil.getSessionFactory().getCurrentSession() ;
		session.beginTransaction();
		Query req= session.createQuery("select c from cours c ") ;
		List<cours>   cours=req.list(); 
		session.getTransaction().commit();
				return cours ;
	}

	@Override
	public void update(cours c) {
		Session session = HibernateUtil.getSessionFactory().getCurrentSession() ;
		session.beginTransaction();
		session.update(c);
		session.getTransaction().commit();
		
	}

	@Override
	public cours getcours(long id) {
		Session session = HibernateUtil.getSessionFactory().getCurrentSession() ;
		session.beginTransaction();
		Object c=session.get(cours.class , id); 
		if (c ==null) throw new RuntimeException ("cours introuvable ") ;
		return (cours) c ;
	}

	@Override
	public List<cours> getcoursParNom(String nom) {
		Session session = HibernateUtil.getSessionFactory().getCurrentSession() ;
		session.beginTransaction();
		Query req=session.createQuery("select c from cours c where c.nom like :x");
				req.setParameter("x", "%"+nom+"%");	
				List<cours> cours=req.list();
				session.getTransaction().commit();
				return cours ;
	}

}
