package pw.redline.prisonevo.listeners;

import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.BlockBreakEvent;

public class BlockListener implements Listener {


    @EventHandler
    public void onBlock(BlockBreakEvent e) {
        Player player = e.getPlayer();

    }
}
