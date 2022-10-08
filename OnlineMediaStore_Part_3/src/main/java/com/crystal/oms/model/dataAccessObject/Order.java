package com.crystal.oms.model.dataAccessObject;

import java.util.ArrayList;
import java.util.List;

public class Order {
    private String name;
    private List<Media> order = new ArrayList<>();


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Media> getOrder() {
        return order;
    }

    public void setOrder(List<Media> order) {
        this.order = order;
    }

    public void addAnOrder(Media order) {
        this.order.add(order);
    }

    public void deleteAnOrder(Media order) {
        this.order.remove(order);
    }

    @Override
    public String toString() {
        return "name='" + name + '\'' +
                ", order=" + order +
                '}';
    }
}
