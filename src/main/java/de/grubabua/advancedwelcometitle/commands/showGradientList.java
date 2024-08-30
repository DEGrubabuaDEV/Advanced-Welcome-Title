package de.grubabua.advancedwelcometitle.commands;

import de.grubabua.advancedwelcometitle.gradientlist.gradients;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;

public class showGradientList implements CommandExecutor {
    @Override
    public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
        if (sender.hasPermission("WelcomeOperator")){

            sender.sendMessage(gradients.createGradientTitle1("This is color gradient 1"));
            sender.sendMessage(gradients.createGradientTitle2("This is color gradient 2"));
            sender.sendMessage(gradients.createGradientTitle3("This is color gradient 3"));
            sender.sendMessage(gradients.createGradientTitle4("This is color gradient 4"));
            sender.sendMessage(gradients.createGradientTitle5("This is color gradient 5"));
            sender.sendMessage(gradients.createGradientTitle6("This is color gradient 6"));
            sender.sendMessage(gradients.createGradientTitle7("This is color gradient 7"));

            return true;
        }
        else if (!sender.hasPermission("WelcomeOperator")) {
            sender.sendMessage("§cYou can't do that! Usage: Missing Operator Permission");
            return true;
        }
        return false;
    }
}
