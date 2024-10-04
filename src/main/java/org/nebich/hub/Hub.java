package org.nebich.hub;

import org.bukkit.Bukkit;
import org.bukkit.plugin.java.JavaPlugin;

import java.util.Objects;

public final class Hub extends JavaPlugin {

    @Override
    public void onEnable() {
        this.saveDefaultConfig();
        Bukkit.getLogger().info("[Hub] Plugin activé.");
        Objects.requireNonNull(this.getCommand("hub")).setExecutor(new Hub());
    }

    @Override
    public void onDisable() {
        Bukkit.getLogger().info("[Hub] Plugin désactivé.");
    }
}
