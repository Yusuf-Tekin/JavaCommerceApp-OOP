package app.business;

import app.entities.User;

public class UserLoggedInControl {
    
    static public boolean LoggedInControl(User user){
        return user.isIsLoggedIn();
    }

}
