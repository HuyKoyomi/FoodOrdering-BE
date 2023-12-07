package ptit.b19dccn307.SpringFoodOrderingBE.rest.response;

import lombok.Data;
import ptit.b19dccn307.SpringFoodOrderingBE.model.FavoriteRestaurant;
import ptit.b19dccn307.SpringFoodOrderingBE.model.Food;

import java.util.Date;
import java.util.List;

@Data
public class RestaurantResponse {
    private Long restaurantId;

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
