package me.terrorbyte.test;

import org.bukkit.Location;
import org.bukkit.World;
import org.bukkit.block.Block;
import org.jetbrains.annotations.Nullable;
import [[[org.reprogle.honeypot.common.storageproviders.HoneypotBlockObject|https://javadoc.jitpack.io/com/github/TerrorByteTW/Honeypot/honeypot-api/3.4.0/javadoc/org/reprogle/honeypot/common/storageproviders/HoneypotBlockObject.html]]];
import [[[org.reprogle.honeypot.common.storageproviders.HoneypotStore|https://javadoc.jitpack.io/com/github/TerrorByteTW/Honeypot/honeypot-api/3.4.0/javadoc/org/reprogle/honeypot/common/storageproviders/HoneypotStore.html]]];
import [[[org.reprogle.honeypot.common.storageproviders.StorageProvider|https://javadoc.jitpack.io/com/github/TerrorByteTW/Honeypot/honeypot-api/3.4.0/javadoc/org/reprogle/honeypot/common/storageproviders/StorageProvider.html]]];

import java.util.List;
import java.util.logging.Logger;

@HoneypotStore(name = "DemoHoneypotStore")
public class DemoHoneypotStore extends [[[StorageProvider|https://javadoc.jitpack.io/com/github/TerrorByteTW/Honeypot/honeypot-api/3.4.0/javadoc/org/reprogle/honeypot/common/storageproviders/StorageProvider.html]]] {
    @Override
    public void createHoneypotBlock(Block block, String s) {
        Logger.getLogger("minecraft").info("Create honeypot block was called!");
    }

    @Override
    public void removeHoneypotBlock(Block block) {
        Logger.getLogger("minecraft").info("Remove honeypot block was called!");
    }

    @Override
    public boolean isHoneypotBlock(Block block) {
        Logger.getLogger("minecraft").info("Is Honeypot block was called!");
        return false;
    }

    @Override
    public HoneypotBlockObject getHoneypotBlock(Block block) {
        Logger.getLogger("minecraft").info("Get honeypot block was called!");
        return null;
    }

    @Override
    public String getAction(Block block) {
        Logger.getLogger("minecraft").info("Get action was called!");
        return "";
    }

    @Override
    public void deleteAllHoneypotBlocks(@Nullable World world) {
        Logger.getLogger("minecraft").info("Delete all honeypot blocks was called!");
    }

    @Override
    public List<HoneypotBlockObject> getAllHoneypots(@Nullable World world)
        Logger.getLogger("minecraft").info("Get all honeypot blocks was called!");
        return List.of();
    }

    @Override
    public List<HoneypotBlockObject> getNearbyHoneypots(Location location, int i) {
        Logger.getLogger("minecraft").info("Get nearby honeypot blocks was called!");
        return List.of();
    }
}
