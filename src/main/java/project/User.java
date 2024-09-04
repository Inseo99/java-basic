package project;

public class User {
    String ID;
    String password;
    String name;

    public User(String ID, String password, String name) {
        this.ID = ID;
        this.password = password;
        this.name = name;
    }


    public void setID(String ID) {
        this.ID = ID;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getID() {
        return ID;
    }

    public String getPassword() {
        return password;
    }

    public String getName() {
        return name;
    }
}

