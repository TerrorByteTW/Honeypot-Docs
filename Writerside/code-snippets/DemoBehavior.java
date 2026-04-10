@Behavior(type = BehaviorType.CUSTOM, name = "chicken-storm", icon = Material.CHICKEN_SPAWN_EGG, configurable = true)
public class DemoBehavior extends BehaviorProvider {

	@Override
	public boolean process(Player p, @Nullable Block block, @Nullable YamlDocument config) {
		return true;
	}
}
