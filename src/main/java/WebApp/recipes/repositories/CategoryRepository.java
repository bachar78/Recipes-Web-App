package WebApp.recipes.repositories;

import WebApp.recipes.models.Category;
import org.springframework.data.repository.CrudRepository;

public interface CategoryRepository extends CrudRepository<Category, Long> {
}
