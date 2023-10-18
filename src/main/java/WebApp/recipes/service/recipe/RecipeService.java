package WebApp.recipes.service.recipe;

import WebApp.recipes.models.receipes.Recipe;
import org.springframework.stereotype.Service;

import java.util.Set;

public interface RecipeService {
    Set<Recipe> getAllRecipes();
    Recipe findById(Long id);
}
