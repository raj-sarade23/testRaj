package testRaj_ms.testRaj;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
@RestController
public class hotel {

    @GetMapping("/hotel")
    public String getData() { return "Please book hotel in 10% discount....";}
}
