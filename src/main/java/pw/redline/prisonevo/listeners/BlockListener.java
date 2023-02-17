package pw.redline.prisonevo.listeners;

import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.BlockBreakEvent;
import pw.redline.prisonevo.dto.UserData;
import pw.redline.prisonevo.dto.UserManager;

public class BlockListener implements Listener {
    private final UserManager manager;

    public BlockListener(UserManager manager) {
        this.manager = manager;
    }


    @EventHandler
    public void onBlock(BlockBreakEvent e) {
        Player player = e.getPlayer();
        UserData playerData = manager.getUserMap(player.getName());
        int blockCount = playerData.getBlockCount();
        playerData.setBlockCount(blockCount + 1);


    }
}
