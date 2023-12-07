package ptit.b19dccn307.SpringFoodOrderingBE.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import ptit.b19dccn307.SpringFoodOrderingBE.model.Food;
import ptit.b19dccn307.SpringFoodOrderingBE.rest.request.FoodRequest;
import ptit.b19dccn307.SpringFoodOrderingBE.rest.response.FoodResponse;
import ptit.b19dccn307.SpringFoodOrderingBE.service.FoodService;

import java.util.List;

@CrossOrigin("*")
@RestController
//@RequestMapping("/vnFood")
public class FoodController {
    @Autowired
    private FoodService foodService;

    @PostMapping("/foods")
    public List<FoodResponse> creates(@RequestBody List<FoodRequest> foodRequests) {
        return foodService.creates(foodRequests);
    }

    @PostMapping("/food")
    public Food createOne(@RequestBody FoodRequest foodRequests) {
        return foodService.createOne(foodRequests);
    }

    @GetMapping("/foods")
    public List<FoodResponse> getAll() {
        return foodService.getAll();
    }

    @GetMapping("/foods/by-restaurant")
    public List<Food> getByRestaurant(@RequestParam Long restaurantId) {
        return foodService.getByRestaurant(restaurantId);
    }

}