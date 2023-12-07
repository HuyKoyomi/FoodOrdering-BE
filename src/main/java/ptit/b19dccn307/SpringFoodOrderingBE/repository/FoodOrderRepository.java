package ptit.b19dccn307.SpringFoodOrderingBE.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ptit.b19dccn307.SpringFoodOrderingBE.model.FoodOrder;

import java.util.List;

@Repository
public interface FoodOrderRepository extends JpaRepository<FoodOrder, Long> {
    List<FoodOrder> findByOrder_OrderId(Long orderId);

}