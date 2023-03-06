package pokedexrewardsgradle.Commands;

import org.bukkit.Bukkit;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.plugin.PluginLogger;

public class EndBattleIntercept implements CommandExecutor {

    PluginLogger logger;

    public EndBattleIntercept(PluginLogger logger) {
        super();
        this.logger = logger;
    }

    @Override
    public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
        //Check if the command sent is the healpokemon command
        if (cmd.getName().equalsIgnoreCase("flee")){
            //Check if the one sending the command is a player
            if (sender instanceof Player) {
                //TODO maybe: Check if the person has the permission to send the command

                //Intercept the command and use pixelmon's heal command instead
                Bukkit.dispatchCommand(sender, "endbattle");
            }
            return true;
        }
        return false;
    } 
}
