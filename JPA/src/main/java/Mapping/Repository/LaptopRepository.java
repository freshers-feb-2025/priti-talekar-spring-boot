package Mapping.Repository;

import Mapping.Entity.Laptop;
import org.springframework.data.repository.CrudRepository;

public interface LaptopRepository extends CrudRepository<Laptop,Integer> {
}
