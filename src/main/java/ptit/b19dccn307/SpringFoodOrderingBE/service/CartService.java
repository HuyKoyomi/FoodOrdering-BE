package ptit.b19dccn307.SpringFoodOrderingBE.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ptit.b19dccn307.SpringFoodOrderingBE.repository.CartRepository;

@Service
public class CartService {
    @Autowired
    private CartRepository cartRepository;
}