package com.crystal.oms.model.dataAccessObject;

import lombok.Data;

@Data
public class Media {
    protected String title;
    protected String category;
    protected double cost;


    public Media(String title, String category, double cost) {
        this.title = title;
        this.category = category;
        this.cost = cost;
    }

}
