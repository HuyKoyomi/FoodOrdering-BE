package ptit.b19dccn307.SpringFoodOrderingBE.rest.request;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import ptit.b19dccn307.SpringFoodOrderingBE.model.Food;
import ptit.b19dccn307.SpringFoodOrderingBE.model.FoodOrder;
import ptit.b19dccn307.SpringFoodOrderingBE.model.Order;

import java.util.List;

@Data
@Getter
@Setter
public class OrderRequest {
    private Order order;

    private List<FoodOrder> foodOrderList;
}
