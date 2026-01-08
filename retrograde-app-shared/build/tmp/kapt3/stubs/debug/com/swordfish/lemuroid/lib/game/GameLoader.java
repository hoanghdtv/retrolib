package com.swordfish.lemuroid.lib.game;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000t\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001:\u0002\'(BM\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\u0006\u0010\f\u001a\u00020\r\u0012\u0006\u0010\u000e\u001a\u00020\u000f\u0012\u0006\u0010\u0010\u001a\u00020\u0011\u0012\u0006\u0010\u0012\u001a\u00020\u0013\u00a2\u0006\u0002\u0010\u0014J\u001a\u0010\u0015\u001a\u0004\u0018\u00010\u00162\u0006\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u001aH\u0002J\u0010\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u001eH\u0002J4\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020!0 2\u0006\u0010\"\u001a\u00020\u00182\u0006\u0010#\u001a\u00020$2\u0006\u0010%\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u001e2\u0006\u0010&\u001a\u00020\u001cR\u000e\u0010\u0010\u001a\u00020\u0011X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u0013X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u000fX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006)"}, d2 = {"Lcom/swordfish/lemuroid/lib/game/GameLoader;", "", "lemuroidLibrary", "Lcom/swordfish/lemuroid/lib/library/LemuroidLibrary;", "statesManager", "Lcom/swordfish/lemuroid/lib/saves/StatesManager;", "savesManager", "Lcom/swordfish/lemuroid/lib/saves/SavesManager;", "coreVariablesManager", "Lcom/swordfish/lemuroid/lib/core/CoreVariablesManager;", "retrogradeDatabase", "Lcom/swordfish/lemuroid/lib/library/db/RetrogradeDatabase;", "savesCoherencyEngine", "Lcom/swordfish/lemuroid/lib/saves/SavesCoherencyEngine;", "directoriesManager", "Lcom/swordfish/lemuroid/lib/storage/DirectoriesManager;", "biosManager", "Lcom/swordfish/lemuroid/lib/bios/BiosManager;", "desmumeMigrationHandler", "Lcom/swordfish/lemuroid/lib/migration/DesmumeMigrationHandler;", "(Lcom/swordfish/lemuroid/lib/library/LemuroidLibrary;Lcom/swordfish/lemuroid/lib/saves/StatesManager;Lcom/swordfish/lemuroid/lib/saves/SavesManager;Lcom/swordfish/lemuroid/lib/core/CoreVariablesManager;Lcom/swordfish/lemuroid/lib/library/db/RetrogradeDatabase;Lcom/swordfish/lemuroid/lib/saves/SavesCoherencyEngine;Lcom/swordfish/lemuroid/lib/storage/DirectoriesManager;Lcom/swordfish/lemuroid/lib/bios/BiosManager;Lcom/swordfish/lemuroid/lib/migration/DesmumeMigrationHandler;)V", "findLibrary", "Ljava/io/File;", "context", "Landroid/content/Context;", "coreID", "Lcom/swordfish/lemuroid/lib/library/CoreID;", "isArchitectureSupported", "", "systemCoreConfig", "Lcom/swordfish/lemuroid/lib/library/SystemCoreConfig;", "load", "Lkotlinx/coroutines/flow/Flow;", "Lcom/swordfish/lemuroid/lib/game/GameLoader$LoadingState;", "appContext", "game", "Lcom/swordfish/lemuroid/lib/library/db/entity/Game;", "loadSave", "directLoad", "GameData", "LoadingState", "retrograde-app-shared_debug"})
public final class GameLoader {
    @org.jetbrains.annotations.NotNull()
    private final com.swordfish.lemuroid.lib.library.LemuroidLibrary lemuroidLibrary = null;
    @org.jetbrains.annotations.NotNull()
    private final com.swordfish.lemuroid.lib.saves.StatesManager statesManager = null;
    @org.jetbrains.annotations.NotNull()
    private final com.swordfish.lemuroid.lib.saves.SavesManager savesManager = null;
    @org.jetbrains.annotations.NotNull()
    private final com.swordfish.lemuroid.lib.core.CoreVariablesManager coreVariablesManager = null;
    @org.jetbrains.annotations.NotNull()
    private final com.swordfish.lemuroid.lib.library.db.RetrogradeDatabase retrogradeDatabase = null;
    @org.jetbrains.annotations.NotNull()
    private final com.swordfish.lemuroid.lib.saves.SavesCoherencyEngine savesCoherencyEngine = null;
    @org.jetbrains.annotations.NotNull()
    private final com.swordfish.lemuroid.lib.storage.DirectoriesManager directoriesManager = null;
    @org.jetbrains.annotations.NotNull()
    private final com.swordfish.lemuroid.lib.bios.BiosManager biosManager = null;
    @org.jetbrains.annotations.NotNull()
    private final com.swordfish.lemuroid.lib.migration.DesmumeMigrationHandler desmumeMigrationHandler = null;
    
    public GameLoader(@org.jetbrains.annotations.NotNull()
    com.swordfish.lemuroid.lib.library.LemuroidLibrary lemuroidLibrary, @org.jetbrains.annotations.NotNull()
    com.swordfish.lemuroid.lib.saves.StatesManager statesManager, @org.jetbrains.annotations.NotNull()
    com.swordfish.lemuroid.lib.saves.SavesManager savesManager, @org.jetbrains.annotations.NotNull()
    com.swordfish.lemuroid.lib.core.CoreVariablesManager coreVariablesManager, @org.jetbrains.annotations.NotNull()
    com.swordfish.lemuroid.lib.library.db.RetrogradeDatabase retrogradeDatabase, @org.jetbrains.annotations.NotNull()
    com.swordfish.lemuroid.lib.saves.SavesCoherencyEngine savesCoherencyEngine, @org.jetbrains.annotations.NotNull()
    com.swordfish.lemuroid.lib.storage.DirectoriesManager directoriesManager, @org.jetbrains.annotations.NotNull()
    com.swordfish.lemuroid.lib.bios.BiosManager biosManager, @org.jetbrains.annotations.NotNull()
    com.swordfish.lemuroid.lib.migration.DesmumeMigrationHandler desmumeMigrationHandler) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final kotlinx.coroutines.flow.Flow<com.swordfish.lemuroid.lib.game.GameLoader.LoadingState> load(@org.jetbrains.annotations.NotNull()
    android.content.Context appContext, @org.jetbrains.annotations.NotNull()
    com.swordfish.lemuroid.lib.library.db.entity.Game game, boolean loadSave, @org.jetbrains.annotations.NotNull()
    com.swordfish.lemuroid.lib.library.SystemCoreConfig systemCoreConfig, boolean directLoad) {
        return null;
    }
    
    private final boolean isArchitectureSupported(com.swordfish.lemuroid.lib.library.SystemCoreConfig systemCoreConfig) {
        return false;
    }
    
    private final java.io.File findLibrary(android.content.Context context, com.swordfish.lemuroid.lib.library.CoreID coreID) {
        return null;
    }
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0012\n\u0000\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u001d\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001BO\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\b\u0010\b\u001a\u0004\u0018\u00010\t\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u000b\u0012\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000e0\r\u0012\u0006\u0010\u000f\u001a\u00020\u0010\u0012\u0006\u0010\u0011\u001a\u00020\u0010\u00a2\u0006\u0002\u0010\u0012J\t\u0010#\u001a\u00020\u0003H\u00c6\u0003J\t\u0010$\u001a\u00020\u0005H\u00c6\u0003J\t\u0010%\u001a\u00020\u0007H\u00c6\u0003J\u000b\u0010&\u001a\u0004\u0018\u00010\tH\u00c6\u0003J\u000b\u0010\'\u001a\u0004\u0018\u00010\u000bH\u00c6\u0003J\u0014\u0010(\u001a\b\u0012\u0004\u0012\u00020\u000e0\rH\u00c6\u0003\u00a2\u0006\u0002\u0010\u0016J\t\u0010)\u001a\u00020\u0010H\u00c6\u0003J\t\u0010*\u001a\u00020\u0010H\u00c6\u0003Jh\u0010+\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b2\u000e\b\u0002\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000e0\r2\b\b\u0002\u0010\u000f\u001a\u00020\u00102\b\b\u0002\u0010\u0011\u001a\u00020\u0010H\u00c6\u0001\u00a2\u0006\u0002\u0010,J\u0013\u0010-\u001a\u00020.2\b\u0010/\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u00100\u001a\u000201H\u00d6\u0001J\t\u00102\u001a\u00020\u0005H\u00d6\u0001R\u0011\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0019\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000e0\r\u00a2\u0006\n\n\u0002\u0010\u0017\u001a\u0004\b\u0015\u0010\u0016R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019R\u0011\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u001bR\u0013\u0010\b\u001a\u0004\u0018\u00010\t\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001dR\u0013\u0010\n\u001a\u0004\u0018\u00010\u000b\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u001fR\u0011\u0010\u0011\u001a\u00020\u0010\u00a2\u0006\b\n\u0000\u001a\u0004\b \u0010!R\u0011\u0010\u000f\u001a\u00020\u0010\u00a2\u0006\b\n\u0000\u001a\u0004\b\"\u0010!\u00a8\u00063"}, d2 = {"Lcom/swordfish/lemuroid/lib/game/GameLoader$GameData;", "", "game", "Lcom/swordfish/lemuroid/lib/library/db/entity/Game;", "coreLibrary", "", "gameFiles", "Lcom/swordfish/lemuroid/lib/storage/RomFiles;", "quickSaveData", "Lcom/swordfish/lemuroid/lib/saves/SaveState;", "saveRAMData", "", "coreVariables", "", "Lcom/swordfish/lemuroid/lib/core/CoreVariable;", "systemDirectory", "Ljava/io/File;", "savesDirectory", "(Lcom/swordfish/lemuroid/lib/library/db/entity/Game;Ljava/lang/String;Lcom/swordfish/lemuroid/lib/storage/RomFiles;Lcom/swordfish/lemuroid/lib/saves/SaveState;[B[Lcom/swordfish/lemuroid/lib/core/CoreVariable;Ljava/io/File;Ljava/io/File;)V", "getCoreLibrary", "()Ljava/lang/String;", "getCoreVariables", "()[Lcom/swordfish/lemuroid/lib/core/CoreVariable;", "[Lcom/swordfish/lemuroid/lib/core/CoreVariable;", "getGame", "()Lcom/swordfish/lemuroid/lib/library/db/entity/Game;", "getGameFiles", "()Lcom/swordfish/lemuroid/lib/storage/RomFiles;", "getQuickSaveData", "()Lcom/swordfish/lemuroid/lib/saves/SaveState;", "getSaveRAMData", "()[B", "getSavesDirectory", "()Ljava/io/File;", "getSystemDirectory", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "copy", "(Lcom/swordfish/lemuroid/lib/library/db/entity/Game;Ljava/lang/String;Lcom/swordfish/lemuroid/lib/storage/RomFiles;Lcom/swordfish/lemuroid/lib/saves/SaveState;[B[Lcom/swordfish/lemuroid/lib/core/CoreVariable;Ljava/io/File;Ljava/io/File;)Lcom/swordfish/lemuroid/lib/game/GameLoader$GameData;", "equals", "", "other", "hashCode", "", "toString", "retrograde-app-shared_debug"})
    @kotlin.Suppress(names = {"ArrayInDataClass"})
    public static final class GameData {
        @org.jetbrains.annotations.NotNull()
        private final com.swordfish.lemuroid.lib.library.db.entity.Game game = null;
        @org.jetbrains.annotations.NotNull()
        private final java.lang.String coreLibrary = null;
        @org.jetbrains.annotations.NotNull()
        private final com.swordfish.lemuroid.lib.storage.RomFiles gameFiles = null;
        @org.jetbrains.annotations.Nullable()
        private final com.swordfish.lemuroid.lib.saves.SaveState quickSaveData = null;
        @org.jetbrains.annotations.Nullable()
        private final byte[] saveRAMData = null;
        @org.jetbrains.annotations.NotNull()
        private final com.swordfish.lemuroid.lib.core.CoreVariable[] coreVariables = null;
        @org.jetbrains.annotations.NotNull()
        private final java.io.File systemDirectory = null;
        @org.jetbrains.annotations.NotNull()
        private final java.io.File savesDirectory = null;
        
        public GameData(@org.jetbrains.annotations.NotNull()
        com.swordfish.lemuroid.lib.library.db.entity.Game game, @org.jetbrains.annotations.NotNull()
        java.lang.String coreLibrary, @org.jetbrains.annotations.NotNull()
        com.swordfish.lemuroid.lib.storage.RomFiles gameFiles, @org.jetbrains.annotations.Nullable()
        com.swordfish.lemuroid.lib.saves.SaveState quickSaveData, @org.jetbrains.annotations.Nullable()
        byte[] saveRAMData, @org.jetbrains.annotations.NotNull()
        com.swordfish.lemuroid.lib.core.CoreVariable[] coreVariables, @org.jetbrains.annotations.NotNull()
        java.io.File systemDirectory, @org.jetbrains.annotations.NotNull()
        java.io.File savesDirectory) {
            super();
        }
        
        @org.jetbrains.annotations.NotNull()
        public final com.swordfish.lemuroid.lib.library.db.entity.Game getGame() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String getCoreLibrary() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final com.swordfish.lemuroid.lib.storage.RomFiles getGameFiles() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable()
        public final com.swordfish.lemuroid.lib.saves.SaveState getQuickSaveData() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable()
        public final byte[] getSaveRAMData() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final com.swordfish.lemuroid.lib.core.CoreVariable[] getCoreVariables() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.io.File getSystemDirectory() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.io.File getSavesDirectory() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final com.swordfish.lemuroid.lib.library.db.entity.Game component1() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String component2() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final com.swordfish.lemuroid.lib.storage.RomFiles component3() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable()
        public final com.swordfish.lemuroid.lib.saves.SaveState component4() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable()
        public final byte[] component5() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final com.swordfish.lemuroid.lib.core.CoreVariable[] component6() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.io.File component7() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.io.File component8() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final com.swordfish.lemuroid.lib.game.GameLoader.GameData copy(@org.jetbrains.annotations.NotNull()
        com.swordfish.lemuroid.lib.library.db.entity.Game game, @org.jetbrains.annotations.NotNull()
        java.lang.String coreLibrary, @org.jetbrains.annotations.NotNull()
        com.swordfish.lemuroid.lib.storage.RomFiles gameFiles, @org.jetbrains.annotations.Nullable()
        com.swordfish.lemuroid.lib.saves.SaveState quickSaveData, @org.jetbrains.annotations.Nullable()
        byte[] saveRAMData, @org.jetbrains.annotations.NotNull()
        com.swordfish.lemuroid.lib.core.CoreVariable[] coreVariables, @org.jetbrains.annotations.NotNull()
        java.io.File systemDirectory, @org.jetbrains.annotations.NotNull()
        java.io.File savesDirectory) {
            return null;
        }
        
        @java.lang.Override()
        public boolean equals(@org.jetbrains.annotations.Nullable()
        java.lang.Object other) {
            return false;
        }
        
        @java.lang.Override()
        public int hashCode() {
            return 0;
        }
        
        @java.lang.Override()
        @org.jetbrains.annotations.NotNull()
        public java.lang.String toString() {
            return null;
        }
    }
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0003\u0003\u0004\u0005B\u0007\b\u0004\u00a2\u0006\u0002\u0010\u0002\u0082\u0001\u0003\u0006\u0007\b\u00a8\u0006\t"}, d2 = {"Lcom/swordfish/lemuroid/lib/game/GameLoader$LoadingState;", "", "()V", "LoadingCore", "LoadingGame", "Ready", "Lcom/swordfish/lemuroid/lib/game/GameLoader$LoadingState$LoadingCore;", "Lcom/swordfish/lemuroid/lib/game/GameLoader$LoadingState$LoadingGame;", "Lcom/swordfish/lemuroid/lib/game/GameLoader$LoadingState$Ready;", "retrograde-app-shared_debug"})
    public static abstract class LoadingState {
        
        private LoadingState() {
            super();
        }
        
        @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002\u00a8\u0006\u0003"}, d2 = {"Lcom/swordfish/lemuroid/lib/game/GameLoader$LoadingState$LoadingCore;", "Lcom/swordfish/lemuroid/lib/game/GameLoader$LoadingState;", "()V", "retrograde-app-shared_debug"})
        public static final class LoadingCore extends com.swordfish.lemuroid.lib.game.GameLoader.LoadingState {
            @org.jetbrains.annotations.NotNull()
            public static final com.swordfish.lemuroid.lib.game.GameLoader.LoadingState.LoadingCore INSTANCE = null;
            
            private LoadingCore() {
            }
        }
        
        @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002\u00a8\u0006\u0003"}, d2 = {"Lcom/swordfish/lemuroid/lib/game/GameLoader$LoadingState$LoadingGame;", "Lcom/swordfish/lemuroid/lib/game/GameLoader$LoadingState;", "()V", "retrograde-app-shared_debug"})
        public static final class LoadingGame extends com.swordfish.lemuroid.lib.game.GameLoader.LoadingState {
            @org.jetbrains.annotations.NotNull()
            public static final com.swordfish.lemuroid.lib.game.GameLoader.LoadingState.LoadingGame INSTANCE = null;
            
            private LoadingGame() {
            }
        }
        
        @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006\u00a8\u0006\u0007"}, d2 = {"Lcom/swordfish/lemuroid/lib/game/GameLoader$LoadingState$Ready;", "Lcom/swordfish/lemuroid/lib/game/GameLoader$LoadingState;", "gameData", "Lcom/swordfish/lemuroid/lib/game/GameLoader$GameData;", "(Lcom/swordfish/lemuroid/lib/game/GameLoader$GameData;)V", "getGameData", "()Lcom/swordfish/lemuroid/lib/game/GameLoader$GameData;", "retrograde-app-shared_debug"})
        public static final class Ready extends com.swordfish.lemuroid.lib.game.GameLoader.LoadingState {
            @org.jetbrains.annotations.NotNull()
            private final com.swordfish.lemuroid.lib.game.GameLoader.GameData gameData = null;
            
            public Ready(@org.jetbrains.annotations.NotNull()
            com.swordfish.lemuroid.lib.game.GameLoader.GameData gameData) {
            }
            
            @org.jetbrains.annotations.NotNull()
            public final com.swordfish.lemuroid.lib.game.GameLoader.GameData getGameData() {
                return null;
            }
        }
    }
}