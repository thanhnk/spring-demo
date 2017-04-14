package my.example.spring.web;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by thanh on 4/14/17.
 */
@RestController
public class CustomerController {
    @RequestMapping("/customers")
    public String listing() {
        return "Customer Listing!";
    }
}
