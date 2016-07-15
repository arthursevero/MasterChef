package by.pvt.pankova.logic;

import by.pvt.pankova.resources.DatabaseManager;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DB {

    private static final Logger LOG = LogManager.getLogger();

    private static Connection CONN = connect();

    private static Connection connect() {
        try {
            LOG.info("Connecting to database...");
            Class.forName(DatabaseManager.getProperty("db.driver"));
            Connection conn = DriverManager.getConnection(DatabaseManager.getProperty("db.url"), DatabaseManager.getProperty("db.user"), DatabaseManager.getProperty("db.password"));
            LOG.info("Connected!");
            return conn;
        } catch (SQLException | ClassNotFoundException e) {
            LOG.error(e);
            return null;
        }
    }

    public static Connection getConn() {
        try {
            if (CONN == null || CONN.isClosed()) {
                LOG.info("Reconnecting to database...");
                CONN = connect();
            }
            return CONN;
        } catch (SQLException e) {
            LOG.error(e);
            return null;
        }
    }
}