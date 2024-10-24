package learn.shared.order.domain.model;

import java.time.LocalDateTime;
import lombok.Getter;
import lombok.ToString;

@Getter
@ToString
public class Order {

    private Long seq;

    private String name;

    private LocalDateTime createdAt;
}
