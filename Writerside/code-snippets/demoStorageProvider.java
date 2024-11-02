package me.terrorbyte.test;

import org.bukkit.plugin.java.JavaPlugin;

import [[[org.reprogle.honeypot.Registry|https://javadoc.jitpack.io/com/github/TerrorByteTW/Honeypot/honeypot-api/3.4.0/javadoc/org/reprogle/honeypot/Registry.html]]];

public class Test extends JavaPlugin {

    // This is how you would register storage providers
    @Override
    public void onLoad() {
        [[[Registry|https://javadoc.jitpack.io/com/github/TerrorByteTW/Honeypot/honeypot-api/3.4.0/javadoc/org/reprogle/honeypot/Registry.html]]].[[[getStorageManagerRegistry()|https://javadoc.jitpack.io/com/github/TerrorByteTW/Honeypot/honeypot-api/3.4.0/javadoc/org/reprogle/honeypot/Registry.html#getStorageManagerRegistry()]]].[[[register|https://javadoc.jitpack.io/com/github/TerrorByteTW/Honeypot/honeypot-api/3.4.0/javadoc/org/reprogle/honeypot/HoneypotStoreRegistry.html#register(org.reprogle.honeypot.common.storageproviders.StorageProvider)]]](new DemoHoneypotStore());
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
