package com.github.alexandrenavarro.springbootsample.ws.restmvc;

import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.github.alexandrenavarro.springbootsample.ws.InstrumentDto;

/**
 * <p>RestTestService.</p>
 *
 * @author anavarro - Mar 8, 2015
 *
 */
@RestController
public class RestMvcTestService {

    /**
     * Constructor.
     *
     */
    public RestMvcTestService() {
        // TODO Auto-generated constructor stub

    }

    @RequestMapping("/test")
    String test() {
        return "Test";
    }
    
    @RequestMapping("/test1")
    InstrumentDto test1() {
        return new InstrumentDto("aa", "bbb");
    }
    
    

    @RequestMapping(value = "/test2", method = RequestMethod.PUT)
    public void save(@RequestBody InstrumentDto instrument) {
        System.out.println("instrument=" + instrument);
    }
    
    

}
