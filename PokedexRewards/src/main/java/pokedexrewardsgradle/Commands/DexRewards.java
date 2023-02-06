package pokedexrewardsgradle.Commands;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.plugin.PluginLogger;

// "/dexReward claim"
//This command allows someone to type dexReward claim to claim a pokedex reward if they have one available
public class DexRewards implements CommandExecutor {

    PluginLogger logger;

    public DexRewards(PluginLogger logger) {
        super();
        this.logger = logger;
    }

    @Override
    public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
        //Check if the command sent is for pokedexrewards
        if (cmd.getName().equalsIgnoreCase("dexreward")){
            //Check Arguments sent with the command
            //"claim" command. Allows the user to check if they have claimed a dexreward and give items if they have
            if (args[0].equals("claim")) {
                //Check if it's a player sending the message
                if (!(sender instanceof Player)) {
                    sender.sendMessage("This command can only be run by a player.");
                } else {
                    //Player player = (Player) sender;
                    logger.info("Well i mean it works up to where I think it would - Falln");
                    sender.sendMessage("Thanks for running dexReward");
                    //Check if they have a rewards and give it to them
                }
            }
            return true;
        }
        return false;
    }
    
}
