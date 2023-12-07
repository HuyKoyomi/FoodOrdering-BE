package ptit.b19dccn307.SpringFoodOrderingBE.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ptit.b19dccn307.SpringFoodOrderingBE.model.Food;

import java.util.List;
import java.util.Optional;

@Repository
public interface FoodRepository extends JpaRepository<Food, Long> {
    List<Food> findByRestaurant_RestaurantId(Long restaurantId);

    Optional<Food> findByFoodId(Long foodId);
}