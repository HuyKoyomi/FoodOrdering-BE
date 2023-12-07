package ptit.b19dccn307.SpringFoodOrderingBE.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "restaurant")
public class Restaurant {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Long restaurantId;

    private String restaurantName;

    private String location;

    private String reviews;

    private Double rating;

    private String image;

    private String address;

    private String restaurantType;

    @OneToMany(mappedBy = "restaurant", fetch = FetchType.LAZY)
    @JsonIgnore
    private List<Food> foodList;

    @OneToMany(mappedBy = "restaurant")
    private List<FavoriteRestaurant> favorieRestaurantList;

}

