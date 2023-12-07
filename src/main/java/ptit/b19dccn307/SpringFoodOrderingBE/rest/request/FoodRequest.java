package ptit.b19dccn307.SpringFoodOrderingBE.rest.request;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import ptit.b19dccn307.SpringFoodOrderingBE.model.Restaurant;

@Data
@Getter
@Setter
public class FoodRequest {

    private String foodName;

    private String description;

    private String image;

    private Double price;

    private String unit;

    private String category;

    private Integer status;

//    private Restaurant restaurant;

    private Long restaurantId;

}
