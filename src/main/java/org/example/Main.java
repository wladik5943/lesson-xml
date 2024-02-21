package org.example;

import com.fasterxml.jackson.databind.ObjectMapper;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import java.io.File;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {


        try {
            ObjectMapper objectMapper = new ObjectMapper();
            Orders orders = objectMapper.readValue(new File("D:\\progects\\lesson-xml\\src\\main\\resources\\order.json"),Orders.class);
            System.out.println(orders);


            JAXBContext jaxbContext = JAXBContext.newInstance(Order.class);
            Marshaller marshaller = jaxbContext.createMarshaller();
            Product product = new Product();
            product.setName("eat");
            product.setPrice(231);
            marshaller.setProperty( Marshaller.JAXB_FORMATTED_OUTPUT, true );

            marshaller.marshal(product,new File("product.xml"));





        }
        catch (JAXBException|IOException e){
            throw new RuntimeException(e);
        }
    }
}