package amol.springfreamwork.spring6webapp.domain;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyController {
    @GetMapping("/")
    public String home() {
        return "Hello,mohamadjoon welcome to java";


    }
}
