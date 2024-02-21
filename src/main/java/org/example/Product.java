package org.example;

import jdk.jfr.DataAmount;
import lombok.Data;
import lombok.Setter;

import javax.xml.bind.annotation.*;


@Data
@XmlRootElement(name = "product")

public class Product {

    private double price;

    private String name;




    public Product() {
    }

    @XmlElement(name = "price")
    public double getPrice() {
        return price;
    }
    @XmlElement(name = "name")
    public String getName() {
        return name;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Product{" +
                "price=" + price +
                ", name='" + name + '\'' +
                '}';
    }
}
