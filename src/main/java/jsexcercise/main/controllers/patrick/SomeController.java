package jsexcercise.main.controllers.patrick;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class SomeController {

    @GetMapping("/today")
    public String today() {
        return "today";
    }

}
