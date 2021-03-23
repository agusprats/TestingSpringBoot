package ar.com.app.spring.app;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController

public class DemoRest {

@RequestMapping(value = "/welcome/{nombre}", method = RequestMethod.GET)
    public String welcome(@PathVariable String nombre){
        return "WELCOME "+nombre+" to the HOUSE !!!";
    }
}
