package kodlamaIo.dataAccess.hibernate;

import kodlamaIo.dataAccess.CategoryDao;
import kodlamaIo.entities.Category;

public class HibernateCategoryDao implements CategoryDao {

	@Override
	public void add(Category category) {
		System.out.println("Hibernate ile veritabanına eklendi");
		
	}

}
