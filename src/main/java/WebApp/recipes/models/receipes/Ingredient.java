package WebApp.recipes.models.receipes;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;

@Entity
@NoArgsConstructor
public class Ingredient {
    public Ingredient(String description, BigDecimal amount, UOM uom, Recipe recipe) {
        this.uom = uom;
        this.description = description;
        this.amount = amount;
        this.recipe = recipe;
    }

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @JsonIgnore
    @ManyToOne(fetch = FetchType.EAGER)
    private UOM uom;

    private String description;
    private BigDecimal amount;

    @JsonIgnore
    @ManyToOne
    private Recipe recipe;
}
