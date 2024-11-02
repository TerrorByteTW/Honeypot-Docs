package me.terrorbyte.test;

import org.bukkit.plugin.java.JavaPlugin;

import [[[org.reprogle.honeypot.Registry|https://javadoc.jitpack.io/com/github/TerrorByteTW/Honeypot/honeypot-api/3.4.0/javadoc/org/reprogle/honeypot/Registry.html]]];

public class Test extends JavaPlugin {

    // This is how you would register behavior providers
    @Override
    public void onLoad() {
        [[[Registry|https://javadoc.jitpack.io/com/github/TerrorByteTW/Honeypot/honeypot-api/3.4.0/javadoc/org/reprogle/honeypot/Registry.html]]].[[[getBehaviorRegistry()|https://javadoc.jitpack.io/com/github/TerrorByteTW/Honeypot/honeypot-api/3.4.0/javadoc/org/reprogle/honeypot/Registry.html#getBehaviorRegistry()]]].[[[register|https://javadoc.jitpack.io/com/github/TerrorByteTW/Honeypot/honeypot-api/3.4.0/javadoc/org/reprogle/honeypot/BehaviorRegistry.html#register(org.reprogle.honeypot.common.providers.BehaviorProvider)]]](new DemoBehavior());
    }

    @Override
    public void onEnable() {
        this.getLogger().info("Enabling!");
    }

    @Override
    public void onDisable(){
        this.getLogger().info("Disabling!");
    }
}
