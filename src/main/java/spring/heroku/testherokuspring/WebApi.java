/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package spring.heroku.testherokuspring;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author jscru
 */
@CrossOrigin(origins = "*", maxAge =3600)
@RestController
public class WebApi {
    @RequestMapping("/randomValue")
    @ResponseBody
    public String getRandomValue(){
        int rnd = (int)(Math.random() * (100 - 50 + 1) + 50);
        int  hola = rnd;
        int jr = 1000;
        String harold;
        return Integer.toString(rnd);
    }
    
    @RequestMapping("/getString")
    @ResponseBody
    public String getString(){
        String test = "";
        boolean bool = false;
        int testInt = 0;
        //Junior se la come
        return "return de prueba";
    }
}
