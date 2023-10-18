package WebApp.recipes.repositories.recipe;

import WebApp.recipes.models.receipes.UOM;
import org.springframework.data.repository.CrudRepository;

import java.util.Optional;

public interface UOMRepository extends CrudRepository<UOM, Long> {
    Optional<UOM> findByUom(String uom);
}
