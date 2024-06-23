package testRaj_ms.testRaj;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
@RestController
public class Bus {

    @GetMapping("/Bus")
    public String getData() { return "Please book Bus in 20% discount....";}
}
