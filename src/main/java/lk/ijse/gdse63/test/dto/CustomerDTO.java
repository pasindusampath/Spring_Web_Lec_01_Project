package lk.ijse.gdse63.test.dto;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;


@NoArgsConstructor
@AllArgsConstructor
@Data
public class CustomerDTO implements Serializable {
    private String id;
    private String name;
    private String address;
    private String phone;
    private String email;


}
