package org.example;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Orders {
    private Order order;

    @Override
    public String toString() {
        return "Orders{" +
                "order=" + order +
                '}';
    }
}
