package xyz.bluuuez.firstplugin;

import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.event.Listener;
import org.bukkit.plugin.java.JavaPlugin;
import xyz.bluuuez.firstplugin.commands.Heal;
import xyz.bluuuez.firstplugin.commands.Suicide;
import xyz.bluuuez.firstplugin.events.BedEvents;
import xyz.bluuuez.firstplugin.events.PlayerEvents;

public final class Firstplugin extends JavaPlugin{

    @Override
    public void onEnable() {
        // Plugin startup logic
        getLogger().info("Myfirstplugin Has started");
        getServer().getPluginManager().registerEvents(new BedEvents(), this);
        getServer().getPluginManager().registerEvents(new PlayerEvents(), this);
        getCommand("suicide").setExecutor(new Suicide());
        getCommand("heal").setExecutor(new Heal());
    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
        getLogger().info("Myfirstplugin Has stopped");
    }



}
