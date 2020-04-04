package entities;

import java.io.Serializable;



import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
@Entity 
@Table(name="cours")
public class cours implements Serializable{
	@Id 
	@GeneratedValue(strategy=GenerationType.IDENTITY) 
	@Column(name="idc")
	public long idc ;
	@Column(name="nom")
	public String nom ;
	public cours() {
		
	}
	public cours( String nom, String date, String heure, String classe) {
	
		this.nom = nom;
		this.date = date;
		Heure = heure;
		this.classe = classe;
	}
	@Column(name="date")
	public String date ;
	@Column(name="heure")
	public String Heure ;
	@Column(name="classe")
	public String classe ;
	public long getIdc() {
		return idc;
	}
	public void setIdc(long idc) {
		this.idc = idc;
	}
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date = date;
	}
	public String getHeure() {
		return Heure;
	}
	public void setHeure(String heure) {
		Heure = heure;
	}
	public String getClasse() {
		return classe;
	}
	public void setClasse(String classe) {
		this.classe = classe;
	}

}
