package WebApp.recipes.repositories.recipe;

import WebApp.recipes.models.receipes.Recipe;
import org.springframework.data.repository.CrudRepository;

public interface RecipeRepository extends CrudRepository<Recipe, Long> {
}
