package ra.session06_bai03.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import ra.session06_bai03.Model.entity.Product;
import ra.session06_bai03.service.ProductService;

import java.util.List;

@Controller
@RequestMapping(value = "/")
public class ProductController {
    @Autowired
    private ProductService productService;

    @GetMapping({"/", "/products"})
    public String productList(Model model) {
        model.addAttribute("productList", productService.findAll());
        return "productList";
    }

    @GetMapping("/products/add")
    public String showAddForm(Model model) {
        model.addAttribute("product", new Product());
        return "addProduct"; // Trả về form nhập
    }

    @PostMapping("/products/add")
    public String handleAddProduct(@RequestParam("productName") String name,
                                   @RequestParam("quantity") int quantity,
                                   @RequestParam("price") double price,
                                   Model model) {
        Product p = new Product();
        p.setProductName(name);
        p.setQuantity(quantity);
        p.setPrice(price);

        productService.save(p);
        model.addAttribute("product", p);
        return "newProduct"; // Hiển thị sản phẩm vừa nhập
    }
}
