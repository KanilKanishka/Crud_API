package crud.crud.Controller;

import crud.crud.Entity.Customer;
import crud.crud.Service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


import java.util.List;

@RestController
@RequestMapping("/registration")
public class CustomerController {

    @Autowired
    private CustomerService customerService;

    @PostMapping(path ="/addCustomer")
    public Customer addCustomer(@RequestBody Customer customer){
        return CustomerService.saveCustomer(customer);
    }

    @PostMapping(path ="/addMedicines")
    public List<Customer> addMedicines(@RequestBody List<Customer> customers){
        return CustomerService.saveCustomer(customers);
    }

    @GetMapping("/Medicines")

    public List<Customer> findAllCustomers(){
        return CustomerService.getCustomers();
    }

    @GetMapping("/medicineById/{id}")
    public Customer findCustomerById(@PathVariable int id) {
        return CustomerService.getCustomerById(id);
    }

    @GetMapping("/medicine/{name}")
    public Customer findCustomerByName(@PathVariable String name) {
        return CustomerService.getCustomerByName(name);
    }

    @PutMapping("/update")
    public Customer updateCustomer(@RequestBody Customer product) {
        return CustomerService.updateCustomer(product);
    }

    @DeleteMapping(path ="/delete/{id}")
    public String deleteCustomer(@PathVariable int id) {
        return CustomerService.deleteCustomer(id);
    }
}
