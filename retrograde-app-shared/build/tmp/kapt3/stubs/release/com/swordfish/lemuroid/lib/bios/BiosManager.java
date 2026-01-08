package com.swordfish.lemuroid.lib.bios;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000b\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u0000 #2\u00020\u0001:\u0002\"#B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u000e\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\rJ\u0012\u0010\u000e\u001a\u0004\u0018\u00010\b2\u0006\u0010\u000f\u001a\u00020\u0010H\u0002J\u0012\u0010\u0011\u001a\u0004\u0018\u00010\b2\u0006\u0010\u000f\u001a\u00020\u0010H\u0002J\b\u0010\u0012\u001a\u00020\u0013H\u0007J\u000e\u0010\u0014\u001a\u00020\u0013H\u0086@\u00a2\u0006\u0002\u0010\u0015J\u001c\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00070\u00172\u0006\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u001bJ\u0010\u0010\u001c\u001a\u00020\r2\u0006\u0010\u001d\u001a\u00020\rH\u0002J\u001e\u0010\u001e\u001a\u00020\u001f2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010 \u001a\u00020!2\u0006\u0010\f\u001a\u00020\rR\u001a\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001a\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006$"}, d2 = {"Lcom/swordfish/lemuroid/lib/bios/BiosManager;", "", "directoriesManager", "Lcom/swordfish/lemuroid/lib/storage/DirectoriesManager;", "(Lcom/swordfish/lemuroid/lib/storage/DirectoriesManager;)V", "crcLookup", "", "", "Lcom/swordfish/lemuroid/lib/bios/Bios;", "nameLookup", "deleteBiosBefore", "", "timestampMs", "", "findByCRC", "storageFile", "Lcom/swordfish/lemuroid/lib/storage/StorageFile;", "findByName", "getBiosInfo", "Lcom/swordfish/lemuroid/lib/bios/BiosManager$BiosInfo;", "getBiosInfoAsync", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getMissingBiosFiles", "", "coreConfig", "Lcom/swordfish/lemuroid/lib/library/SystemCoreConfig;", "game", "Lcom/swordfish/lemuroid/lib/library/db/entity/Game;", "normalizeTimestamp", "timestamp", "tryAddBiosAfter", "", "inputStream", "Ljava/io/InputStream;", "BiosInfo", "Companion", "retrograde-app-shared_release"})
public final class BiosManager {
    @org.jetbrains.annotations.NotNull()
    private final com.swordfish.lemuroid.lib.storage.DirectoriesManager directoriesManager = null;
    @org.jetbrains.annotations.NotNull()
    private final java.util.Map<java.lang.String, com.swordfish.lemuroid.lib.bios.Bios> crcLookup = null;
    @org.jetbrains.annotations.NotNull()
    private final java.util.Map<java.lang.String, com.swordfish.lemuroid.lib.bios.Bios> nameLookup = null;
    @org.jetbrains.annotations.NotNull()
    private static final java.util.List<com.swordfish.lemuroid.lib.bios.Bios> SUPPORTED_BIOS = null;
    @org.jetbrains.annotations.NotNull()
    public static final com.swordfish.lemuroid.lib.bios.BiosManager.Companion Companion = null;
    
    public BiosManager(@org.jetbrains.annotations.NotNull()
    com.swordfish.lemuroid.lib.storage.DirectoriesManager directoriesManager) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<java.lang.String> getMissingBiosFiles(@org.jetbrains.annotations.NotNull()
    com.swordfish.lemuroid.lib.library.SystemCoreConfig coreConfig, @org.jetbrains.annotations.NotNull()
    com.swordfish.lemuroid.lib.library.db.entity.Game game) {
        return null;
    }
    
    public final void deleteBiosBefore(long timestampMs) {
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Deprecated()
    public final com.swordfish.lemuroid.lib.bios.BiosManager.BiosInfo getBiosInfo() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object getBiosInfoAsync(@org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super com.swordfish.lemuroid.lib.bios.BiosManager.BiosInfo> $completion) {
        return null;
    }
    
    public final boolean tryAddBiosAfter(@org.jetbrains.annotations.NotNull()
    com.swordfish.lemuroid.lib.storage.StorageFile storageFile, @org.jetbrains.annotations.NotNull()
    java.io.InputStream inputStream, long timestampMs) {
        return false;
    }
    
    private final com.swordfish.lemuroid.lib.bios.Bios findByCRC(com.swordfish.lemuroid.lib.storage.StorageFile storageFile) {
        return null;
    }
    
    private final com.swordfish.lemuroid.lib.bios.Bios findByName(com.swordfish.lemuroid.lib.storage.StorageFile storageFile) {
        return null;
    }
    
    private final long normalizeTimestamp(long timestamp) {
        return 0L;
    }
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B!\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u00a2\u0006\u0002\u0010\u0006J\u000f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\u00c6\u0003J\u000f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\u00c6\u0003J)\u0010\f\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u000e\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\u00c6\u0001J\u0013\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010\u0010\u001a\u00020\u0011H\u00d6\u0001J\t\u0010\u0012\u001a\u00020\u0013H\u00d6\u0001R\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0017\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\t\u0010\b\u00a8\u0006\u0014"}, d2 = {"Lcom/swordfish/lemuroid/lib/bios/BiosManager$BiosInfo;", "", "detected", "", "Lcom/swordfish/lemuroid/lib/bios/Bios;", "notDetected", "(Ljava/util/List;Ljava/util/List;)V", "getDetected", "()Ljava/util/List;", "getNotDetected", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "", "retrograde-app-shared_release"})
    public static final class BiosInfo {
        @org.jetbrains.annotations.NotNull()
        private final java.util.List<com.swordfish.lemuroid.lib.bios.Bios> detected = null;
        @org.jetbrains.annotations.NotNull()
        private final java.util.List<com.swordfish.lemuroid.lib.bios.Bios> notDetected = null;
        
        public BiosInfo(@org.jetbrains.annotations.NotNull()
        java.util.List<com.swordfish.lemuroid.lib.bios.Bios> detected, @org.jetbrains.annotations.NotNull()
        java.util.List<com.swordfish.lemuroid.lib.bios.Bios> notDetected) {
            super();
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.util.List<com.swordfish.lemuroid.lib.bios.Bios> getDetected() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.util.List<com.swordfish.lemuroid.lib.bios.Bios> getNotDetected() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.util.List<com.swordfish.lemuroid.lib.bios.Bios> component1() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.util.List<com.swordfish.lemuroid.lib.bios.Bios> component2() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final com.swordfish.lemuroid.lib.bios.BiosManager.BiosInfo copy(@org.jetbrains.annotations.NotNull()
        java.util.List<com.swordfish.lemuroid.lib.bios.Bios> detected, @org.jetbrains.annotations.NotNull()
        java.util.List<com.swordfish.lemuroid.lib.bios.Bios> notDetected) {
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
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u0014\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0006"}, d2 = {"Lcom/swordfish/lemuroid/lib/bios/BiosManager$Companion;", "", "()V", "SUPPORTED_BIOS", "", "Lcom/swordfish/lemuroid/lib/bios/Bios;", "retrograde-app-shared_release"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
    }
}