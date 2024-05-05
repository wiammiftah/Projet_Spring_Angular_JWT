package ma.enset.ebankingbackend.repositories;

import ma.enset.ebankingbackend.entities.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface CustomerRepository extends JpaRepository<Customer, Long> {
    List<Customer> findByFirstNameContainsOrLastNameContains(String firstName, String lastName);
}
