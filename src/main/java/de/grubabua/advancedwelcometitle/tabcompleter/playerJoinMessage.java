package de.grubabua.advancedwelcometitle.tabcompleter;

import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.command.TabCompleter;
import org.bukkit.entity.Player;

import java.util.ArrayList;
import java.util.List;

public class playerJoinMessage implements TabCompleter {
    @Override
    public List<String> onTabComplete(CommandSender sender, Command cmd, String label, String[] args) {
        Player player = (Player) sender;
        if (args.length == 1) {
            ArrayList<String> options = new ArrayList<>();
            options.add("on");
            options.add("off");
            return options;
        }
        return null;
    }
}
