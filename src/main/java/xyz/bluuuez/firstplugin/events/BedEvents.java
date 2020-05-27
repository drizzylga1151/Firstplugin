package xyz.bluuuez.firstplugin.events;

import org.bukkit.ChatColor;
import org.bukkit.World;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerBedEnterEvent;
import org.bukkit.event.player.PlayerBedLeaveEvent;

public class BedEvents implements Listener {

    @EventHandler
    public void onLeaveBed(PlayerBedLeaveEvent event){
        // code that runs when the event is triggered

        Player player = event.getPlayer();
        World world = player.getWorld();
        long worldtime = world.getTime();
        System.out.println(worldtime);
        player.sendMessage(ChatColor.GOLD + "Good morining!");
    }

    @EventHandler
    public void onEnterBed(PlayerBedEnterEvent event){
        // code that runs when the event its triggered
        Player player = event.getPlayer();
        player.sendMessage(ChatColor.GOLD + "Sweet dreams!");
    }

}
