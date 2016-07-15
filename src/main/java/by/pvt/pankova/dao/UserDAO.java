package by.pvt.pankova.dao;

import by.pvt.pankova.dao.objects.User;
import by.pvt.pankova.enums.Users;
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

public class UserDAO {

    private static final Logger LOG = LogManager.getLogger();

    private static final Connection CONN = DB.getConn();

    public static List<User> getClients() {
        return getByRole(Users.CLIENT);
    }

    public static List<User> getManagers() {
        return getByRole(Users.MANAGER);
    }

    private static List<User> getByRole(Users role) {
        List<User> usersList = new ArrayList<>();
        try {
            LOG.info("Loading all " + role + "s ...");
            String sql = String.format("SELECT * FROM users WHERE role = '%s'", role);
            LOG.debug(sql);
            Statement st = CONN.createStatement();
            ResultSet rs = st.executeQuery(sql);
            while (rs.next()) {
                User user = new User(rs.getString("login"), rs.getString("password"), rs.getString("role"));
                LOG.debug(user.toString());
                usersList.add(user);
            }
            rs.close();
            st.close();
            LOG.info(role + "s loaded!");
        } catch (SQLException e) {
            LOG.error(e);
            return null;
        }
        LOG.debug(usersList);
        return Collections.unmodifiableList(usersList);
    }
}