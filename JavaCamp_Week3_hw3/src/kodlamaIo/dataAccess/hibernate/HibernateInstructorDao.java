package kodlamaIo.dataAccess.hibernate;

import kodlamaIo.dataAccess.InstructorDao;
import kodlamaIo.entities.Instructor;

public class HibernateInstructorDao implements InstructorDao {

	@Override
	public void add(Instructor instructor) {
		System.out.println("Hibernate ile veritbanına eklendi");
		
	}

}
