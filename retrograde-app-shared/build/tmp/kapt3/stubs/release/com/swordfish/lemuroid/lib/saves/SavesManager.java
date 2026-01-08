package com.swordfish.lemuroid.lib.saves;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0012\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\u0018\u0000 \u00192\u00020\u0001:\u0001\u0019B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0016\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0082@\u00a2\u0006\u0002\u0010\tJ \u0010\n\u001a\u0004\u0018\u00010\u000b2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000fH\u0086@\u00a2\u0006\u0002\u0010\u0010J\u0010\u0010\u0011\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\rH\u0002J\u0016\u0010\u0012\u001a\u00020\u00132\u0006\u0010\f\u001a\u00020\rH\u0086@\u00a2\u0006\u0002\u0010\u0014J\u001e\u0010\u0015\u001a\u00020\u00162\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u0017\u001a\u00020\u000bH\u0086@\u00a2\u0006\u0002\u0010\u0018R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u001a"}, d2 = {"Lcom/swordfish/lemuroid/lib/saves/SavesManager;", "", "directoriesManager", "Lcom/swordfish/lemuroid/lib/storage/DirectoriesManager;", "(Lcom/swordfish/lemuroid/lib/storage/DirectoriesManager;)V", "getSaveFile", "Ljava/io/File;", "fileName", "", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getSaveRAM", "", "game", "Lcom/swordfish/lemuroid/lib/library/db/entity/Game;", "systemCoreConfig", "Lcom/swordfish/lemuroid/lib/library/SystemCoreConfig;", "(Lcom/swordfish/lemuroid/lib/library/db/entity/Game;Lcom/swordfish/lemuroid/lib/library/SystemCoreConfig;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getSaveRAMFileName", "getSaveRAMInfo", "Lcom/swordfish/lemuroid/lib/saves/SaveInfo;", "(Lcom/swordfish/lemuroid/lib/library/db/entity/Game;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "setSaveRAM", "", "data", "(Lcom/swordfish/lemuroid/lib/library/db/entity/Game;[BLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Companion", "retrograde-app-shared_release"})
public final class SavesManager {
    @org.jetbrains.annotations.NotNull()
    private final com.swordfish.lemuroid.lib.storage.DirectoriesManager directoriesManager = null;
    private static final int FILE_ACCESS_RETRIES = 3;
    @org.jetbrains.annotations.NotNull()
    public static final com.swordfish.lemuroid.lib.saves.SavesManager.Companion Companion = null;
    
    public SavesManager(@org.jetbrains.annotations.NotNull()
    com.swordfish.lemuroid.lib.storage.DirectoriesManager directoriesManager) {
        super();
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object getSaveRAM(@org.jetbrains.annotations.NotNull()
    com.swordfish.lemuroid.lib.library.db.entity.Game game, @org.jetbrains.annotations.NotNull()
    com.swordfish.lemuroid.lib.library.SystemCoreConfig systemCoreConfig, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super byte[]> $completion) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object setSaveRAM(@org.jetbrains.annotations.NotNull()
    com.swordfish.lemuroid.lib.library.db.entity.Game game, @org.jetbrains.annotations.NotNull()
    byte[] data, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> $completion) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object getSaveRAMInfo(@org.jetbrains.annotations.NotNull()
    com.swordfish.lemuroid.lib.library.db.entity.Game game, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super com.swordfish.lemuroid.lib.saves.SaveInfo> $completion) {
        return null;
    }
    
    private final java.lang.Object getSaveFile(java.lang.String fileName, kotlin.coroutines.Continuation<? super java.io.File> $completion) {
        return null;
    }
    
    /**
     * This name should make it compatible with RetroArch so that users can freely sync saves across the two application.
     */
    private final java.lang.String getSaveRAMFileName(com.swordfish.lemuroid.lib.library.db.entity.Game game) {
        return null;
    }
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0005"}, d2 = {"Lcom/swordfish/lemuroid/lib/saves/SavesManager$Companion;", "", "()V", "FILE_ACCESS_RETRIES", "", "retrograde-app-shared_release"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
    }
}