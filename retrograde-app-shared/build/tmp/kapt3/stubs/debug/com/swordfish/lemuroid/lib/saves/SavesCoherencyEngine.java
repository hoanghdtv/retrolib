package com.swordfish.lemuroid.lib.saves;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\u0018\u0000 \u00142\u00020\u0001:\u0001\u0014B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J*\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00102\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0012H\u0086@\u00a2\u0006\u0002\u0010\u0013R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n\u00a8\u0006\u0015"}, d2 = {"Lcom/swordfish/lemuroid/lib/saves/SavesCoherencyEngine;", "", "savesManager", "Lcom/swordfish/lemuroid/lib/saves/SavesManager;", "statesManager", "Lcom/swordfish/lemuroid/lib/saves/StatesManager;", "(Lcom/swordfish/lemuroid/lib/saves/SavesManager;Lcom/swordfish/lemuroid/lib/saves/StatesManager;)V", "getSavesManager", "()Lcom/swordfish/lemuroid/lib/saves/SavesManager;", "getStatesManager", "()Lcom/swordfish/lemuroid/lib/saves/StatesManager;", "shouldDiscardAutoSaveState", "", "game", "Lcom/swordfish/lemuroid/lib/library/db/entity/Game;", "coreID", "Lcom/swordfish/lemuroid/lib/library/CoreID;", "sramTimestampOverride", "", "(Lcom/swordfish/lemuroid/lib/library/db/entity/Game;Lcom/swordfish/lemuroid/lib/library/CoreID;Ljava/lang/Long;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Companion", "retrograde-app-shared_debug"})
public final class SavesCoherencyEngine {
    @org.jetbrains.annotations.NotNull()
    private final com.swordfish.lemuroid.lib.saves.SavesManager savesManager = null;
    @org.jetbrains.annotations.NotNull()
    private final com.swordfish.lemuroid.lib.saves.StatesManager statesManager = null;
    private static final long TOLERANCE = 30000L;
    @org.jetbrains.annotations.NotNull()
    public static final com.swordfish.lemuroid.lib.saves.SavesCoherencyEngine.Companion Companion = null;
    
    public SavesCoherencyEngine(@org.jetbrains.annotations.NotNull()
    com.swordfish.lemuroid.lib.saves.SavesManager savesManager, @org.jetbrains.annotations.NotNull()
    com.swordfish.lemuroid.lib.saves.StatesManager statesManager) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.swordfish.lemuroid.lib.saves.SavesManager getSavesManager() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.swordfish.lemuroid.lib.saves.StatesManager getStatesManager() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object shouldDiscardAutoSaveState(@org.jetbrains.annotations.NotNull()
    com.swordfish.lemuroid.lib.library.db.entity.Game game, @org.jetbrains.annotations.NotNull()
    com.swordfish.lemuroid.lib.library.CoreID coreID, @org.jetbrains.annotations.Nullable()
    java.lang.Long sramTimestampOverride, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super java.lang.Boolean> $completion) {
        return null;
    }
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0005"}, d2 = {"Lcom/swordfish/lemuroid/lib/saves/SavesCoherencyEngine$Companion;", "", "()V", "TOLERANCE", "", "retrograde-app-shared_debug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
    }
}