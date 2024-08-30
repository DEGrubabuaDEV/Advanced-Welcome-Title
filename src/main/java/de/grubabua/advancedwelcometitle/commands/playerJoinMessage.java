package de.grubabua.advancedwelcometitle.commands;

import de.grubabua.advancedwelcometitle.AdvancedWelcomeTitle;
import org.bukkit.Sound;
import org.bukkit.SoundCategory;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class playerJoinMessage implements CommandExecutor {
    private final AdvancedWelcomeTitle plugin;
    public playerJoinMessage(AdvancedWelcomeTitle plugin) {
        this.plugin = plugin;
    }

    @Override
    public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
        String input = args[0].toLowerCase();
        Player player = (Player) sender;
        if (input.equals("on")) {
            plugin.getConfig().set("welcometitle.jointext", "§e" + ((Player) sender).getPlayer().getName() + " just joined!");
            plugin.saveConfig();
            sender.sendMessage("§aJoin message turned on");
            player.playSound(player.getLocation(), Sound.ENTITY_EXPERIENCE_ORB_PICKUP, SoundCategory.MASTER, 1, 5);
            return true;
        } else if (input.equals("off")) {
            plugin.getConfig().set("welcometitle.jointext", "");
            plugin.saveConfig();
            sender.sendMessage("§cJoin message turned off");
            player.playSound(player.getLocation(), Sound.ENTITY_EXPERIENCE_ORB_PICKUP, SoundCategory.MASTER, 1, 5);
            return true;
        }
        else {
            sender.sendMessage("§cUsage: /playerJoinMessage <on/off>");
        }
        return false;
    }
}
