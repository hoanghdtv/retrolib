package com.swordfish.lemuroid.lib.saves.migrators;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0012\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u001a\u0010\u0002\u001a\u0004\u0018\u00010\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H&\u00a8\u0006\b"}, d2 = {"Lcom/swordfish/lemuroid/lib/saves/migrators/SavesMigrator;", "", "loadPreviousSaveForGame", "", "game", "Lcom/swordfish/lemuroid/lib/library/db/entity/Game;", "directoriesManager", "Lcom/swordfish/lemuroid/lib/storage/DirectoriesManager;", "retrograde-app-shared_debug"})
public abstract interface SavesMigrator {
    
    @org.jetbrains.annotations.Nullable()
    public abstract byte[] loadPreviousSaveForGame(@org.jetbrains.annotations.NotNull()
    com.swordfish.lemuroid.lib.library.db.entity.Game game, @org.jetbrains.annotations.NotNull()
    com.swordfish.lemuroid.lib.storage.DirectoriesManager directoriesManager);
}