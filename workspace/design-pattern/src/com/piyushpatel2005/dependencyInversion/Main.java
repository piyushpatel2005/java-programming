package com.piyushpatel2005.dependencyInversion;

public class Main {
}


interface DBConnectionInterface {
    public int connect();
}


class MySQLConnection implements DBConnectionInterface {

    @Override
    public int connect() {
        return 0;
    }
}

class PasswordReminder {
    private DBConnectionInterface dbConnection;

    // conceptual code
    public PasswordReminder(DBConnectionInterface dbConnection) {
        this.dbConnection = dbConnection;
    }
}
