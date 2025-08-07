package ra.session06.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ra.session06.model.entity.Product;
import ra.session06.repo.ProductRepository;

import java.util.List;
@Service
public class ProductService {
    @Autowired
    ProductRepository productRepository;

    public List<Product> getProduct(){
        return productRepository.getAllProducts();
    };
}
