package io.zipcoder.controller;

import io.zipcoder.domain.KittyKat;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class KittyKatController {

    @RequestMapping("/cat")
    public KittyKat createCat(){
        KittyKat cat = new KittyKat();
        cat.setName("Oscar");
        return cat;
    }
}
