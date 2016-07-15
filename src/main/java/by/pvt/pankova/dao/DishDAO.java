package by.pvt.pankova.dao;

import by.pvt.pankova.dao.objects.Dish;
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

public class DishDAO {

    private static final Logger LOG = LogManager.getLogger();

    private static final Connection CONN = DB.getConn();

    public static List<Dish> getAll() {
        List<Dish> dishesList = new ArrayList<>();
        try {
            LOG.info("Loading all dishes...");
            String sql = "SELECT * FROM dishes";
            LOG.debug(sql);
            Statement st = CONN.createStatement();
            ResultSet rs = st.executeQuery(sql);
            while (rs.next()) {
                Dish dish = new Dish(rs.getInt("id"), rs.getString("name"), rs.getInt("price"), rs.getString("picture"));
                LOG.debug(dish.toString());
                dishesList.add(dish);
            }
            rs.close();
            st.close();
            LOG.info("Dishes loaded!");
        } catch (SQLException e) {
            LOG.error(e);
            return null;
        }
        LOG.debug(dishesList);
        return Collections.unmodifiableList(dishesList);
    }
}