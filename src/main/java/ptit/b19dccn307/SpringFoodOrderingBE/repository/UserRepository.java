package ptit.b19dccn307.SpringFoodOrderingBE.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ptit.b19dccn307.SpringFoodOrderingBE.model.User;

import java.util.Optional;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {
    Optional<User> findByUserId(Long userId);

    User findByAccount(String account);

    User findByAccountAndPassword(String account, String password);
}