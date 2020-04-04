import entities.cours;
import metier.ICourImpl;

public class Test {

	public static void main(String[] args) {
		ICourImpl metier = new ICourImpl() ;
		metier.add(new cours ( "JEE" , "29/02/2019 ","15h->18h","2 ING GL"));
		
		metier.add(new cours ( "AWS" , "29/02/2019 ","10h->13h","2 ING CLOUD"));
}
	
	
}