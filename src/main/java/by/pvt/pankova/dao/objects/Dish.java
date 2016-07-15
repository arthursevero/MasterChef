package by.pvt.pankova.dao.objects;

import java.io.Serializable;

public class Dish implements Serializable {

    private static final long serialVersionUID = 3408262699535460573L;

    private int id;
    private String name;
    private String picture;
    private int price;

    public Dish() {
    }

    public Dish(int id, String name, int price, String picture) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.picture = picture;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPicture() {
        return picture;
    }

    public void setPicture(String picture) {
        this.picture = picture;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Dish [id=" + id + ", name=" + name + ", price=" + price + ", picture=" + picture + "]";
    }
}