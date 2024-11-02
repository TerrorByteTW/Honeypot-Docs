package me.terrorbyte.test;

import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.plugin.java.JavaPlugin;

import [[[org.reprogle.honeypot.api.events.HoneypotPrePlayerBreakEvent|https://javadoc.jitpack.io/com/github/TerrorByteTW/Honeypot/honeypot-api/3.4.0/javadoc/org/reprogle/honeypot/api/events/HoneypotPrePlayerBreakEvent.html]]];

public class Test extends JavaPlugin implements Listener {

    public Test plugin;

    @Override
    public void onEnable(){
        plugin = this;
        this.getLogger().info("Enabling!");
        this.getServer().getPluginManager().registerEvents(this, this);
    }

    @Override
    public void onDisable(){
        this.getLogger().info("Disabling!");
    }

    @EventHandler
    public static void onHoneypotPrePlayerBreakEvent([[[HoneypotPrePlayerBreakEvent|https://javadoc.jitpack.io/com/github/TerrorByteTW/Honeypot/honeypot-api/3.4.0/javadoc/org/reprogle/honeypot/api/events/HoneypotPrePlayerBreakEvent.html]]] event) {
            event.getPlayer().sendMessage("You threw the event!");
}
}