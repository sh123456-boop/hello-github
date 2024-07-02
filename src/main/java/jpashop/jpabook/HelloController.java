package jpashop.jpabook;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

public class HelloController {

    @GetMapping("Hi")
    public String Hi(Model model) {
        model.addAttribute("data", "Hi");
        return "Hi";
    }
}
