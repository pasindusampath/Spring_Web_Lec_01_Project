package lk.ijse.gdse63.test.api;

import lk.ijse.gdse63.test.dto.CustomerDTO;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value = "/customer")
public class CustomerController {

    @PostMapping(value = "/save" , consumes = "application/json")
    public CustomerDTO saveCustomer(@RequestBody CustomerDTO customerDTO) {
        System.out.println(customerDTO.toString());
        return customerDTO;
    }

    @GetMapping(value = "get/{id:S\\d{3}}")
    public CustomerDTO getCustomer(@PathVariable String id){
        System.out.println(id);
        return new CustomerDTO("a","b","c","d","e");
    }

    @GetMapping(value = "get/{id}/{name}")
    public CustomerDTO getCustomerWithMultipleDetails(@PathVariable String id, @PathVariable String name){
        System.out.println(id);
        System.out.println(name);
        return new CustomerDTO("a","b","c","d","e");

    }

    @GetMapping(value = "get", headers = "x-token")
    public CustomerDTO getCustomerWithToken(@RequestHeader("x-token") String token){
        System.out.println(token);
        return new CustomerDTO("a","b","c","d","e");
    }

    @GetMapping(value = "take/{id}" , headers = "x-token")
    public String getData(@PathVariable String id, @RequestHeader("x-token") String token){
        System.out.println("Id : "+id+"| Token : "+token);
        return "OK";
    }



}
