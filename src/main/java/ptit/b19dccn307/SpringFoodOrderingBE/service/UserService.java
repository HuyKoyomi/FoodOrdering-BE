package ptit.b19dccn307.SpringFoodOrderingBE.service;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ptit.b19dccn307.SpringFoodOrderingBE.model.User;
import ptit.b19dccn307.SpringFoodOrderingBE.repository.UserRepository;
import ptit.b19dccn307.SpringFoodOrderingBE.rest.request.UserRequest;
import ptit.b19dccn307.SpringFoodOrderingBE.rest.response.UserResponse;

import java.util.List;

@Service
public class UserService {
    @Autowired
    private UserRepository userRepository;

    public UserResponse createUser(UserRequest userRequest) {
        UserResponse userResponse = new UserResponse();
        User userChecked = userRepository.findByAccount(userRequest.getAccount());
        if (userChecked != null) {
            userResponse.setStatus(false);
            userResponse.setMessage("Tài khoản đã tồn tại");
        } else {
            User user = new User();
            BeanUtils.copyProperties(userRequest, user);
            BeanUtils.copyProperties(userRepository.save(user), userResponse);
            userResponse.setStatus(true);
            userResponse.setMessage("Thêm mới thành công");
        }
        return userResponse;
    }

    public List<User> getAllUser() {
        return userRepository.findAll();
    }

    public User getUserLogin(String account, String password) {
        return userRepository.findByAccountAndPassword(account, password);
    }
}