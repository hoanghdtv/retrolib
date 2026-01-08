package com.swordfish.lemuroid.lib.library;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\u0096\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\r\u0018\u0000 F2\u00020\u0001:\u0002FGB1\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\b0\u0005\u0012\u0006\u0010\t\u001a\u00020\n\u00a2\u0006\u0002\u0010\u000bJ.\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\b2\u0006\u0010\u0013\u001a\u00020\u0014H\u0082@\u00a2\u0006\u0002\u0010\u0015J\u001a\u0010\u0016\u001a\u00020\r2\u0006\u0010\u0017\u001a\u00020\u000f2\b\u0010\u0018\u001a\u0004\u0018\u00010\u0019H\u0002J\u0010\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u0013\u001a\u00020\u0014H\u0002J,\u0010\u001c\u001a\u0004\u0018\u00010\u00192\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0017\u001a\u00020\u001d2\b\u0010\u001e\u001a\u0004\u0018\u00010\u001f2\u0006\u0010 \u001a\u00020\u0014H\u0002J \u0010!\u001a\u00020\"2\u0006\u0010#\u001a\u00020$2\u0006\u0010%\u001a\u00020&2\u0006\u0010\u0013\u001a\u00020\u0014H\u0002J\u0010\u0010\'\u001a\u00020\r2\u0006\u0010\u0017\u001a\u00020\u000fH\u0002J$\u0010(\u001a\u00020)2\u0006\u0010\u0018\u001a\u00020\u00192\f\u0010*\u001a\b\u0012\u0004\u0012\u00020\"0+2\u0006\u0010,\u001a\u00020-J\u001e\u0010.\u001a\u00020\u001b2\f\u0010/\u001a\b\u0012\u0004\u0012\u0002000+2\u0006\u0010\u0013\u001a\u00020\u0014H\u0002J&\u00101\u001a\u00020\u001b2\f\u0010/\u001a\b\u0012\u0004\u0012\u00020\r0+2\u0006\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0010\u001a\u00020\u0011H\u0002J\u001e\u00102\u001a\u00020\u001b2\f\u00103\u001a\b\u0012\u0004\u0012\u0002000+2\u0006\u0010\u0013\u001a\u00020\u0014H\u0002J&\u00104\u001a\u00020\u001b2\u0006\u0010\u0010\u001a\u00020\u00112\f\u00105\u001a\b\u0012\u0004\u0012\u00020&0+2\u0006\u0010\u0013\u001a\u00020\u0014H\u0002J\u000e\u00106\u001a\u00020\u001bH\u0086@\u00a2\u0006\u0002\u00107J\u0016\u00108\u001a\u00020\u001b2\u0006\u0010\u0013\u001a\u00020\u0014H\u0082@\u00a2\u0006\u0002\u00109J&\u0010:\u001a\b\u0012\u0004\u0012\u00020\u001b0;2\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u001e\u001a\u00020\bH\u0002J:\u0010<\u001a\b\u0012\u0004\u0012\u00020\u001b0;2\f\u0010=\u001a\b\u0012\u0004\u0012\u00020\u000f0+2\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u001e\u001a\u00020\bH\u0082@\u00a2\u0006\u0002\u0010>J\u0010\u0010?\u001a\u00020\u001b2\u0006\u0010\u0013\u001a\u00020\u0014H\u0002J\u0010\u0010@\u001a\u00020\u001b2\u0006\u0010\u0013\u001a\u00020\u0014H\u0002J\u0010\u0010A\u001a\u00020\u001b2\u0006\u0010\u0013\u001a\u00020\u0014H\u0002J\u001a\u0010B\u001a\u0004\u0018\u00010\u001d2\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010%\u001a\u00020&H\u0002J\u0016\u0010C\u001a\b\u0012\u0004\u0012\u00020&0+2\u0006\u0010\u000e\u001a\u00020\u000fH\u0002J\u001e\u0010D\u001a\u00020\u001b2\f\u0010/\u001a\b\u0012\u0004\u0012\u0002000+2\u0006\u0010\u0013\u001a\u00020\u0014H\u0002J\u001e\u0010E\u001a\u00020\u001b2\f\u0010/\u001a\b\u0012\u0004\u0012\u0002000+2\u0006\u0010\u0013\u001a\u00020\u0014H\u0002R\u000e\u0010\t\u001a\u00020\nX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\b0\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006H"}, d2 = {"Lcom/swordfish/lemuroid/lib/library/LemuroidLibrary;", "", "retrogradedb", "Lcom/swordfish/lemuroid/lib/library/db/RetrogradeDatabase;", "storageProviderRegistry", "Ldagger/Lazy;", "Lcom/swordfish/lemuroid/lib/storage/StorageProviderRegistry;", "gameMetadataProvider", "Lcom/swordfish/lemuroid/lib/library/metadata/GameMetadataProvider;", "biosManager", "Lcom/swordfish/lemuroid/lib/bios/BiosManager;", "(Lcom/swordfish/lemuroid/lib/library/db/RetrogradeDatabase;Ldagger/Lazy;Ldagger/Lazy;Lcom/swordfish/lemuroid/lib/bios/BiosManager;)V", "buildEntryFromMetadata", "Lcom/swordfish/lemuroid/lib/library/LemuroidLibrary$ScanEntry;", "groupedStorageFile", "Lcom/swordfish/lemuroid/lib/storage/GroupedStorageFiles;", "provider", "Lcom/swordfish/lemuroid/lib/storage/StorageProvider;", "metadataProvider", "startedAtMs", "", "(Lcom/swordfish/lemuroid/lib/storage/GroupedStorageFiles;Lcom/swordfish/lemuroid/lib/storage/StorageProvider;Lcom/swordfish/lemuroid/lib/library/metadata/GameMetadataProvider;JLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "buildScanEntry", "storageFile", "game", "Lcom/swordfish/lemuroid/lib/library/db/entity/Game;", "cleanUp", "", "convertGameMetadataToGame", "Lcom/swordfish/lemuroid/lib/storage/StorageFile;", "gameMetadata", "Lcom/swordfish/lemuroid/lib/library/metadata/GameMetadata;", "lastIndexedAt", "convertIntoDataFile", "Lcom/swordfish/lemuroid/lib/library/db/entity/DataFile;", "gameId", "", "baseStorageFile", "Lcom/swordfish/lemuroid/lib/storage/BaseStorageFile;", "fetchEntriesFromDatabase", "getGameFiles", "Lcom/swordfish/lemuroid/lib/storage/RomFiles;", "dataFiles", "", "allowVirtualFiles", "", "handleExistingEntries", "entries", "Lcom/swordfish/lemuroid/lib/library/LemuroidLibrary$ScanEntry$GameFile;", "handleNewEntries", "handleNewGames", "pairs", "handleUnknownFiles", "files", "indexLibrary", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "indexProviders", "(JLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "indexSingleProvider", "Lkotlinx/coroutines/flow/Flow;", "processBatch", "batch", "(Ljava/util/List;Lcom/swordfish/lemuroid/lib/storage/StorageProvider;JLcom/swordfish/lemuroid/lib/library/metadata/GameMetadataProvider;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "removeDeletedBios", "removeDeletedDataFiles", "removeDeletedGames", "safeStorageFile", "sortedFilesForScanning", "updateDataFiles", "updateGames", "Companion", "ScanEntry", "retrograde-app-shared_debug"})
public final class LemuroidLibrary {
    @org.jetbrains.annotations.NotNull()
    private final com.swordfish.lemuroid.lib.library.db.RetrogradeDatabase retrogradedb = null;
    @org.jetbrains.annotations.NotNull()
    private final dagger.Lazy<com.swordfish.lemuroid.lib.storage.StorageProviderRegistry> storageProviderRegistry = null;
    @org.jetbrains.annotations.NotNull()
    private final dagger.Lazy<com.swordfish.lemuroid.lib.library.metadata.GameMetadataProvider> gameMetadataProvider = null;
    @org.jetbrains.annotations.NotNull()
    private final com.swordfish.lemuroid.lib.bios.BiosManager biosManager = null;
    public static final int MAX_BUFFER_SIZE = 200;
    public static final int MAX_TIME = 5000;
    @org.jetbrains.annotations.NotNull()
    public static final com.swordfish.lemuroid.lib.library.LemuroidLibrary.Companion Companion = null;
    
    public LemuroidLibrary(@org.jetbrains.annotations.NotNull()
    com.swordfish.lemuroid.lib.library.db.RetrogradeDatabase retrogradedb, @org.jetbrains.annotations.NotNull()
    dagger.Lazy<com.swordfish.lemuroid.lib.storage.StorageProviderRegistry> storageProviderRegistry, @org.jetbrains.annotations.NotNull()
    dagger.Lazy<com.swordfish.lemuroid.lib.library.metadata.GameMetadataProvider> gameMetadataProvider, @org.jetbrains.annotations.NotNull()
    com.swordfish.lemuroid.lib.bios.BiosManager biosManager) {
        super();
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object indexLibrary(@org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> $completion) {
        return null;
    }
    
    @kotlin.OptIn(markerClass = {kotlinx.coroutines.FlowPreview.class})
    private final java.lang.Object indexProviders(long startedAtMs, kotlin.coroutines.Continuation<? super kotlin.Unit> $completion) {
        return null;
    }
    
    @kotlin.OptIn(markerClass = {kotlinx.coroutines.FlowPreview.class})
    private final kotlinx.coroutines.flow.Flow<kotlin.Unit> indexSingleProvider(com.swordfish.lemuroid.lib.storage.StorageProvider provider, long startedAtMs, com.swordfish.lemuroid.lib.library.metadata.GameMetadataProvider gameMetadata) {
        return null;
    }
    
    private final java.lang.Object processBatch(java.util.List<com.swordfish.lemuroid.lib.storage.GroupedStorageFiles> batch, com.swordfish.lemuroid.lib.storage.StorageProvider provider, long startedAtMs, com.swordfish.lemuroid.lib.library.metadata.GameMetadataProvider gameMetadata, kotlin.coroutines.Continuation<? super kotlinx.coroutines.flow.Flow<kotlin.Unit>> $completion) {
        return null;
    }
    
    private final com.swordfish.lemuroid.lib.library.LemuroidLibrary.ScanEntry fetchEntriesFromDatabase(com.swordfish.lemuroid.lib.storage.GroupedStorageFiles storageFile) {
        return null;
    }
    
    private final com.swordfish.lemuroid.lib.library.LemuroidLibrary.ScanEntry buildScanEntry(com.swordfish.lemuroid.lib.storage.GroupedStorageFiles storageFile, com.swordfish.lemuroid.lib.library.db.entity.Game game) {
        return null;
    }
    
    private final void handleExistingEntries(java.util.List<com.swordfish.lemuroid.lib.library.LemuroidLibrary.ScanEntry.GameFile> entries, long startedAtMs) {
    }
    
    private final void updateGames(java.util.List<com.swordfish.lemuroid.lib.library.LemuroidLibrary.ScanEntry.GameFile> entries, long startedAtMs) {
    }
    
    private final void updateDataFiles(java.util.List<com.swordfish.lemuroid.lib.library.LemuroidLibrary.ScanEntry.GameFile> entries, long startedAtMs) {
    }
    
    private final com.swordfish.lemuroid.lib.library.db.entity.DataFile convertIntoDataFile(int gameId, com.swordfish.lemuroid.lib.storage.BaseStorageFile baseStorageFile, long startedAtMs) {
        return null;
    }
    
    private final void handleNewEntries(java.util.List<? extends com.swordfish.lemuroid.lib.library.LemuroidLibrary.ScanEntry> entries, long startedAtMs, com.swordfish.lemuroid.lib.storage.StorageProvider provider) {
    }
    
    private final void handleNewGames(java.util.List<com.swordfish.lemuroid.lib.library.LemuroidLibrary.ScanEntry.GameFile> pairs, long startedAtMs) {
    }
    
    private final void handleUnknownFiles(com.swordfish.lemuroid.lib.storage.StorageProvider provider, java.util.List<com.swordfish.lemuroid.lib.storage.BaseStorageFile> files, long startedAtMs) {
    }
    
    private final java.lang.Object buildEntryFromMetadata(com.swordfish.lemuroid.lib.storage.GroupedStorageFiles groupedStorageFile, com.swordfish.lemuroid.lib.storage.StorageProvider provider, com.swordfish.lemuroid.lib.library.metadata.GameMetadataProvider metadataProvider, long startedAtMs, kotlin.coroutines.Continuation<? super com.swordfish.lemuroid.lib.library.LemuroidLibrary.ScanEntry> $completion) {
        return null;
    }
    
    private final com.swordfish.lemuroid.lib.storage.StorageFile safeStorageFile(com.swordfish.lemuroid.lib.storage.StorageProvider provider, com.swordfish.lemuroid.lib.storage.BaseStorageFile baseStorageFile) {
        return null;
    }
    
    private final void cleanUp(long startedAtMs) {
    }
    
    private final void removeDeletedBios(long startedAtMs) {
    }
    
    private final java.util.List<com.swordfish.lemuroid.lib.storage.BaseStorageFile> sortedFilesForScanning(com.swordfish.lemuroid.lib.storage.GroupedStorageFiles groupedStorageFile) {
        return null;
    }
    
    private final com.swordfish.lemuroid.lib.library.db.entity.Game convertGameMetadataToGame(com.swordfish.lemuroid.lib.storage.GroupedStorageFiles groupedStorageFile, com.swordfish.lemuroid.lib.storage.StorageFile storageFile, com.swordfish.lemuroid.lib.library.metadata.GameMetadata gameMetadata, long lastIndexedAt) {
        return null;
    }
    
    private final void removeDeletedDataFiles(long startedAtMs) {
    }
    
    private final void removeDeletedGames(long startedAtMs) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.swordfish.lemuroid.lib.storage.RomFiles getGameFiles(@org.jetbrains.annotations.NotNull()
    com.swordfish.lemuroid.lib.library.db.entity.Game game, @org.jetbrains.annotations.NotNull()
    java.util.List<com.swordfish.lemuroid.lib.library.db.entity.DataFile> dataFiles, boolean allowVirtualFiles) {
        return null;
    }
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0006"}, d2 = {"Lcom/swordfish/lemuroid/lib/library/LemuroidLibrary$Companion;", "", "()V", "MAX_BUFFER_SIZE", "", "MAX_TIME", "retrograde-app-shared_debug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
    }
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b2\u0018\u00002\u00020\u0001:\u0002\u0003\u0004B\u0007\b\u0004\u00a2\u0006\u0002\u0010\u0002\u0082\u0001\u0002\u0005\u0006\u00a8\u0006\u0007"}, d2 = {"Lcom/swordfish/lemuroid/lib/library/LemuroidLibrary$ScanEntry;", "", "()V", "File", "GameFile", "Lcom/swordfish/lemuroid/lib/library/LemuroidLibrary$ScanEntry$File;", "Lcom/swordfish/lemuroid/lib/library/LemuroidLibrary$ScanEntry$GameFile;", "retrograde-app-shared_debug"})
    static abstract class ScanEntry {
        
        private ScanEntry() {
            super();
        }
        
        @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\t\u0010\u0007\u001a\u00020\u0003H\u00c6\u0003J\u0013\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003H\u00c6\u0001J\u0013\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\fH\u00d6\u0003J\t\u0010\r\u001a\u00020\u000eH\u00d6\u0001J\t\u0010\u000f\u001a\u00020\u0010H\u00d6\u0001R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006\u00a8\u0006\u0011"}, d2 = {"Lcom/swordfish/lemuroid/lib/library/LemuroidLibrary$ScanEntry$File;", "Lcom/swordfish/lemuroid/lib/library/LemuroidLibrary$ScanEntry;", "file", "Lcom/swordfish/lemuroid/lib/storage/GroupedStorageFiles;", "(Lcom/swordfish/lemuroid/lib/storage/GroupedStorageFiles;)V", "getFile", "()Lcom/swordfish/lemuroid/lib/storage/GroupedStorageFiles;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "retrograde-app-shared_debug"})
        public static final class File extends com.swordfish.lemuroid.lib.library.LemuroidLibrary.ScanEntry {
            @org.jetbrains.annotations.NotNull()
            private final com.swordfish.lemuroid.lib.storage.GroupedStorageFiles file = null;
            
            public File(@org.jetbrains.annotations.NotNull()
            com.swordfish.lemuroid.lib.storage.GroupedStorageFiles file) {
            }
            
            @org.jetbrains.annotations.NotNull()
            public final com.swordfish.lemuroid.lib.storage.GroupedStorageFiles getFile() {
                return null;
            }
            
            @org.jetbrains.annotations.NotNull()
            public final com.swordfish.lemuroid.lib.storage.GroupedStorageFiles component1() {
                return null;
            }
            
            @org.jetbrains.annotations.NotNull()
            public final com.swordfish.lemuroid.lib.library.LemuroidLibrary.ScanEntry.File copy(@org.jetbrains.annotations.NotNull()
            com.swordfish.lemuroid.lib.storage.GroupedStorageFiles file) {
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
        
        @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\t\u0010\u000b\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\f\u001a\u00020\u0005H\u00c6\u0003J\u001d\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005H\u00c6\u0001J\u0013\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011H\u00d6\u0003J\t\u0010\u0012\u001a\u00020\u0013H\u00d6\u0001J\t\u0010\u0014\u001a\u00020\u0015H\u00d6\u0001R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n\u00a8\u0006\u0016"}, d2 = {"Lcom/swordfish/lemuroid/lib/library/LemuroidLibrary$ScanEntry$GameFile;", "Lcom/swordfish/lemuroid/lib/library/LemuroidLibrary$ScanEntry;", "file", "Lcom/swordfish/lemuroid/lib/storage/GroupedStorageFiles;", "game", "Lcom/swordfish/lemuroid/lib/library/db/entity/Game;", "(Lcom/swordfish/lemuroid/lib/storage/GroupedStorageFiles;Lcom/swordfish/lemuroid/lib/library/db/entity/Game;)V", "getFile", "()Lcom/swordfish/lemuroid/lib/storage/GroupedStorageFiles;", "getGame", "()Lcom/swordfish/lemuroid/lib/library/db/entity/Game;", "component1", "component2", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "retrograde-app-shared_debug"})
        public static final class GameFile extends com.swordfish.lemuroid.lib.library.LemuroidLibrary.ScanEntry {
            @org.jetbrains.annotations.NotNull()
            private final com.swordfish.lemuroid.lib.storage.GroupedStorageFiles file = null;
            @org.jetbrains.annotations.NotNull()
            private final com.swordfish.lemuroid.lib.library.db.entity.Game game = null;
            
            public GameFile(@org.jetbrains.annotations.NotNull()
            com.swordfish.lemuroid.lib.storage.GroupedStorageFiles file, @org.jetbrains.annotations.NotNull()
            com.swordfish.lemuroid.lib.library.db.entity.Game game) {
            }
            
            @org.jetbrains.annotations.NotNull()
            public final com.swordfish.lemuroid.lib.storage.GroupedStorageFiles getFile() {
                return null;
            }
            
            @org.jetbrains.annotations.NotNull()
            public final com.swordfish.lemuroid.lib.library.db.entity.Game getGame() {
                return null;
            }
            
            @org.jetbrains.annotations.NotNull()
            public final com.swordfish.lemuroid.lib.storage.GroupedStorageFiles component1() {
                return null;
            }
            
            @org.jetbrains.annotations.NotNull()
            public final com.swordfish.lemuroid.lib.library.db.entity.Game component2() {
                return null;
            }
            
            @org.jetbrains.annotations.NotNull()
            public final com.swordfish.lemuroid.lib.library.LemuroidLibrary.ScanEntry.GameFile copy(@org.jetbrains.annotations.NotNull()
            com.swordfish.lemuroid.lib.storage.GroupedStorageFiles file, @org.jetbrains.annotations.NotNull()
            com.swordfish.lemuroid.lib.library.db.entity.Game game) {
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
    }
}