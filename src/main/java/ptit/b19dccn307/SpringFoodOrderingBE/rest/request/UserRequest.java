package ptit.b19dccn307.SpringFoodOrderingBE.rest.request;

import jakarta.persistence.OneToMany;
import lombok.Data;
import ptit.b19dccn307.SpringFoodOrderingBE.model.FavoriteRestaurant;
import ptit.b19dccn307.SpringFoodOrderingBE.model.Restaurant;

import java.util.Date;
import java.util.List;

@Data
public class UserRequest {
    private Long userId;

    private String account;

    private String password;

    private String fullName;

    private String phoneNumber;

    private String email;

    private String address;

    private Date dob;

    private List<FavoriteRestaurant> favorieRestaurantList;
}
