package hello.itemservice.domain;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
public class Item {

    @Id @GeneratedValue(strategy = GenerationType.IDENTITY) // AutoIncrese처럼 DB에서 자동으로 값을 넣어주는 옵션이다.
    private Long id;

    @Column(name = "item_name", length = 10)
    // itemName이랑 DB에 item_name이랑 매칭된다.
    private String itemName;
    private Integer price;
    private Integer quantity;

    public Item() {
    }
    //JPA는 기본생성자가 필수다 public or protected

    public Item(String itemName, Integer price, Integer quantity) {
        this.itemName = itemName;
        this.price = price;
        this.quantity = quantity;
    }
}
