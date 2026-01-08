package com.swordfish.lemuroid.lib.saves.migrators;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0012\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u001a\u0010\u0003\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0016\u00a8\u0006\t"}, d2 = {"Lcom/swordfish/lemuroid/lib/saves/migrators/MelonDsSavesMigrator;", "Lcom/swordfish/lemuroid/lib/saves/migrators/SavesMigrator;", "()V", "loadPreviousSaveForGame", "", "game", "Lcom/swordfish/lemuroid/lib/library/db/entity/Game;", "directoriesManager", "Lcom/swordfish/lemuroid/lib/storage/DirectoriesManager;", "retrograde-app-shared_debug"})
public final class MelonDsSavesMigrator implements com.swordfish.lemuroid.lib.saves.migrators.SavesMigrator {
    @org.jetbrains.annotations.NotNull()
    public static final com.swordfish.lemuroid.lib.saves.migrators.MelonDsSavesMigrator INSTANCE = null;
    
    private MelonDsSavesMigrator() {
        super();
    }
    
    @java.lang.Override()
    @org.jetbrains.annotations.Nullable()
    public byte[] loadPreviousSaveForGame(@org.jetbrains.annotations.NotNull()
    com.swordfish.lemuroid.lib.library.db.entity.Game game, @org.jetbrains.annotations.NotNull()
    com.swordfish.lemuroid.lib.storage.DirectoriesManager directoriesManager) {
        return null;
    }
}