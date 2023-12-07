package ptit.b19dccn307.SpringFoodOrderingBE.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ptit.b19dccn307.SpringFoodOrderingBE.model.Restaurant;

import java.util.List;
import java.util.Optional;

@Repository
public interface RestaurantRepository extends JpaRepository<Restaurant, Long> {
    Optional<Restaurant> findByRestaurantId(Long restaurantId);

    List<Restaurant> findByRestaurantType(String restaurantType);
}