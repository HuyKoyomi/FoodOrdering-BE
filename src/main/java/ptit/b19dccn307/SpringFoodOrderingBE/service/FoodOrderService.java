package ptit.b19dccn307.SpringFoodOrderingBE.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ptit.b19dccn307.SpringFoodOrderingBE.model.FoodOrder;
import ptit.b19dccn307.SpringFoodOrderingBE.repository.FoodOrderRepository;

import java.util.List;

@Service
public class FoodOrderService {
    @Autowired
    private FoodOrderRepository foodOrderRepository;

    public List<FoodOrder> getByOrder(Long orderId){
        return foodOrderRepository.findByOrder_OrderId(orderId);
    }
}