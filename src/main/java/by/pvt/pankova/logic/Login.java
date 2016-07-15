package by.pvt.pankova.logic;

import by.pvt.pankova.dao.UserDAO;
import by.pvt.pankova.dao.objects.User;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

public class Login {

    private static final Logger LOG = LogManager.getLogger();

    public static boolean checkManager(String login, String password) {
        for (User user : UserDAO.getManagers())
            if (login.equals(user.getLogin()))
                if (hash(password).equals(user.getPassword()))
                    return true;
        return false;
    }

    public static boolean checkClient(String login, String password) {
        for (User user : UserDAO.getClients())
            if (login.equals(user.getLogin()))
                if (hash(password).equals(user.getPassword()))
                    return true;
        return false;
    }

    private static String hash(String password) {
        String hash = null;
        try {
            MessageDigest md = MessageDigest.getInstance("MD5");
            md.update(password.getBytes());
            byte[] bytes = md.digest();
            StringBuilder sb = new StringBuilder();
            for (int i = 0; i < bytes.length; i++) {
                sb.append(Integer.toString((bytes[i] & 0xff) + 0x100, 16).substring(1));
            }
            hash = sb.toString();
        } catch (NoSuchAlgorithmException e) {
            LOG.error(e);
        }
        return hash;
    }
}