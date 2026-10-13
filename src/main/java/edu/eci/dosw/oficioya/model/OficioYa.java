package edu.eci.dosw.oficioya.model;

import java.util.HashMap;

public class OficioYa {

    private HashMap<String, UserModel> users;
    private LoggingStrategy loggingStrategy;

    public OficioYa() {
        this.users = new HashMap<>();
    }

    public HashMap<String, UserModel> getUsers() {
        return users;
    }

    public void setUsers(HashMap<String, UserModel> users) {
        this.users = users;
    }

    public LoggingStrategy getLoggingStrategy() {
        return loggingStrategy;
    }

    public void setLoggingStrategy(LoggingStrategy loggingStrategy) {
        this.loggingStrategy = loggingStrategy;
    }
}