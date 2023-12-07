package ptit.b19dccn307.SpringFoodOrderingBE.service;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ptit.b19dccn307.SpringFoodOrderingBE.model.Food;
import ptit.b19dccn307.SpringFoodOrderingBE.model.Restaurant;
import ptit.b19dccn307.SpringFoodOrderingBE.repository.CartRepository;
import ptit.b19dccn307.SpringFoodOrderingBE.repository.FoodRepository;
import ptit.b19dccn307.SpringFoodOrderingBE.repository.RestaurantRepository;
import ptit.b19dccn307.SpringFoodOrderingBE.rest.request.FoodRequest;
import ptit.b19dccn307.SpringFoodOrderingBE.rest.response.FoodResponse;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class FoodService {
    @Autowired
    private FoodRepository foodRepository;
    @Autowired
    private RestaurantRepository restaurantRepository;

    public Food createOne (FoodRequest foodRequest){
        Optional<Restaurant> optionalRestaurant = restaurantRepository.findByRestaurantId(foodRequest.getRestaurantId());
        Food food = new Food();
        BeanUtils.copyProperties(foodRequest, food);
        if(optionalRestaurant.isPresent()) {
            Restaurant restaurant = optionalRestaurant.get();
            food.setRestaurant(restaurant);
        }
        foodRepository.save(food);
        return food;
    }

    public List<FoodResponse> creates(List<FoodRequest> foodRequest) {
        List<Food> foodList = new ArrayList<>();

        for (FoodRequest i : foodRequest) {
            Food tmp = new Food();
            BeanUtils.copyProperties(i, tmp);
            // Tìm Restaurant theo restaurantId
            Optional<Restaurant> optionalRestaurant = restaurantRepository.findByRestaurantId(i.getRestaurantId());
            if(optionalRestaurant.isPresent()) {
                Restaurant restaurant = optionalRestaurant.get();
                tmp.setRestaurant(restaurant);
            }
            foodList.add(tmp);
        }
        List<Food> foods = foodRepository.saveAll(foodList);
        List<FoodResponse> result = new ArrayList<>();
        for (Food i : foods) {
            FoodResponse foodResponse = new FoodResponse();
            BeanUtils.copyProperties(i, foodResponse);
            result.add(foodResponse);
        }
        return result;
    }

    public List<FoodResponse> getAll() {
        List<Food> foods = foodRepository.findAll();
        List<FoodResponse> result = new ArrayList<>();
        for (Food i : foods) {
            FoodResponse tmp = new FoodResponse();
            BeanUtils.copyProperties(i, tmp);
            result.add(tmp);
        }
        return result;
    }

    public List<Food> getByRestaurant (Long restaurantId){
        return foodRepository.findByRestaurant_RestaurantId(restaurantId);
    }
}