package javaders3.dataAccess;

import javaders3.entities.Product;

public class JdbsProductDao implements ProductDao {
	public void add(Product product) {
		//sadece db erişim kodları buraya yazılır...SQL
		System.out.println("JDBC ile veritabanına eklendi");
	}
}

//Hibernate