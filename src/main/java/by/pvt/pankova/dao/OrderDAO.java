package by.pvt.pankova.dao;

import by.pvt.pankova.dao.objects.Dish;
import by.pvt.pankova.dao.objects.Order;
import by.pvt.pankova.logic.DB;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class OrderDAO {

    private static final Logger LOG = LogManager.getLogger();

    private static final Connection CONN = DB.getConn();

    public static List<Order> getAll() {
        List<Dish> dishesList = DishDAO.getAll();
        List<Order> ordersList = new ArrayList<>();
        try {
            LOG.info("Loading all orders...");
            String sql = "SELECT * FROM orders";
            LOG.debug(sql);
            Statement st1 = CONN.createStatement();
            ResultSet rs1 = st1.executeQuery(sql);
            while (rs1.next()) {
                int orderId = rs1.getInt("id");
                sql = String.format("SELECT orders_has_dishes.dish_id FROM orders, orders_has_dishes WHERE orders.id = orders_has_dishes.order_id AND orders.id = %d", orderId);
                LOG.debug(sql);
                Statement st2 = CONN.createStatement();
                ResultSet rs2 = st2.executeQuery(sql);
                Order order = new Order();
                order.setId(orderId);
                List<Dish> dishes = new ArrayList<>();
                while (rs2.next()) {
                    for (Dish dish : dishesList) {
                        if (dish.getId() == rs2.getInt("dish_id")) {
                            dishes.add(dish);
                            break;
                        }
                    }
                }
                order.setTable(rs1.getInt("table"));
                order.setDishes(dishes);
                LOG.debug(order.toString());
                ordersList.add(order);
                rs2.close();
                st2.close();
            }
            rs1.close();
            st1.close();
            LOG.info("Orders loaded!");
        } catch (SQLException e) {
            LOG.error(e);
            return null;
        }
        LOG.debug(ordersList);
        return Collections.unmodifiableList(ordersList);
    }

    public static int create(List<Dish> dishes, int table) {
        LOG.info("Creating order...");
        int orderId = 1;
        int affected = 0;
        try {
            String sql = "SELECT MAX(id) AS max_id FROM orders";
            LOG.debug(sql);
            Statement st = CONN.createStatement();
            ResultSet rs = st.executeQuery(sql);
            while (rs.next()) {
                orderId += rs.getInt("max_id");
            }
            st.close();

            sql = String.format("INSERT INTO orders VALUES (%d, %d)", orderId, table);
            LOG.debug(sql);
            st = CONN.createStatement();
            affected += st.executeUpdate(sql);
            st.close();

            for (Dish dish : dishes) {
                sql = String.format("INSERT INTO orders_has_dishes VALUES (%d, %d)", orderId, dish.getId());
                LOG.debug(sql);
                st = CONN.createStatement();
                affected += st.executeUpdate(sql);
                st.close();
            }
        } catch (SQLException e) {
            LOG.error(e);
        }
        LOG.info("Order created id = " + orderId + "! Rows affected: " + affected);
        return orderId;
    }

    public static void delete(int id) {
        LOG.info("Deleting order id = " + id + "...");
        int affected = 0;
        try {
            String sql = String.format("DELETE FROM orders_has_dishes WHERE order_id = %d", id);
            LOG.debug(sql);
            Statement st = CONN.createStatement();
            affected += st.executeUpdate(sql);
            st.close();

            sql = String.format("DELETE FROM orders WHERE id = %d", id);
            LOG.debug(sql);
            st = CONN.createStatement();
            affected += st.executeUpdate(sql);
            st.close();
        } catch (SQLException e) {
            LOG.error(e);
        }
        LOG.info("Order deleted! Rows affected: " + affected);
    }
}