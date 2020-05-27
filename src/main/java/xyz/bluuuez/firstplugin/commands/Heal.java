package xyz.bluuuez.firstplugin.commands;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class Heal implements CommandExecutor {

    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args){

        if (!(sender instanceof Player)) {
            System.out.println("Only players can use this command");
        } else {
            Player player = (Player) sender;
            player.sendMessage("Heres some health!");
            player.setHealth(20);
        }

        return true;
    }

}
