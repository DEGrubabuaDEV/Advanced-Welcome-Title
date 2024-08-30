package de.grubabua.advancedwelcometitle.commands;

import de.grubabua.advancedwelcometitle.AdvancedWelcomeTitle;
import org.bukkit.ChatColor;
import org.bukkit.Sound;
import org.bukkit.SoundCategory;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.checkerframework.common.value.qual.IntRangeFromGTENegativeOne;

public class setPlayerColor implements CommandExecutor {
    private final AdvancedWelcomeTitle plugin;

    public setPlayerColor(AdvancedWelcomeTitle plugin) {
        this.plugin = plugin;
    }
    @Override
    public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
        if (sender.hasPermission("WelcomeOperator")){
            String color = args[0].toLowerCase();
            Player player = (Player) sender;
            if (color.equals("black")){
                String playercolor = "§0";
                sender.sendMessage("§aPlayer welcome color set to " + playercolor + color);
                player.playSound(player.getLocation(), Sound.ENTITY_EXPERIENCE_ORB_PICKUP, SoundCategory.MASTER, 1,5);
                plugin.getConfig().set("welcometitle.playercolor", playercolor);
                plugin.saveConfig();
                return true;
            }
            if (color.equals("darkblue")){
                String playercolor = "§1";
                sender.sendMessage("§aPlayer welcome color set to " + playercolor + color);
                player.playSound(player.getLocation(), Sound.ENTITY_EXPERIENCE_ORB_PICKUP, SoundCategory.MASTER, 1,5);
                plugin.getConfig().set("welcometitle.playercolor", playercolor);
                plugin.saveConfig();
                return true;
            }
            if (color.equals("darkgreen")) {
                String playercolor = "§2";
                sender.sendMessage("§aPlayer welcome color set to " + playercolor + color);
                player.playSound(player.getLocation(), Sound.ENTITY_EXPERIENCE_ORB_PICKUP, SoundCategory.MASTER, 1,5);
                plugin.getConfig().set("welcometitle.playercolor", playercolor);
                plugin.saveConfig();
                return true;
            }
            if (color.equals("darkaqua")) {
                String playercolor = "§3";
                sender.sendMessage("§aPlayer welcome color set to " + playercolor + color);
                player.playSound(player.getLocation(), Sound.ENTITY_EXPERIENCE_ORB_PICKUP, SoundCategory.MASTER, 1,5);
                plugin.getConfig().set("welcometitle.playercolor", playercolor);
                plugin.saveConfig();
                return true;
            }
            if (color.equals("darkred")) {
                String playercolor = "§4";
                sender.sendMessage("§aPlayer welcome color set to " + playercolor + color);
                player.playSound(player.getLocation(), Sound.ENTITY_EXPERIENCE_ORB_PICKUP, SoundCategory.MASTER, 1,5);
                plugin.getConfig().set("welcometitle.playercolor", playercolor);
                plugin.saveConfig();
                return true;
            }
            if (color.equals("darkpurple")) {
                String playercolor = "§5";
                sender.sendMessage("§aPlayer welcome color set to " + playercolor + color);
                player.playSound(player.getLocation(), Sound.ENTITY_EXPERIENCE_ORB_PICKUP, SoundCategory.MASTER, 1,5);
                plugin.getConfig().set("welcometitle.playercolor", playercolor);
                plugin.saveConfig();
                return true;
            }
            if (color.equals("gold")) {
                String playercolor = "§6";
                sender.sendMessage("§aPlayer welcome color set to " + playercolor + color);
                player.playSound(player.getLocation(), Sound.ENTITY_EXPERIENCE_ORB_PICKUP, SoundCategory.MASTER, 1,5);
                plugin.getConfig().set("welcometitle.playercolor", playercolor);
                plugin.saveConfig();
                return true;
            }
            if (color.equals("gray")) {
                String playercolor = "§7";
                sender.sendMessage("§aPlayer welcome color set to " + playercolor + color);
                player.playSound(player.getLocation(), Sound.ENTITY_EXPERIENCE_ORB_PICKUP, SoundCategory.MASTER, 1,5);
                plugin.getConfig().set("welcometitle.playercolor", playercolor);
                plugin.saveConfig();
                return true;
            }
            if (color.equals("darkgray")) {
                String playercolor = "§8";
                sender.sendMessage("§aPlayer welcome color set to " + playercolor + color);
                player.playSound(player.getLocation(), Sound.ENTITY_EXPERIENCE_ORB_PICKUP, SoundCategory.MASTER, 1,5);
                plugin.getConfig().set("welcometitle.playercolor", playercolor);
                plugin.saveConfig();
                return true;
            }
            if (color.equals("blue")) {
                String playercolor = "§9";
                sender.sendMessage("§aPlayer welcome color set to " + playercolor + color);
                player.playSound(player.getLocation(), Sound.ENTITY_EXPERIENCE_ORB_PICKUP, SoundCategory.MASTER, 1,5);
                plugin.getConfig().set("welcometitle.playercolor", playercolor);
                plugin.saveConfig();
                return true;
            }
            if (color.equals("green")) {
                String playercolor = "§a";
                sender.sendMessage("§aPlayer welcome color set to " + playercolor + color);
                player.playSound(player.getLocation(), Sound.ENTITY_EXPERIENCE_ORB_PICKUP, SoundCategory.MASTER, 1,5);
                plugin.getConfig().set("welcometitle.playercolor", playercolor);
                plugin.saveConfig();
                return true;
            }
            if (color.equals("aqua")) {
                String playercolor = "§b";
                sender.sendMessage("§aPlayer welcome color set to " + playercolor + color);
                player.playSound(player.getLocation(), Sound.ENTITY_EXPERIENCE_ORB_PICKUP, SoundCategory.MASTER, 1,5);
                plugin.getConfig().set("welcometitle.playercolor", playercolor);
                plugin.saveConfig();
                return true;
            }
            if (color.equals("red")) {
                String playercolor = "§c";
                sender.sendMessage("§aPlayer welcome color set to " + playercolor + color);
                player.playSound(player.getLocation(), Sound.ENTITY_EXPERIENCE_ORB_PICKUP, SoundCategory.MASTER, 1,5);
                plugin.getConfig().set("welcometitle.playercolor", playercolor);
                plugin.saveConfig();
                return true;
            }
            if (color.equals("lightpurple")) {
                String playercolor = "§d";
                sender.sendMessage("§aPlayer welcome color set to " + playercolor + color);
                player.playSound(player.getLocation(), Sound.ENTITY_EXPERIENCE_ORB_PICKUP, SoundCategory.MASTER, 1,5);
                plugin.getConfig().set("welcometitle.playercolor", playercolor);
                plugin.saveConfig();
                return true;
            }
            if (color.equals("yellow")) {
                String playercolor = "§e";
                sender.sendMessage("§aPlayer welcome color set to " + playercolor + color);
                player.playSound(player.getLocation(), Sound.ENTITY_EXPERIENCE_ORB_PICKUP, SoundCategory.MASTER, 1,5);
                plugin.getConfig().set("welcometitle.playercolor", playercolor);
                plugin.saveConfig();
                return true;
            }
            if (color.equals("reset")){
                String playercolor = "§r";
                sender.sendMessage("§aPlayer welcome color set to §freset");
                player.playSound(player.getLocation(), Sound.ENTITY_EXPERIENCE_ORB_PICKUP, SoundCategory.MASTER, 1,5);
                plugin.getConfig().set("welcometitle.playercolor", playercolor);
                plugin.saveConfig();
                return true;
            }
            else {
                sender.sendMessage("§cInvalid color. Available colors: §0Black §1DarkBlue §2DarkGreen §3DarkAqua §4DarkRed §5DarkPurple §6Gold §7Gray §8DarkGray §9Blue §aGreen §bAqua §cRed §dLightPurple §eYellow §fReset");
                return false;
            }

        }
        else if (!sender.hasPermission("WelcomeOperator")) {
            sender.sendMessage("§cYou can't do that. Usage: Missing Operator Permission");
        }
        return false;
    }
}
