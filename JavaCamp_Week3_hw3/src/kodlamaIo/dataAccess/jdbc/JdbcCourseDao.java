package kodlamaIo.dataAccess.jdbc;

import kodlamaIo.dataAccess.CourseDao;
import kodlamaIo.entities.Course;

public class JdbcCourseDao implements CourseDao {
	public void add(Course course) {
		System.out.println("JDBC ile veritabanına eklendi");
	}
	
}
