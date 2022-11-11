package crud.crud.Repository;

import crud.crud.Entity.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CustomerRepository extends JpaRepository<Customer,Integer> {
    Customer findByName(String name);
    Customer findByNIC(String NIC);

}
