package WebApp.recipes.controllers.recipe;

import WebApp.recipes.models.receipes.Recipe;
import WebApp.recipes.service.recipe.RecipeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Set;

import static java.lang.Long.parseLong;

@RestController
public class RecipeController {
    private final RecipeService recipeService;

    public RecipeController(RecipeService recipeService) {
        this.recipeService = recipeService;
    }

    @RequestMapping("/recipes")
    @GetMapping
    public Set<Recipe> getAllRecipes() {
        return recipeService.getAllRecipes();
    }


    @RequestMapping("/recipes/{id}")
    @GetMapping
    public Recipe getARecipeById(@PathVariable String id) {
        return recipeService.findById(parseLong(id));
    }
}
