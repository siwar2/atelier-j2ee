package metier;
import java.io.Serializable;
import java.util.List;

import entities.cours;
public interface IcourMetier {

	
		public void  add(cours c);
	    public void delete (long id) ;
	  //  public T getByIndex(Serializable index)throws Exception;
	    public List<cours> listcours();
	    public void update (cours c) ;
	    public  cours  getcours (long id); 
	    public List<cours> getcoursParNom(String nom);

	}

