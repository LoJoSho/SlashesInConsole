package me.NoSlashes;

import org.bukkit.plugin.java.JavaPlugin;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.server.ServerCommandEvent;

public class LoJoSho extends JavaPlugin implements Listener {
    @Override
    public void onEnable(){
        getServer().getPluginManager().registerEvents(this, this);
    }
    @Override
    public void onDisable() {
    }
    @EventHandler
    public void onConsoleCommand(ServerCommandEvent event) {
        if (event.getCommand().startsWith("/")) {
            event.setCommand(event.getCommand().replaceFirst("/", ""));
        }
    }
}