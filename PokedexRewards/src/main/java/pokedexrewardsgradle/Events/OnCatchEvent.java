package pokedexrewardsgradle.Events;

import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.plugin.PluginLogger;

import com.pixelmonmod.pixelmon.api.events.CaptureEvent;

//TODO This class is for detecting when a pokemon is caught and then letting the
//catcher know if they have a pokdex reward to claim
public final class OnCatchEvent implements Listener {

    PluginLogger logger;

    public OnCatchEvent(PluginLogger logger) {
        this.logger = logger;
    }
    
    @EventHandler
    public void onPokemonCaught(CaptureEvent successfulCapture) {
        logger.info("A pokemon was successfully caught!");
    }
}
