package storePlat;
import org.springframework.data.repository.CrudRepository;
import storePlat.Product;


public interface ProductRepository extends CrudRepository<Product, Long> {

}
