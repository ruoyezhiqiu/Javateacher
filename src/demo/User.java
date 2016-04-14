package demo;

import java.io.Serializable;
import java.util.Hashtable;

/**
 * Created by teacher
 * 8:51 2016/4/14.
 */

//model entity domain
public class User implements Serializable {
    private Integer id;
    private String username;
    private String password;
    private boolean married;

    private static int i;

    public User() {
        User.i = 0;
        Hashtable<String, String> hashtable = new Hashtable<>();
        for (String s : hashtable.keySet()) {
//            ...
        }
    }

    public User(Integer id, String username, String password) {
        this.id = id;
        this.username = username;
        this.password = password;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public boolean isMarried() {
        return married;
    }

    public void setMarried(boolean married) {
        this.married = married;
    }
}
