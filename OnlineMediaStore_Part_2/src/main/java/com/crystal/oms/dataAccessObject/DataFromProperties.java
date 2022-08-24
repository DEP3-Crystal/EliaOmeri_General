package com.crystal.oms.dataAccessObject;

import com.crystal.oms.model.DigitalVideoDisc;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.Optional;
import java.util.Properties;

public class DataFromProperties {
    static Properties prop = new Properties();

    public static DigitalVideoDisc getProperties() {
        DigitalVideoDisc digitalVideoDisc = null;

        try {

            FileInputStream input = new FileInputStream("OnlineMediaStore_Part_2/src/main/resources/media.properties");

            prop.load(input);
            String title = Optional.ofNullable(prop.getProperty("title")).orElse("There is no data");
            String category = prop.getProperty("category");
            String director = prop.getProperty("director");
            double cost = Double.parseDouble(prop.getProperty("cost"));
            int length = Integer.parseInt(prop.getProperty("length"));

            digitalVideoDisc = new DigitalVideoDisc(title, category, cost,director,  length);

        } catch (Exception exp) {
            System.out.println(exp.getMessage());
            System.out.println(exp.getCause());
            exp.printStackTrace();
        }
        return digitalVideoDisc;
    }

    public static void setProperties(DigitalVideoDisc digitalVideoDisc) {
        try {

            FileOutputStream output = new FileOutputStream("OnlineMediaStore_Part_2/src/main/resources/media.properties");

            prop.setProperty("title", digitalVideoDisc.getTitle());
            prop.setProperty("category", digitalVideoDisc.getCategory());
            prop.setProperty("cost", digitalVideoDisc.getCost() + "");
            prop.setProperty("director", digitalVideoDisc.getDirector());
            prop.setProperty("length", digitalVideoDisc.getLength() + "");
            prop.store(output, null);
        } catch (Exception exp) {
            System.out.println(exp.getMessage());
            System.out.println(exp.getCause());
            exp.printStackTrace();
        }

    }
}