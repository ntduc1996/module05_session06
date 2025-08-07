package ra.session06_bai03.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ra.session06_bai03.Model.entity.Product;
import ra.session06_bai03.repo.ProductRepository;

import java.util.List;

@Service
public class ProductService {
    @Autowired
    private ProductRepository productRepository;
    public List<Product> findAll(){
        return productRepository.findAll();
    }
    public void save(Product p){
        productRepository.save(p);
    }
}
