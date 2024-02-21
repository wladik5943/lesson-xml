package org.example;
import com.fasterxml.jackson.annotation.JsonSetter;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.xml.bind.annotation.*;
import java.util.Collection;
import java.util.LinkedList;

@Setter
@AllArgsConstructor
@NoArgsConstructor
@XmlRootElement(name = "order")
@XmlAccessorType(XmlAccessType.FIELD)
public class Order {
    @Getter
    @XmlAttribute(name = "date")
    @JsonSetter("date")
    private String date;

    @Getter
    @XmlElement(name = "shop")
    @JsonSetter("shop")
    private String shop;

    @Getter
    @XmlElement(name = "products")
    @JsonSetter("products")
    private Collection<Product> products;



    @Override
    public String toString() {
        return "Order{" +
                "date='" + date + '\'' +
                ", shop='" + shop + '\'' +
                ", products=" + products +
                '}';
    }


}
