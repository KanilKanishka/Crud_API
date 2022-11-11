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
        return customerService.saveCustomer(customer);
    }

    @PostMapping(path ="/addCustomers")
    public List<Customer> addCustomers(@RequestBody List<Customer> customers){
        return customerService.saveCustomer(customers);
    }

    @GetMapping("/Customers")

    public List<Customer> findAllCustomers(){
        return customerService.getCustomers();
    }

    @GetMapping("/customerById/{id}")
    public Customer findCustomerById(@PathVariable int id) {
        return customerService.getCustomerById(id);
    }

    @GetMapping("/customer/{name}")
    public Customer findCustomerByName(@PathVariable String name) {
        return customerService.getCustomerByName(name);
    }

    @PutMapping("/update")
    public Customer updateCustomer(@RequestBody Customer product) {
        return customerService.updateCustomer(product);
    }

    @DeleteMapping(path ="/delete/{id}")
    public String deleteCustomer(@PathVariable int id) {
        return customerService.deleteCustomer(id);
    }
}
