package pw.redline.prisonevo.listeners;

import com.destroystokyo.paper.profile.PlayerProfile;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.AsyncPlayerPreLoginEvent;
import pw.redline.prisonevo.PrisonEvo;
import pw.redline.prisonevo.dto.UserManager;

public class JoinListener implements Listener {
    private final PrisonEvo evo;

    public JoinListener(PrisonEvo evo) {
        this.evo = evo;
    }

    @EventHandler
    public void onPreLogin(AsyncPlayerPreLoginEvent e) {
        PlayerProfile player = e.getPlayerProfile();
        UserManager manager = evo.getUserManager();

        manager.createUserData(player.getName());
    }

}
