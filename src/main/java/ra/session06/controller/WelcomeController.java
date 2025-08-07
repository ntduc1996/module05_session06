package ra.session06.controller;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@org.springframework.stereotype.Controller
@RequestMapping(value = {"/"})
public class WelcomeController {
    @GetMapping
    public String hello(Model model) {
        model.addAttribute("message", "Chào mừng đến với ứng dụng của chúng tôi!");
        return "hello";
    }
}
