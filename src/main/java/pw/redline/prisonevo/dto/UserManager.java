package pw.redline.prisonevo.dto;

import java.util.HashMap;

public class UserManager {
    private HashMap<String, UserData> userMap = new HashMap<>();
    public UserData getUserMap(String s) {
        return userMap.get(s);
    }
    public void setUserMap(String name, UserData pd) {
        userMap.put(name, pd);
    }

    public void createUserData(String name) {
        userMap.put(name, new UserData(0,0,0));
    }
}
