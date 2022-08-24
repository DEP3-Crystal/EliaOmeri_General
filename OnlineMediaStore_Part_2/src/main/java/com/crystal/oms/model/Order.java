package com.crystal.oms.model;

import com.crystal.oms.model.DigitalVideoDisc;

import java.util.ArrayList;
import java.util.List;

public class Order {

    private List<DigitalVideoDisc> order=new ArrayList<>();

    public List<DigitalVideoDisc> getOrder() {
        return order;
    }

    public void setOrder(List<DigitalVideoDisc> order) {
        this.order = order;
    }
}
