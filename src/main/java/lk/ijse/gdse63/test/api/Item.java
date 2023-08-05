package lk.ijse.gdse63.test.api;

import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import java.util.Random;

@RestController
@RequestMapping("item")
public class Item {
    @ResponseStatus(HttpStatus.CREATED)
    @PostMapping(consumes = MediaType.APPLICATION_JSON_VALUE)
    public String saveOrder(){
        System.out.println("Json Order");
        return "JSON";
    }


    @ResponseStatus(HttpStatus.CREATED)
    @PostMapping(consumes = MediaType.APPLICATION_XML_VALUE)
    public String saveOrder1(){
        System.out.println("XML");
        return "X-ML Order";
    }


    @PostMapping(value = "saveOrUpdate" , consumes = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<String> saveOrUpdate(){
        if(new Random().nextInt(2)<1){
            return new ResponseEntity<>("JSON", HttpStatus.CREATED);
        }else {
            return new ResponseEntity<>("JSON", HttpStatus.NO_CONTENT);
        }
    }
}
