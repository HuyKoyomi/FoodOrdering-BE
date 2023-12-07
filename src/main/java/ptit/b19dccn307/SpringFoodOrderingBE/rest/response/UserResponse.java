package ptit.b19dccn307.SpringFoodOrderingBE.rest.response;

import lombok.Data;
import ptit.b19dccn307.SpringFoodOrderingBE.model.FavoriteRestaurant;
import ptit.b19dccn307.SpringFoodOrderingBE.model.Restaurant;

import java.util.Date;
import java.util.List;
@Data
public class UserResponse {
    private Long userId;

    private String account;

    private String password;

    private String fullName;

    private String phoneNumber;

    private String email;

    private String address;

    private Date dob;

    private String message;

    private Boolean status;

    private List<FavoriteRestaurant> favorieRestaurantList;
}
