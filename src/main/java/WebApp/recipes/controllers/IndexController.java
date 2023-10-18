package WebApp.recipes.controllers;

import WebApp.recipes.models.receipes.Category;
import WebApp.recipes.models.receipes.UOM;
import WebApp.recipes.repositories.recipe.CategoryRepository;
import WebApp.recipes.repositories.recipe.UOMRepository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Optional;

@RestController
public class IndexController {

    private CategoryRepository categoryRepository;
    private UOMRepository uomRepository;

    public IndexController(CategoryRepository categoryRepository, UOMRepository uomRepository) {
        this.categoryRepository = categoryRepository;
        this.uomRepository = uomRepository;
    }

    @GetMapping
    @RequestMapping("/index")
    private Category getIndexDetails() {
        Optional<Category> OpCat = categoryRepository.findByDescription("Vegetarian");
        Optional<UOM> OpUom = uomRepository.findByUom("Cup");
        if (OpCat.isPresent() && OpUom.isPresent()) {
            System.out.println("The category is: " + OpCat.get().getDescription() + "The Id is: " + OpCat.get().getId());
            System.out.println("The UOM is: " + OpUom.get().getUom() + " The Id is: " + OpUom.get().getId());
        } else {
            System.out.println("There are not available in our repositories");
        }
        return OpCat.get();
    }
}
