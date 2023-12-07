package ptit.b19dccn307.SpringFoodOrderingBE.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Component;

import java.util.Date;
import java.util.List;

@Component
@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "user")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Long userId;

    private String account;

    private String password;

    private String fullName;

    private String phoneNumber;

    private String email;

    private String address;

    private Date dob;

    @OneToMany(mappedBy = "user")
    private List<FavoriteRestaurant> favorieRestaurantList;
}
