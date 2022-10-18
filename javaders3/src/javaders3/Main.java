package javaders3;
//oopWithLayeredApp
import javaders3.business.ProductManager;
import javaders3.core.logging.DatabaseLogger;
import javaders3.core.logging.FileLogger;
import javaders3.core.logging.Logger;
import javaders3.core.logging.MailLogger;
import javaders3.dataAccess.HibernateProductDao;
import javaders3.dataAccess.JdbsProductDao;
import javaders3.entities.Product;

public class Main {

	public static void main(String[] args) throws Exception {
		Product product1 = new Product(1,"Iphone Xr",10000);
		
		Logger[] loggers= {new DatabaseLogger(), new FileLogger(), new MailLogger()};
		
		ProductManager productManager = new ProductManager(new HibernateProductDao(),loggers);
		productManager.add(product1);	
	}
}
