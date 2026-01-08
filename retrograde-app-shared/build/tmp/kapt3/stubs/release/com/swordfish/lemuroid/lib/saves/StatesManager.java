package com.swordfish.lemuroid.lib.saves;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000b\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0012\n\u0002\b\u0002\u0018\u0000 /2\u00020\u0001:\u0001/B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J \u0010\u0005\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nH\u0086@\u00a2\u0006\u0002\u0010\u000bJ\u0010\u0010\f\u001a\u00020\r2\u0006\u0010\u0007\u001a\u00020\bH\u0002J\u001e\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nH\u0086@\u00a2\u0006\u0002\u0010\u000bJ\u0010\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\rH\u0003J\u0018\u0010\u0013\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00020\r2\u0006\u0010\u0015\u001a\u00020\rH\u0002J \u0010\u0016\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0012\u001a\u00020\r2\u0006\u0010\u0015\u001a\u00020\rH\u0082@\u00a2\u0006\u0002\u0010\u0017J$\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u000f0\u00192\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nH\u0086@\u00a2\u0006\u0002\u0010\u000bJ(\u0010\u001a\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u001b\u001a\u00020\u001cH\u0086@\u00a2\u0006\u0002\u0010\u001dJ\u0018\u0010\u001e\u001a\u00020\r2\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\u001b\u001a\u00020\u001cH\u0002J\u0018\u0010\u001f\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\r2\u0006\u0010\u0015\u001a\u00020\rH\u0002J\u0018\u0010 \u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\r2\u0006\u0010\u0015\u001a\u00020\rH\u0003J&\u0010!\u001a\u00020\"2\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010#\u001a\u00020\u0006H\u0086@\u00a2\u0006\u0002\u0010$J&\u0010%\u001a\u00020\"2\u0006\u0010\u0012\u001a\u00020\r2\u0006\u0010\u0015\u001a\u00020\r2\u0006\u0010#\u001a\u00020\u0006H\u0082@\u00a2\u0006\u0002\u0010&J.\u0010\'\u001a\u00020\"2\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010#\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u001b\u001a\u00020\u001cH\u0086@\u00a2\u0006\u0002\u0010(J \u0010)\u001a\u00020\"2\u0006\u0010\u0012\u001a\u00020\r2\u0006\u0010\u0015\u001a\u00020\r2\u0006\u0010*\u001a\u00020+H\u0002J \u0010,\u001a\u00020\"2\u0006\u0010\u0012\u001a\u00020\r2\u0006\u0010\u0015\u001a\u00020\r2\u0006\u0010-\u001a\u00020.H\u0002R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u00060"}, d2 = {"Lcom/swordfish/lemuroid/lib/saves/StatesManager;", "", "directoriesManager", "Lcom/swordfish/lemuroid/lib/storage/DirectoriesManager;", "(Lcom/swordfish/lemuroid/lib/storage/DirectoriesManager;)V", "getAutoSave", "Lcom/swordfish/lemuroid/lib/saves/SaveState;", "game", "Lcom/swordfish/lemuroid/lib/library/db/entity/Game;", "coreID", "Lcom/swordfish/lemuroid/lib/library/CoreID;", "(Lcom/swordfish/lemuroid/lib/library/db/entity/Game;Lcom/swordfish/lemuroid/lib/library/CoreID;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getAutoSaveFileName", "", "getAutoSaveInfo", "Lcom/swordfish/lemuroid/lib/saves/SaveInfo;", "getDeprecatedStateFile", "Ljava/io/File;", "fileName", "getMetadataStateFile", "stateFileName", "coreName", "getSaveState", "(Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getSavedSlotsInfo", "", "getSlotSave", "index", "", "(Lcom/swordfish/lemuroid/lib/library/db/entity/Game;Lcom/swordfish/lemuroid/lib/library/CoreID;ILkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getSlotSaveFileName", "getStateFile", "getStateFileOrDeprecated", "setAutoSave", "", "saveState", "(Lcom/swordfish/lemuroid/lib/library/db/entity/Game;Lcom/swordfish/lemuroid/lib/library/CoreID;Lcom/swordfish/lemuroid/lib/saves/SaveState;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "setSaveState", "(Ljava/lang/String;Ljava/lang/String;Lcom/swordfish/lemuroid/lib/saves/SaveState;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "setSlotSave", "(Lcom/swordfish/lemuroid/lib/library/db/entity/Game;Lcom/swordfish/lemuroid/lib/saves/SaveState;Lcom/swordfish/lemuroid/lib/library/CoreID;ILkotlin/coroutines/Continuation;)Ljava/lang/Object;", "writeMetadataToDisk", "metadata", "Lcom/swordfish/lemuroid/lib/saves/SaveState$Metadata;", "writeStateToDisk", "stateArray", "", "Companion", "retrograde-app-shared_release"})
public final class StatesManager {
    @org.jetbrains.annotations.NotNull()
    private final com.swordfish.lemuroid.lib.storage.DirectoriesManager directoriesManager = null;
    public static final int MAX_STATES = 4;
    private static final int FILE_ACCESS_RETRIES = 3;
    @org.jetbrains.annotations.NotNull()
    public static final com.swordfish.lemuroid.lib.saves.StatesManager.Companion Companion = null;
    
    public StatesManager(@org.jetbrains.annotations.NotNull()
    com.swordfish.lemuroid.lib.storage.DirectoriesManager directoriesManager) {
        super();
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object getSlotSave(@org.jetbrains.annotations.NotNull()
    com.swordfish.lemuroid.lib.library.db.entity.Game game, @org.jetbrains.annotations.NotNull()
    com.swordfish.lemuroid.lib.library.CoreID coreID, int index, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super com.swordfish.lemuroid.lib.saves.SaveState> $completion) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object setSlotSave(@org.jetbrains.annotations.NotNull()
    com.swordfish.lemuroid.lib.library.db.entity.Game game, @org.jetbrains.annotations.NotNull()
    com.swordfish.lemuroid.lib.saves.SaveState saveState, @org.jetbrains.annotations.NotNull()
    com.swordfish.lemuroid.lib.library.CoreID coreID, int index, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> $completion) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object getAutoSaveInfo(@org.jetbrains.annotations.NotNull()
    com.swordfish.lemuroid.lib.library.db.entity.Game game, @org.jetbrains.annotations.NotNull()
    com.swordfish.lemuroid.lib.library.CoreID coreID, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super com.swordfish.lemuroid.lib.saves.SaveInfo> $completion) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object getAutoSave(@org.jetbrains.annotations.NotNull()
    com.swordfish.lemuroid.lib.library.db.entity.Game game, @org.jetbrains.annotations.NotNull()
    com.swordfish.lemuroid.lib.library.CoreID coreID, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super com.swordfish.lemuroid.lib.saves.SaveState> $completion) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object setAutoSave(@org.jetbrains.annotations.NotNull()
    com.swordfish.lemuroid.lib.library.db.entity.Game game, @org.jetbrains.annotations.NotNull()
    com.swordfish.lemuroid.lib.library.CoreID coreID, @org.jetbrains.annotations.NotNull()
    com.swordfish.lemuroid.lib.saves.SaveState saveState, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> $completion) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object getSavedSlotsInfo(@org.jetbrains.annotations.NotNull()
    com.swordfish.lemuroid.lib.library.db.entity.Game game, @org.jetbrains.annotations.NotNull()
    com.swordfish.lemuroid.lib.library.CoreID coreID, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super java.util.List<com.swordfish.lemuroid.lib.saves.SaveInfo>> $completion) {
        return null;
    }
    
    private final java.lang.Object getSaveState(java.lang.String fileName, java.lang.String coreName, kotlin.coroutines.Continuation<? super com.swordfish.lemuroid.lib.saves.SaveState> $completion) {
        return null;
    }
    
    private final java.lang.Object setSaveState(java.lang.String fileName, java.lang.String coreName, com.swordfish.lemuroid.lib.saves.SaveState saveState, kotlin.coroutines.Continuation<? super kotlin.Unit> $completion) {
        return null;
    }
    
    private final void writeMetadataToDisk(java.lang.String fileName, java.lang.String coreName, com.swordfish.lemuroid.lib.saves.SaveState.Metadata metadata) {
    }
    
    private final void writeStateToDisk(java.lang.String fileName, java.lang.String coreName, byte[] stateArray) {
    }
    
    @java.lang.Deprecated()
    private final java.io.File getStateFileOrDeprecated(java.lang.String fileName, java.lang.String coreName) {
        return null;
    }
    
    private final java.io.File getStateFile(java.lang.String fileName, java.lang.String coreName) {
        return null;
    }
    
    private final java.io.File getMetadataStateFile(java.lang.String stateFileName, java.lang.String coreName) {
        return null;
    }
    
    @java.lang.Deprecated()
    private final java.io.File getDeprecatedStateFile(java.lang.String fileName) {
        return null;
    }
    
    private final java.lang.String getAutoSaveFileName(com.swordfish.lemuroid.lib.library.db.entity.Game game) {
        return null;
    }
    
    private final java.lang.String getSlotSaveFileName(com.swordfish.lemuroid.lib.library.db.entity.Game game, int index) {
        return null;
    }
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0006"}, d2 = {"Lcom/swordfish/lemuroid/lib/saves/StatesManager$Companion;", "", "()V", "FILE_ACCESS_RETRIES", "", "MAX_STATES", "retrograde-app-shared_release"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
    }
}