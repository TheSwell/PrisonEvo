package pw.redline.prisonevo;

import org.bukkit.Bukkit;
import org.bukkit.event.Listener;
import org.bukkit.plugin.java.JavaPlugin;
import pw.redline.prisonevo.dto.UserManager;
import pw.redline.prisonevo.listeners.BlockListener;
import pw.redline.prisonevo.listeners.ConnectionListener;

public class PrisonEvo extends JavaPlugin {
    private UserManager userManager;


    @Override
    public void onEnable() {
        userManager = new UserManager();

        regListener(new ConnectionListener(this));
        regListener(new BlockListener(getUserManager()));
    }

    public UserManager getUserManager() {
        return userManager;
    }


    void regListener(Listener l) {
        Bukkit.getPluginManager().registerEvents(l, this);
    }

}
