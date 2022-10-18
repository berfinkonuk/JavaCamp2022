package javaders3.business;

import java.util.Iterator;
import java.util.List;

import javaders3.core.logging.Logger;
import javaders3.dataAccess.JdbsProductDao;
import javaders3.dataAccess.ProductDao;
import javaders3.entities.Product;


public class ProductManager {
	private ProductDao productDao;
	private Logger[] loggers;
	
	public ProductManager(ProductDao productDao,Logger[] loggers) {
		this.productDao = productDao;
		this.loggers = loggers;
	}


	public void add(Product product) throws Exception {
		//iş kuralları
		if(product.getUnitPrice()<10) {
			throw new Exception("Ürün fiyatı 10'dan küçük olamaz");
		}
		productDao.add(product);
		
		for (Logger logger : loggers) { //[db,mail]
			logger.log(product.getName());
		}
		
	}

}
