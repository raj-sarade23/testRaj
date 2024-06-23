package testRaj_ms.testRaj;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
@RestController
public class flight {

    @GetMapping("/flight")
    public String getData() { return "Please book flight in 20% discount....";}
}
