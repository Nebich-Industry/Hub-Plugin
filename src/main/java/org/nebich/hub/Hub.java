package org.nebich.hub;

import org.bukkit.Bukkit;
import org.bukkit.plugin.java.JavaPlugin;
import org.nebich.hub.commands.HubCommand;

import java.util.Objects;

public final class Hub extends JavaPlugin {

    @Override
    public void onEnable() {
        Bukkit.getLogger().info("[Hub] Plugin activé.");
        Objects.requireNonNull(this.getCommand("hub")).setExecutor(new HubCommand());
    }

    @Override
    public void onDisable() {
        Bukkit.getLogger().info("[Hub] Plugin désactivé.");
    }
}
