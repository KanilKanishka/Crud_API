package crud.crud.Service;

import crud.crud.Entity.Customer;
import crud.crud.Repository.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import java.util.List;

@Service
public class CustomerService {
    @Autowired
    private static CustomerRepository repository;

    public static Customer saveCustomer(Customer customer) {
        return repository.save(customer);
    }

    public static List<Customer> saveCustomer(List<Customer> customer) {
        return repository.saveAll(customer);
    }

    public static List<Customer> getCustomers() {
        return repository.findAll();
    }

    public static Customer getCustomerById(int id) {
        return repository.findById(id).orElse(null);
    }

    public static Customer getCustomerByName(String name) {
        return repository.findByName(name);
    }

    public static String deleteCustomer(int id) {
        repository.deleteById(id);
        return "Customer removed !! " + id;
    }

    public static Customer updateCustomer(Customer customer) {
        Customer existingCustomer = repository.findById(customer.getCustomerId()).orElse(null);
        existingCustomer.setName(customer.getName());
        existingCustomer.setNIC(customer.getNIC());
        existingCustomer.setPhoneNumber(customer.getPhoneNumber());
        return repository.save(existingCustomer);
    }


}
