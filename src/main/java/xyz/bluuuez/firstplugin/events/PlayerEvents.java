package xyz.bluuuez.firstplugin.events;

import org.bukkit.ChatColor;
import org.bukkit.entity.Entity;
import org.bukkit.entity.Item;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.PlayerDeathEvent;
import org.bukkit.event.player.PlayerDropItemEvent;
import org.bukkit.event.player.PlayerShearEntityEvent;

public class PlayerEvents implements Listener {

    @EventHandler
    public void onDeath(PlayerDeathEvent event) {
        Player player = event.getEntity();
        player.sendMessage(ChatColor.GOLD+"LOL u died LOOSER");
    }

    @EventHandler
    public void onShearSheep(PlayerShearEntityEvent event) {
        Player player = event.getPlayer();
        Entity sheep = event.getEntity();

        event.setCancelled(true);
        sheep.addPassenger(player);
    }

    @EventHandler void onDropItem(PlayerDropItemEvent event){

        Player player = event.getPlayer();
        event.setCancelled(true);
    }
}
