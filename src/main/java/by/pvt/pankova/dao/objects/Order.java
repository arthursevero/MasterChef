package by.pvt.pankova.dao.objects;

import java.io.Serializable;
import java.util.List;

public class Order implements Serializable {

    private static final long serialVersionUID = 3396489771154439905L;

    private List<Dish> dishes;
    private int id;
    private int table;

    public Order() {
    }

    public Order(int id, int table, List<Dish> dishes) {
        this.id = id;
        this.table = table;
        this.dishes = dishes;
    }

    public List<Dish> getDishes() {
        return dishes;
    }

    public void setDishes(List<Dish> dishes) {
        this.dishes = dishes;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getTotalPrice() {
        int sum = 0;
        if (dishes != null)
            for (Dish dish : dishes)
                sum += dish.getPrice();
        return sum;
    }

    public int getTable() {
        return table;
    }

    public void setTable(int table) {
        this.table = table;
    }

    @Override
    public String toString() {
        return "Order [id=" + id + ", table=" + table + ", dishes=" + dishes + "]";
    }
}