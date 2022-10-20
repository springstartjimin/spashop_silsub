package jpashop_silsub.jpashop_silsub.jpabook;



import jpashop_silsub.jpashop_silsub.domain.OrderStatus;

import javax.persistence.*;
import java.time.LocalDateTime;

@Entity
public class Order {
    @Id
    @GeneratedValue
    @Column(name = "order_id")
    private Long id;
    @Column(name = "member_id")
    private Long mId;

    private LocalDateTime orderDate;

    private OrderStatus status;
}
