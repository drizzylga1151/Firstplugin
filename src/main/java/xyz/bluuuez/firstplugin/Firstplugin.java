package xyz.bluuuez.firstplugin;

import org.bukkit.event.Listener;
import org.bukkit.plugin.java.JavaPlugin;
import xyz.bluuuez.firstplugin.events.BedEvents;
import xyz.bluuuez.firstplugin.events.PlayerEvents;

public final class Firstplugin extends JavaPlugin implements Listener {

    @Override
    public void onEnable() {
        // Plugin startup logic
        getLogger().info("Myfirstplugin Has started");
        getServer().getPluginManager().registerEvents(new BedEvents(), this);
        getServer().getPluginManager().registerEvents(new PlayerEvents(), this);

    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
        getLogger().info("Myfirstplugin Has stopped");
    }


}
