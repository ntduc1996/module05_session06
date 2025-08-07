package ra.session06_bai03.repo;

import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;
import ra.session06_bai03.Model.entity.Product;

import java.util.ArrayList;
import java.util.List;

@Repository
public class ProductRepository {
    private final List<Product> data = new ArrayList<>();

    // khởi tạo vài dữ liệu mẫu
    public ProductRepository() {
        data.add(new Product("Áo thun nam",10, 199000.0));
        data.add(new Product("Quần jean nữ",40, 399000.0));
        data.add(new Product("Giày sneaker",68, 599000.0));
        data.add(new Product("Balo laptop",36, 459000.0));
        data.add(new Product("Tai nghe Bluetooth",16, 249000.0));
    }

    public List<Product> findAll(){
        return new ArrayList<>(data); // trả về bản sao để tránh bị sửa trực tiếp từ bên ngoài
    }

    public void save(Product p){
        data.add(p);
    }
}
