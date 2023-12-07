package ptit.b19dccn307.SpringFoodOrderingBE.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import ptit.b19dccn307.SpringFoodOrderingBE.rest.request.RestaurantRequest;
import ptit.b19dccn307.SpringFoodOrderingBE.rest.response.RestaurantResponse;
import ptit.b19dccn307.SpringFoodOrderingBE.service.RestaurantService;

import java.util.List;

@RestController
//@CrossOrigin("*")
//@RequestMapping("/vnFood")
public class RestaurantController {
    @Autowired
    private RestaurantService restaurantService;

    @PostMapping("/restaurants")
    public List<RestaurantResponse> creates(@RequestBody List<RestaurantRequest> restaurantRequests) {
        return restaurantService.creates(restaurantRequests);
    }

    @GetMapping("/restaurants")
    public List<RestaurantResponse> getAll() {
        return restaurantService.getAll();
    }

    @GetMapping("/restaurants/by-restaurantType")
    public List<RestaurantResponse> getRestaurantByRestaurantType(@RequestParam String restaurantType ) {
        return restaurantService.getByRestaurantType(restaurantType);
    }
}