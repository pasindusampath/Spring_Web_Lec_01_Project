package lk.ijse.gdse63.test.api;

import lk.ijse.gdse63.test.dto.CustomerDTO;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/customer")
public class CustomerController {

    @PostMapping(value = "/save" , consumes = "application/json")
    public CustomerDTO saveCustomer(@RequestBody CustomerDTO customerDTO) {
        System.out.println(customerDTO.toString());
        return customerDTO;
    }



}
