package com.crystal.oms;

import com.crystal.oms.dataAccessObject.DataFromProperties;
import com.crystal.oms.model.dataAccessObject.Author;
import com.crystal.oms.model.dataAccessObject.Book;
import com.crystal.oms.model.dataAccessObject.DigitalVideoDisc;
import com.crystal.oms.model.dataAccessObject.Order;

import java.util.ArrayList;
import java.util.List;

public class OnlineMedia {
    public static void main(String[] args) {
        ArrayList<Author> authors = new ArrayList<>();
        authors.add(new Author("Nicholas sparks"));
        List<Order> orders = new ArrayList<>();


        Order order1 = new Order();
        Order order2 = new Order();
        Book book1 = new Book("Dear John", "Romance", 800.5, authors);


        DigitalVideoDisc disc1 =
                new DigitalVideoDisc("DiscTitle1", "DiscCategory1", 200.36, "DiscDirector1", 70);
        DigitalVideoDisc disc2 =
                new DigitalVideoDisc("DiscTitle2", "DiscCategory2", 100.05, "DiscDirector2", 60);
        DataFromProperties.setProperties(disc1);
        DataFromProperties.setProperties(disc2);
        DigitalVideoDisc disc3 = DataFromProperties.getProperties();

        order1.addAnOrder(disc1);
        order2.addAnOrder(disc2);
        order2.addAnOrder(disc3);
        order2.addAnOrder(book1);
        order1.setName("Elia");
        order2.setName("Ana");
        orders.addAll(List.of(order1, order2));

        System.out.println(orders);
        System.out.println();

        order2.deleteAnOrder(disc2);
        System.out.println(orders);
        System.out.println();
        orders.remove(order1);

        System.out.println(orders);
    }
}
