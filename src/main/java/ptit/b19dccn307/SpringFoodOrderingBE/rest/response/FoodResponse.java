package ptit.b19dccn307.SpringFoodOrderingBE.rest.response;

import lombok.Data;
import ptit.b19dccn307.SpringFoodOrderingBE.model.Restaurant;

@Data
public class FoodResponse {
    
    private Long foodId;

    private String foodName;

    private String description;

    private String image;

    private Double price;

    private String unit;

    private String category;

    private Integer status;

    private Restaurant restaurant;

}
