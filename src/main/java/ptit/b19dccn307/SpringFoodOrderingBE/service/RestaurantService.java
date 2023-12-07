package ptit.b19dccn307.SpringFoodOrderingBE.service;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ptit.b19dccn307.SpringFoodOrderingBE.model.Restaurant;
import ptit.b19dccn307.SpringFoodOrderingBE.repository.RestaurantRepository;
import ptit.b19dccn307.SpringFoodOrderingBE.rest.request.RestaurantRequest;
import ptit.b19dccn307.SpringFoodOrderingBE.rest.response.RestaurantResponse;

import java.util.ArrayList;
import java.util.List;

@Service
public class RestaurantService {
    @Autowired
    private RestaurantRepository restaurantRepository;

    public List<RestaurantResponse> creates(List<RestaurantRequest> restaurantRequest) {
        List<Restaurant> restaurantList = new ArrayList<>();
        for (RestaurantRequest i : restaurantRequest) {
            Restaurant tmp = new Restaurant();
            BeanUtils.copyProperties(i, tmp);
            restaurantList.add(tmp);
        }
        List<Restaurant> restaurants = restaurantRepository.saveAll(restaurantList);
        List<RestaurantResponse> result = new ArrayList<>();
        for (Restaurant i : restaurants) {
            RestaurantResponse tmp = new RestaurantResponse();
            BeanUtils.copyProperties(i, tmp);
            result.add(tmp);
        }
        return result;
    }

    public List<RestaurantResponse> getAll() {
        List<Restaurant> restaurants = restaurantRepository.findAll();
        List<RestaurantResponse> result = new ArrayList<>();
        for (Restaurant i : restaurants) {
            RestaurantResponse tmp = new RestaurantResponse();
            BeanUtils.copyProperties(i, tmp);
            result.add(tmp);
        }
        return result;
    }

    public List<RestaurantResponse> getByRestaurantType(String restaurantType) {
        List<Restaurant> restaurantList = restaurantRepository.findByRestaurantType(restaurantType);
        List<RestaurantResponse> restaurantResponseList = new ArrayList<>();
        for (Restaurant restaurant : restaurantList) {
            RestaurantResponse restaurantResponse = new RestaurantResponse();
            BeanUtils.copyProperties(restaurant, restaurantResponse);
            restaurantResponseList.add(restaurantResponse);
        }
        return restaurantResponseList;
    }
}