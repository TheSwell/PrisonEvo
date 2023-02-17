package pw.redline.prisonevo;

import org.bukkit.Bukkit;
import org.bukkit.event.Listener;
import org.bukkit.plugin.java.JavaPlugin;
import pw.redline.prisonevo.dto.UserManager;
import pw.redline.prisonevo.listeners.JoinListener;

public class PrisonEvo extends JavaPlugin {
    private UserManager userManager;


    @Override
    public void onEnable() {
        userManager = new UserManager();

        regListener(new JoinListener(this));
    }

    public UserManager getUserManager() {
        return userManager;
    }


    void regListener(Listener l) {
        Bukkit.getPluginManager().registerEvents(l, this);
    }

}
