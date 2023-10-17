package WebApp.recipes.models;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public class UOM {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
}
