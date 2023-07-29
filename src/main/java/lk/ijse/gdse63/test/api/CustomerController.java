package lk.ijse.gdse63.test.api;

import lk.ijse.gdse63.test.dto.CustomerDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/customer")
public class CustomerController {

    @PostMapping(value = "/get")
    public CustomerDTO getCustomer() {

        CustomerDTO customerDTO = new CustomerDTO("1", "John", "123", "123", "123");
        return customerDTO;
    }
}
