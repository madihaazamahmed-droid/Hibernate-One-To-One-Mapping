package hibernateproject2;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.EntityTransaction;
import jakarta.persistence.Persistence;

public class mainclass {
	public static void main(String[] args) {
		EntityManagerFactory emf=Persistence.createEntityManagerFactory("dev");
		EntityManager em=emf.createEntityManager();
		EntityTransaction et=em.getTransaction();
		
		
		person ps1=new person();
		ps1.setP_id(101);
		ps1.setP_name("MADIHA");
		ps1.setPh_no(34567890);
		
		
		person ps2=new person();
		ps2.setP_id(102);
		ps2.setP_name("Azam");
		ps2.setPh_no(3456757);
		
		
		
		pancard pc1=new pancard();
		pc1.setPan_no("FCVP4567776");
		
		pancard pc2=new pancard();
		pc2.setPan_no("MADTU56788");
		
		ps1.setP1(pc1);
		ps2.setP1(pc2);
		
		et.begin();
		em.persist(ps1);
		em.persist(ps2);
		em.persist(pc1);
		em.persist(pc2);
		et.commit();
		System.out.println("one to one mapped successfully....");
		
		
		
	}

}
