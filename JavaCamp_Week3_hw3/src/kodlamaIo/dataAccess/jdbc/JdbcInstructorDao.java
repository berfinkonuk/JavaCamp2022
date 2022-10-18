package kodlamaIo.dataAccess.jdbc;

import kodlamaIo.dataAccess.InstructorDao;
import kodlamaIo.entities.Instructor;

public class JdbcInstructorDao implements InstructorDao {

	@Override
	public void add(Instructor instructor) {
		System.out.println("JDBC ile veritabanına eklendi");
		
	}
	
}
