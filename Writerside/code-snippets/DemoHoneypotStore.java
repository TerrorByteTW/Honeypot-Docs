@HoneypotStore(name = "myStoreA", type = StoreType.REGION)
public class MyStoreA implements RegionStore {
    // Implementation...
}

@HoneypotStore(name = "myStoreB", type = {
    StoreType.PLAYER,
    StoreType.PLAYER_HISTORY
})
public class MyStoreB implements PlayerStore, PlayerHistoryStore {
    // Implementation...
}