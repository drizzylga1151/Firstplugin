package xyz.bluuuez.firstplugin.commands;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class Suicide implements CommandExecutor {

    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {

        if (!(sender instanceof Player)){
            System.out.println("Only players are able to use this command");
        } else {
            Player player = (Player) sender;
            player.sendMessage("BANG!");
            player.setHealth(0);
        }


        return true;
    }

}
