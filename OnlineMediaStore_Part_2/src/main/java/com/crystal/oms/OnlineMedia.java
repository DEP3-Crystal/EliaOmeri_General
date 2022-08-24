package com.crystal.oms;

import com.crystal.oms.dataAccessObject.DataFromProperties;
import com.crystal.oms.model.DigitalVideoDisc;
import com.crystal.oms.model.Order;

import java.util.List;

public class OnlineMedia {
    public static void main(String[] args) {
        Order order1 = new Order();

        DigitalVideoDisc disc1 =
                new DigitalVideoDisc("DiscTitle", "DiscCategory", 200.36, "DiscDirector", 60);
        DataFromProperties.setProperties(disc1);
        DigitalVideoDisc disc2 = DataFromProperties.getProperties();
        System.out.println(disc2);

        order1.setOrder(List.of(disc1,disc2));
        List<DigitalVideoDisc> order2 = order1.getOrder();
        System.out.println(order2);
    }
}
