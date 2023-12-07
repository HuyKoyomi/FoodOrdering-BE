package ptit.b19dccn307.SpringFoodOrderingBE.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import ptit.b19dccn307.SpringFoodOrderingBE.model.FoodOrder;
import ptit.b19dccn307.SpringFoodOrderingBE.model.Order;
import ptit.b19dccn307.SpringFoodOrderingBE.service.FoodOrderService;

import java.util.List;

@RestController
@CrossOrigin("*")
//@RequestMapping("/vnFood")
public class FoodOrderController {
    @Autowired
    private FoodOrderService foodOrderService;

    @GetMapping("/foodOrders/by-order")
    public List<FoodOrder> getAll(@RequestParam Long orderId) {
        return foodOrderService.getByOrder(orderId);
    }

}