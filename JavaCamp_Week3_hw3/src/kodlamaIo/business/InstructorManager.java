package kodlamaIo.business;

import kodlamaIo.logging.Logger;
import kodlamaIo.dataAccess.CategoryDao;
import kodlamaIo.dataAccess.InstructorDao;
import kodlamaIo.entities.Category;
import kodlamaIo.entities.Instructor;

public class InstructorManager {
	private InstructorDao instructorDao;
	private Logger[] loggers;
	
	
	public InstructorManager(InstructorDao instructorDao, Logger[] loggers) {
		this.instructorDao = instructorDao;
		this.loggers = loggers;
	}
	
	public void add(Instructor instructor) {
		instructorDao.add(instructor);
		System.out.println("Eğitmen eklendi");
		
		for(Logger logger:loggers) {
			logger.log(instructor.getInstructorFirstName());
		}

	}
}