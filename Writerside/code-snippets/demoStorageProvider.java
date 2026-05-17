public class Test extends JavaPlugin {

    @Override
    public void onLoad() {
        // **MUST** be registered within your `onLoad()` method.
        Registry.getStorageManagerRegistry().register(new DemoHoneypotStore());
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
