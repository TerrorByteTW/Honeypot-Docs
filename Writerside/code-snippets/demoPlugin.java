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
    public static void onHoneypotPreTrigger(HoneypotPreTriggerEvent event) {
            event.getPlayer().sendMessage("You threw the event!");
    }
}