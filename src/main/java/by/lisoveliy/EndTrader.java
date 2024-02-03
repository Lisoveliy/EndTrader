package by.lisoveliy;

import org.bukkit.plugin.java.JavaPlugin;

@SuppressWarnings("unused")
public final class EndTrader extends JavaPlugin {

    @Override
    public void onEnable() {
        getServer().getPluginManager().registerEvents(new TraderListener(), this);
    }
}
