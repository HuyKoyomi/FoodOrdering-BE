package ptit.b19dccn307.SpringFoodOrderingBE.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ptit.b19dccn307.SpringFoodOrderingBE.model.FavoriteRestaurant;

@Repository
public interface FavoriteRestaurantRepository extends JpaRepository<FavoriteRestaurant, Long> {
}