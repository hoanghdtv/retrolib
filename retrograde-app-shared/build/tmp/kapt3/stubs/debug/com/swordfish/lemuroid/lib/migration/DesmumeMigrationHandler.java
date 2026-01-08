package com.swordfish.lemuroid.lib.migration;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0012\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0007\u0018\u0000 \u001f2\u00020\u0001:\u0003\u001f !B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0010\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u0006H\u0002J\u0006\u0010\b\u001a\u00020\tJ \u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0006J \u0010\u0011\u001a\u00020\u000b2\u0006\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u0015H\u0002J\u0014\u0010\u0017\u001a\u00020\t*\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u0013H\u0002J\u0014\u0010\u001a\u001a\u00020\u001b*\u00020\u00062\u0006\u0010\u001c\u001a\u00020\u0006H\u0002J\u000e\u0010\u001d\u001a\u0004\u0018\u00010\u0006*\u00020\u0018H\u0002J\u000e\u0010\u001e\u001a\u0004\u0018\u00010\u0006*\u00020\u0018H\u0002R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\""}, d2 = {"Lcom/swordfish/lemuroid/lib/migration/DesmumeMigrationHandler;", "", "directoriesManager", "Lcom/swordfish/lemuroid/lib/storage/DirectoriesManager;", "(Lcom/swordfish/lemuroid/lib/storage/DirectoriesManager;)V", "convertDsvToRaw", "", "data", "hasPendingDesmumeSaves", "", "resolveSaveData", "Lcom/swordfish/lemuroid/lib/migration/DesmumeMigrationHandler$SaveDataResult;", "game", "Lcom/swordfish/lemuroid/lib/library/db/entity/Game;", "coreID", "Lcom/swordfish/lemuroid/lib/library/CoreID;", "defaultData", "selectRawSave", "baseFileName", "", "srmInfo", "Lcom/swordfish/lemuroid/lib/migration/DesmumeMigrationHandler$SaveCandidate;", "dsvInfo", "hasAnyFileWithExtension", "Ljava/io/File;", "extension", "indexOfSubArray", "", "pattern", "readBytesIfValid", "readBytesSafely", "Companion", "SaveCandidate", "SaveDataResult", "retrograde-app-shared_debug"})
public final class DesmumeMigrationHandler {
    @org.jetbrains.annotations.NotNull()
    private final com.swordfish.lemuroid.lib.storage.DirectoriesManager directoriesManager = null;
    @org.jetbrains.annotations.NotNull()
    private static final java.lang.String SRM_EXTENSION = "srm";
    @org.jetbrains.annotations.NotNull()
    private static final java.lang.String DSV_EXTENSION = "dsv";
    @org.jetbrains.annotations.NotNull()
    private static final byte[] DESMUME_FOOTER_PREFIX = null;
    @org.jetbrains.annotations.NotNull()
    public static final com.swordfish.lemuroid.lib.migration.DesmumeMigrationHandler.Companion Companion = null;
    
    public DesmumeMigrationHandler(@org.jetbrains.annotations.NotNull()
    com.swordfish.lemuroid.lib.storage.DirectoriesManager directoriesManager) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.swordfish.lemuroid.lib.migration.DesmumeMigrationHandler.SaveDataResult resolveSaveData(@org.jetbrains.annotations.NotNull()
    com.swordfish.lemuroid.lib.library.db.entity.Game game, @org.jetbrains.annotations.NotNull()
    com.swordfish.lemuroid.lib.library.CoreID coreID, @org.jetbrains.annotations.Nullable()
    byte[] defaultData) {
        return null;
    }
    
    public final boolean hasPendingDesmumeSaves() {
        return false;
    }
    
    private final com.swordfish.lemuroid.lib.migration.DesmumeMigrationHandler.SaveDataResult selectRawSave(java.lang.String baseFileName, com.swordfish.lemuroid.lib.migration.DesmumeMigrationHandler.SaveCandidate srmInfo, com.swordfish.lemuroid.lib.migration.DesmumeMigrationHandler.SaveCandidate dsvInfo) {
        return null;
    }
    
    private final byte[] readBytesSafely(java.io.File $this$readBytesSafely) {
        return null;
    }
    
    private final byte[] readBytesIfValid(java.io.File $this$readBytesIfValid) {
        return null;
    }
    
    private final byte[] convertDsvToRaw(byte[] data) {
        return null;
    }
    
    private final int indexOfSubArray(byte[] $this$indexOfSubArray, byte[] pattern) {
        return 0;
    }
    
    private final boolean hasAnyFileWithExtension(java.io.File $this$hasAnyFileWithExtension, java.lang.String extension) {
        return false;
    }
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0012\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0006X\u0082T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\b"}, d2 = {"Lcom/swordfish/lemuroid/lib/migration/DesmumeMigrationHandler$Companion;", "", "()V", "DESMUME_FOOTER_PREFIX", "", "DSV_EXTENSION", "", "SRM_EXTENSION", "retrograde-app-shared_debug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
    }
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0012\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\b\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0082\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u00a2\u0006\u0002\u0010\u0006J\t\u0010\u0012\u001a\u00020\u0003H\u00c6\u0003J\u000b\u0010\u0013\u001a\u0004\u0018\u00010\u0005H\u00c6\u0003J\u001f\u0010\u0014\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\u00c6\u0001J\u0013\u0010\u0015\u001a\u00020\f2\b\u0010\u0016\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010\u0017\u001a\u00020\u0018H\u00d6\u0001J\t\u0010\u0019\u001a\u00020\u001aH\u00d6\u0001R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u000b\u001a\u00020\f\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\rR\u0011\u0010\u000e\u001a\u00020\u000f\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011\u00a8\u0006\u001b"}, d2 = {"Lcom/swordfish/lemuroid/lib/migration/DesmumeMigrationHandler$SaveCandidate;", "", "file", "Ljava/io/File;", "data", "", "(Ljava/io/File;[B)V", "getData", "()[B", "getFile", "()Ljava/io/File;", "isValid", "", "()Z", "timestamp", "", "getTimestamp", "()J", "component1", "component2", "copy", "equals", "other", "hashCode", "", "toString", "", "retrograde-app-shared_debug"})
    static final class SaveCandidate {
        @org.jetbrains.annotations.NotNull()
        private final java.io.File file = null;
        @org.jetbrains.annotations.Nullable()
        private final byte[] data = null;
        private final boolean isValid = false;
        private final long timestamp = 0L;
        
        public SaveCandidate(@org.jetbrains.annotations.NotNull()
        java.io.File file, @org.jetbrains.annotations.Nullable()
        byte[] data) {
            super();
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.io.File getFile() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable()
        public final byte[] getData() {
            return null;
        }
        
        public final boolean isValid() {
            return false;
        }
        
        public final long getTimestamp() {
            return 0L;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.io.File component1() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable()
        public final byte[] component2() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final com.swordfish.lemuroid.lib.migration.DesmumeMigrationHandler.SaveCandidate copy(@org.jetbrains.annotations.NotNull()
        java.io.File file, @org.jetbrains.annotations.Nullable()
        byte[] data) {
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
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0012\n\u0000\n\u0002\u0010\t\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u0019\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u00a2\u0006\u0002\u0010\u0006J\u000b\u0010\f\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u0010\u0010\r\u001a\u0004\u0018\u00010\u0005H\u00c6\u0003\u00a2\u0006\u0002\u0010\nJ&\u0010\u000e\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\u00c6\u0001\u00a2\u0006\u0002\u0010\u000fJ\u0013\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010\u0013\u001a\u00020\u0014H\u00d6\u0001J\t\u0010\u0015\u001a\u00020\u0016H\u00d6\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0015\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u00a2\u0006\n\n\u0002\u0010\u000b\u001a\u0004\b\t\u0010\n\u00a8\u0006\u0017"}, d2 = {"Lcom/swordfish/lemuroid/lib/migration/DesmumeMigrationHandler$SaveDataResult;", "", "data", "", "timestampOverride", "", "([BLjava/lang/Long;)V", "getData", "()[B", "getTimestampOverride", "()Ljava/lang/Long;", "Ljava/lang/Long;", "component1", "component2", "copy", "([BLjava/lang/Long;)Lcom/swordfish/lemuroid/lib/migration/DesmumeMigrationHandler$SaveDataResult;", "equals", "", "other", "hashCode", "", "toString", "", "retrograde-app-shared_debug"})
    public static final class SaveDataResult {
        @org.jetbrains.annotations.Nullable()
        private final byte[] data = null;
        @org.jetbrains.annotations.Nullable()
        private final java.lang.Long timestampOverride = null;
        
        public SaveDataResult(@org.jetbrains.annotations.Nullable()
        byte[] data, @org.jetbrains.annotations.Nullable()
        java.lang.Long timestampOverride) {
            super();
        }
        
        @org.jetbrains.annotations.Nullable()
        public final byte[] getData() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.Long getTimestampOverride() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable()
        public final byte[] component1() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.Long component2() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final com.swordfish.lemuroid.lib.migration.DesmumeMigrationHandler.SaveDataResult copy(@org.jetbrains.annotations.Nullable()
        byte[] data, @org.jetbrains.annotations.Nullable()
        java.lang.Long timestampOverride) {
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