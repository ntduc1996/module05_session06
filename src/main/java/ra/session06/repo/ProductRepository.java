package ra.session06.repo;

import org.springframework.stereotype.Repository;
import ra.session06.model.entity.Product;

import java.util.List;

@Repository
public class ProductRepository {
    public List<Product> getAllProducts() {
        return List.of(
                new Product(1, "Áo thun nam", 199000.0, "Áo thun cotton 100%, mềm mịn, thoáng mát", "https://example.com/images/aothun1.jpg"),
                new Product(2, "Quần jean nữ", 399000.0, "Quần jean nữ co giãn, form ôm", "https://example.com/images/jean1.jpg"),
                new Product(3, "Giày sneaker", 599000.0, "Giày sneaker thể thao năng động", "https://example.com/images/giay1.jpg"),
                new Product(4, "Balo laptop", 459000.0, "Balo đựng laptop 15.6 inch, chống nước", "https://example.com/images/balo1.jpg"),
                new Product(5, "Tai nghe Bluetooth", 249000.0, "Tai nghe không dây, pin 6h", "https://example.com/images/tainghe1.jpg"),
                new Product(6, "Đồng hồ nam", 1299000.0, "Đồng hồ dây da, chống nước 3ATM", "https://example.com/images/dongho1.jpg"),
                new Product(7, "Áo khoác nữ", 299000.0, "Áo khoác nữ chất gió, nhẹ, ấm", "https://example.com/images/aokhoac1.jpg"),
                new Product(8, "Bình giữ nhiệt", 179000.0, "Bình giữ nhiệt inox 500ml", "https://example.com/images/binh1.jpg"),
                new Product(9, "Túi tote vải", 99000.0, "Túi tote canvas thời trang", "https://example.com/images/tui1.jpg"),
                new Product(10, "Sách kỹ năng sống", 89000.0, "Cuốn sách giúp phát triển bản thân", "https://example.com/images/sach1.jpg")
        );
    }
}
