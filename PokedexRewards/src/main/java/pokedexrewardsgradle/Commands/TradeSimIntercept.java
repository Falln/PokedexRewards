package pokedexrewardsgradle.Commands;

import org.bukkit.Bukkit;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.plugin.PluginLogger;

public class TradeSimIntercept implements CommandExecutor {

    PluginLogger logger;

    public TradeSimIntercept(PluginLogger logger) {
        super();
        this.logger = logger;
    }

    @Override
    public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
        //Check if the command sent is the healpokemon command
        if (cmd.getName().equalsIgnoreCase("trader")){
            //Check if the one sending the command is a player
            if (sender instanceof Player) {
                //Check if the player has the correct permissions
                if (sender.hasPermission("pokedexrewards.trader")) {
                    //Intercept the command and use pixelmon's heal command instead
                    Bukkit.dispatchCommand(sender, "tradesim ".concat(args[0]).concat(" ").concat(args[1]));
                }
            }
            return true; 
        }
        return false;
    } 
}
