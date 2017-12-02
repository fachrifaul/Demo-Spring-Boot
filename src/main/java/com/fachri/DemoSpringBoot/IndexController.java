package com.fachri.DemoSpringBoot;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;

/**
 * Created by fachrifebrian on 12/2/17.
 */

@RestController
public class IndexController {

    @RequestMapping("/")
    public String index() {
        return "Hello fellas!" + System.currentTimeMillis();
    }
}
