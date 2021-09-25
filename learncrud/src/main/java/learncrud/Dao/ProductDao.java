package learncrud.Dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import learncrud.model.Product;

@Component
public class ProductDao {
	
	@Autowired
	private HibernateTemplate hibernateTemplate;
	
	//create
	@Transactional
	public void createProduct(Product product) {
		
		this.hibernateTemplate.saveOrUpdate(product);
		
	}
	//get all product
	@Transactional
	public List<Product> getProducts() {
		
		List<Product> products= this.hibernateTemplate.loadAll(Product.class);
		
		return products;
		
	}
	
	//delete
	@Transactional
	public void deleteProduct(int pId) {
		
		Product p = this.hibernateTemplate.load(Product.class, pId);
		this.hibernateTemplate.delete(p);
		
	}
	
	//get the single product
	@Transactional
	public Product getProduct(int pId) {
		
		
		return this.hibernateTemplate.get(Product.class, pId);
		
	}
	
	//update
	
	@Transactional
	public void updateProduct(int pId) {
		
		Product p = this.hibernateTemplate.load(Product.class, pId);
		this.hibernateTemplate.delete(p);
		
	}

}
