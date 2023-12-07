package ptit.b19dccn307.SpringFoodOrderingBE.service;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ptit.b19dccn307.SpringFoodOrderingBE.model.Food;
import ptit.b19dccn307.SpringFoodOrderingBE.model.FoodOrder;
import ptit.b19dccn307.SpringFoodOrderingBE.model.Order;
import ptit.b19dccn307.SpringFoodOrderingBE.model.User;
import ptit.b19dccn307.SpringFoodOrderingBE.repository.FoodOrderRepository;
import ptit.b19dccn307.SpringFoodOrderingBE.repository.FoodRepository;
import ptit.b19dccn307.SpringFoodOrderingBE.repository.OrderRepository;
import ptit.b19dccn307.SpringFoodOrderingBE.repository.UserRepository;
import ptit.b19dccn307.SpringFoodOrderingBE.rest.request.OrderRequest;

import java.util.List;
import java.util.Optional;

@Service
public class OrderService {
    @Autowired
    private OrderRepository orderRepository;

    @Autowired
    private UserRepository userRepository;

    @Autowired
    private FoodOrderRepository foodOrderRepository;

    @Autowired
    private FoodRepository foodRepository;

    public Order create(OrderRequest orderRequest) {
        // lấy thông tin từ request
        Order order = orderRequest.getOrder();
        List<FoodOrder> foodOrderList = orderRequest.getFoodOrderList();

        // Khởi tạo result
        Order resultOrder = new Order();
        BeanUtils.copyProperties(order, resultOrder);
        // lấy user theo userId
        Optional<User> userOptional = userRepository.findByUserId(order.getUser().getUserId());
        if (userOptional.isPresent()) {
            User user = userOptional.get();
            resultOrder.setUser(user);
        }
        orderRepository.save(resultOrder);
        // Lưu FoodOrders với liên kết đến Order và Food
        for (FoodOrder foodOrder : foodOrderList) {
            foodOrder.setOrder(resultOrder);
            foodOrderRepository.save(foodOrder);
            Optional<Food> optionalFood = foodRepository.findByFoodId(foodOrder.getFood().getFoodId());
            if (optionalFood.isPresent()) {
                Food food = optionalFood.get();
                foodOrder.setFood(food);
            }
        }
        return resultOrder;
    }

    public List<Order> getByUser(Long userId){
        return orderRepository.findByUser_UserId(userId);
    }
}