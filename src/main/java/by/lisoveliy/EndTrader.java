package by.lisoveliy;

import org.bukkit.Bukkit;
import org.bukkit.Server;
import org.bukkit.plugin.java.JavaPlugin;

import java.util.logging.Logger;

public final class EndTrader extends JavaPlugin {

    public static Logger pluginLogger;

    @Override
    public void onEnable() {
        pluginLogger = Bukkit.getLogger();
        getServer().getPluginManager().registerEvents(new TraderListener(), this);
    }
}
