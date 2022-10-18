package kodlamaIo;


import java.util.ArrayList;
import java.util.List;
import kodlamaIo.business.CategoryManager;
import kodlamaIo.business.CourseManager;
import kodlamaIo.business.InstructorManager;
import kodlamaIo.logging.DatabaseLogger;
import kodlamaIo.logging.FileLogger;
import kodlamaIo.logging.Logger;
import kodlamaIo.logging.MailLogger;
import kodlamaIo.dataAccess.hibernate.HibernateCategoryDao;
import kodlamaIo.dataAccess.hibernate.HibernateCourseDao;
import kodlamaIo.dataAccess.hibernate.HibernateInstructorDao;
import kodlamaIo.dataAccess.jdbc.JdbcCategoryDao;
import kodlamaIo.entities.Category;
import kodlamaIo.entities.Course;
import kodlamaIo.entities.Instructor;

 public class Main {

	public static void main(String[] args) throws Exception {
		
		Logger[] loggers = {new MailLogger(), new DatabaseLogger(), new FileLogger()};
		
		//CATEGORY
	System.out.println("CATEGORY");
	
	        List<Category> categories = new ArrayList<>();
	        categories.add(new Category(1,"Web"));
	        categories.add(new Category(2,"Mobil"));
	       
	       
  CategoryManager categoryManager = new CategoryManager(new HibernateCategoryDao(), loggers,categories);
	    
	        try {
	            categoryManager.add(new Category(3,"Programlama"));
	           
	        }catch (Exception x){
	            System.out.println(x);
	        }
	            
	    			//COURSE
	    		System.out.println("COURSE");
	    		   
	    		        List<Course> courses = new ArrayList<>();
	    		        courses.add(new Course(1,"Java",100));
	    		        courses.add(new Course(2,"Mobil ",170));
	    		       
	    		        CourseManager courseManager = new CourseManager(new HibernateCourseDao(), loggers,courses);
	    		        
	    		       try { courseManager.add(new Course(3,"Kotlin",150));
	    		           }catch (Exception x1){
	    		            System.out.println(x1);
	    		        }

	        
	        //INSTRUCTOR
	        System.out.println("INSTRUCTOR");
			
			Instructor newInstructor = new Instructor(1, "Engin","Demiroğ");  
			       
	     InstructorManager instructorManager = new InstructorManager(new HibernateInstructorDao(), loggers);
		   instructorManager.add(newInstructor);
	}
}
