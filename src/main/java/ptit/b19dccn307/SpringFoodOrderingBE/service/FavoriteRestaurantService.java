package ptit.b19dccn307.SpringFoodOrderingBE.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ptit.b19dccn307.SpringFoodOrderingBE.repository.FavoriteRestaurantRepository;

@Service
public class FavoriteRestaurantService {
    @Autowired
    private FavoriteRestaurantRepository favoriteRestaurantRepository;
}