package cpe200;

import java.util.ArrayList;

/**
 * Created by pruet on 12/9/2559.
 */
public class Users {
    public ArrayList<User> userList = new ArrayList<User>();

    public void addUser(User user) {
        userList.add(user);
    }

    public void addUser(String userName, String password) {
        userList.add(new User(userName,password));
    }

    public void deleteUser(User user) {
        userList.remove(user);
    }

    public boolean exists(User user) {
        if(userList.contains(user)){
            return true;
        }
        return false;
    }

    public boolean usernameExists(String username) {
        for(int i=0;i<userList.size();i++){
            if(userList.get(i).getUserName().equalsIgnoreCase(username)){
                return true;
            }
        }
        return  false;
    }

    /* This method should return null when the user with username is not in the list */
    public User getUserByUsername(String userName) {
        for(int i=0;i<userList.size();i++){
            if(userList.get(i).getUserName().equalsIgnoreCase(userName)){
                return  userList.get(i);
            }
        }
        return  null;
    }

    public int count() {
        return  userList.size();
    }

    public User[] getUserArray() {
        return userList.toArray(new User[count()]);
    }
}