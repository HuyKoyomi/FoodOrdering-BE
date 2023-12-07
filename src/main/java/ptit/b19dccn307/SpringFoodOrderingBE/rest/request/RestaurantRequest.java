package ptit.b19dccn307.SpringFoodOrderingBE.rest.request;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import lombok.Data;
import ptit.b19dccn307.SpringFoodOrderingBE.model.FavoriteRestaurant;
import ptit.b19dccn307.SpringFoodOrderingBE.model.Food;
import ptit.b19dccn307.SpringFoodOrderingBE.model.Restaurant;
import ptit.b19dccn307.SpringFoodOrderingBE.model.User;

import java.util.Date;
import java.util.List;

@Data
public class RestaurantRequest {

    private String restaurantName;

    private String location;

    private String reviews;

    private Double rating;

    private String image;

    private String address;

    private String restaurantType;

    private List<Food> foodList;

    private List<FavoriteRestaurant> favorieRestaurantList;
}
