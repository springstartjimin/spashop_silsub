package jpashop_silsub.jpashop_silsub.jpabook;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class OrderItem {
    @Id @GeneratedValue
    @Column(name = "order_item_id")
    private Long id;

    @Column(name = "order_id")
    private Long oId;

    @Column(name = "item_id")
    private Long iId;

    private int orderPrice;
    private int count;
}
