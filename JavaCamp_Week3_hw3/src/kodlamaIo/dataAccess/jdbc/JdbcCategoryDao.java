package kodlamaIo.dataAccess.jdbc;

import kodlamaIo.dataAccess.CategoryDao;
import kodlamaIo.entities.Category;

public class JdbcCategoryDao implements CategoryDao {

	@Override
	public void add(Category category) {
		System.out.println("JDBC ile veritabanına eklendi");
		
	}


}
