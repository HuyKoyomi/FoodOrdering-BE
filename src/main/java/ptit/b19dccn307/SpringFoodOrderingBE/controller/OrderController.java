package ptit.b19dccn307.SpringFoodOrderingBE.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import ptit.b19dccn307.SpringFoodOrderingBE.model.Order;
import ptit.b19dccn307.SpringFoodOrderingBE.rest.request.OrderRequest;
import ptit.b19dccn307.SpringFoodOrderingBE.service.OrderService;

import java.util.List;

@RestController
@CrossOrigin("*")
//@RequestMapping("/vnFood")
public class OrderController {
    @Autowired
    private OrderService orderService;

    @PostMapping("/order")
    public Order create(@RequestBody OrderRequest orderRequest) {
        return orderService.create(orderRequest);
    }

    @GetMapping("/orders/by-user")
    public List<Order> getAll(@RequestParam Long userId) {
        return orderService.getByUser(userId);
    }

}