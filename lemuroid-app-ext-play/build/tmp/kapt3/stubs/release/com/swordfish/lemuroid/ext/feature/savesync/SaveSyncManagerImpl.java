package com.swordfish.lemuroid.ext.feature.savesync;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\b\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\"\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0014\u0018\u0000 E2\u00020\u0001:\u0001EB\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\u0018\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u0015H\u0002J\u001c\u0010\u0016\u001a\u000e\u0012\u0004\u0012\u00020\u0018\u0012\u0004\u0012\u00020\u00150\u00172\u0006\u0010\u0019\u001a\u00020\u0015H\u0002J\"\u0010\u001a\u001a\u000e\u0012\u0004\u0012\u00020\u0018\u0012\u0004\u0012\u00020\u00130\u00172\f\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u00130\u001cH\u0002J\b\u0010\u001d\u001a\u00020\u0018H\u0016J\u0010\u0010\u001e\u001a\u00020\u00182\u0006\u0010\u001f\u001a\u00020 H\u0016J \u0010!\u001a\u00020\"2\u0006\u0010#\u001a\u00020$2\u0006\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u0015H\u0002J\b\u0010%\u001a\u00020\u0018H\u0016J,\u0010&\u001a\b\u0012\u0004\u0012\u00020\u00180\'2\f\u0010(\u001a\b\u0012\u0004\u0012\u00020\u00180\'2\u000e\u0010)\u001a\n\u0012\u0004\u0012\u00020\u0018\u0018\u00010\'H\u0002J\b\u0010*\u001a\u00020\u0018H\u0016J\u0010\u0010+\u001a\u00020\u00182\u0006\u0010,\u001a\u00020\u0018H\u0002J\b\u0010-\u001a\u00020\u0018H\u0016J\u001e\u0010.\u001a\b\u0012\u0004\u0012\u00020\u00130\u001c2\u0006\u0010#\u001a\u00020$2\u0006\u0010/\u001a\u00020\u0018H\u0002J\u0012\u00100\u001a\f\u0012\u0006\b\u0001\u0012\u000202\u0018\u000101H\u0016J\u0010\u00103\u001a\u00020\u00182\u0006\u00104\u001a\u00020\u0015H\u0002J4\u00105\u001a\u00020\"2\u0006\u0010#\u001a\u00020$2\u0006\u00106\u001a\u00020\u00182\u0006\u00107\u001a\u00020\u00152\b\u0010\u0012\u001a\u0004\u0018\u00010\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0015H\u0002J\b\u00108\u001a\u00020\u0011H\u0016J\b\u00109\u001a\u00020\u0011H\u0016J(\u0010:\u001a\u00020\"2\u0006\u00106\u001a\u00020\u00182\u0006\u0010\u0014\u001a\u00020\u00152\u0006\u00107\u001a\u00020\u00152\u0006\u0010#\u001a\u00020$H\u0002J \u0010;\u001a\u00020\"2\u0006\u0010\u0014\u001a\u00020\u00152\u0006\u0010#\u001a\u00020$2\u0006\u0010\u0012\u001a\u00020\u0013H\u0002J \u0010<\u001a\u00020\"2\u0006\u00107\u001a\u00020\u00152\u0006\u0010\u0012\u001a\u00020\u00132\u0006\u0010#\u001a\u00020$H\u0002J \u0010=\u001a\u00020\"2\u0006\u0010#\u001a\u00020$2\u0006\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u0015H\u0002J\u0016\u0010>\u001a\u00020\"2\f\u0010?\u001a\b\u0012\u0004\u0012\u00020 0\'H\u0002J\u001c\u0010@\u001a\u00020\"2\f\u0010?\u001a\b\u0012\u0004\u0012\u00020 0\'H\u0096@\u00a2\u0006\u0002\u0010AJ0\u0010B\u001a\u00020\"2\u0006\u0010#\u001a\u00020$2\u0006\u0010C\u001a\u00020\u00182\u0006\u0010D\u001a\u00020\u00152\u000e\u0010)\u001a\n\u0012\u0004\u0012\u00020\u0018\u0018\u00010\'H\u0002R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R+\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\b8B@BX\u0082\u008e\u0002\u00a2\u0006\u0012\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\r\u00a8\u0006F"}, d2 = {"Lcom/swordfish/lemuroid/ext/feature/savesync/SaveSyncManagerImpl;", "Lcom/swordfish/lemuroid/lib/savesync/SaveSyncManager;", "appContext", "Landroid/content/Context;", "directoriesManager", "Lcom/swordfish/lemuroid/lib/storage/DirectoriesManager;", "(Landroid/content/Context;Lcom/swordfish/lemuroid/lib/storage/DirectoriesManager;)V", "<set-?>", "", "lastSyncTimestamp", "getLastSyncTimestamp", "()J", "setLastSyncTimestamp", "(J)V", "lastSyncTimestamp$delegate", "Lcom/swordfish/lemuroid/common/kotlin/SharedPreferencesDelegates$LongDelegate;", "areFileDifferent", "", "remoteFile", "Lcom/google/api/services/drive/model/File;", "localFile", "Ljava/io/File;", "buildLocalFileMap", "", "", "folder", "buildRemoteFileMap", "remoteFiles", "Lkotlin/sequences/Sequence;", "computeSavesSpace", "computeStatesSpace", "core", "Lcom/swordfish/lemuroid/lib/library/CoreID;", "downloadToLocal", "", "drive", "Lcom/google/api/services/drive/Drive;", "getConfigInfo", "getFilteredKeys", "", "keys", "prefixes", "getLastSyncInfo", "getOrCreateAppDataFolder", "folderName", "getProvider", "getRemoteFiles", "folderId", "getSettingsActivity", "Ljava/lang/Class;", "Landroid/app/Activity;", "getSizeHumanReadable", "directory", "handleFileSync", "remoteParentFolderId", "localParentFolder", "isConfigured", "isSupported", "onLocalOnly", "onLocalUpdated", "onRemoteOnly", "onRemoteUpdated", "performSaveSyncForCores", "cores", "sync", "(Ljava/util/Set;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "syncLocalAndRemoteFolder", "remoteFolderId", "localFolder", "Companion", "lemuroid-app-ext-play_release"})
public final class SaveSyncManagerImpl extends com.swordfish.lemuroid.lib.savesync.SaveSyncManager {
    @org.jetbrains.annotations.NotNull()
    private final android.content.Context appContext = null;
    @org.jetbrains.annotations.NotNull()
    private final com.swordfish.lemuroid.lib.storage.DirectoriesManager directoriesManager = null;
    @org.jetbrains.annotations.NotNull()
    private final com.swordfish.lemuroid.common.kotlin.SharedPreferencesDelegates.LongDelegate lastSyncTimestamp$delegate = null;
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String GDRIVE_PROPERTY_LOCAL_PATH = "localPath";
    @org.jetbrains.annotations.NotNull()
    private static final java.lang.Object SYNC_LOCK = null;
    @org.jetbrains.annotations.NotNull()
    public static final com.swordfish.lemuroid.ext.feature.savesync.SaveSyncManagerImpl.Companion Companion = null;
    
    public SaveSyncManagerImpl(@org.jetbrains.annotations.NotNull()
    android.content.Context appContext, @org.jetbrains.annotations.NotNull()
    com.swordfish.lemuroid.lib.storage.DirectoriesManager directoriesManager) {
        super();
    }
    
    private final long getLastSyncTimestamp() {
        return 0L;
    }
    
    private final void setLastSyncTimestamp(long p0) {
    }
    
    @java.lang.Override()
    @org.jetbrains.annotations.NotNull()
    public java.lang.String getProvider() {
        return null;
    }
    
    @java.lang.Override()
    @org.jetbrains.annotations.Nullable()
    public java.lang.Class<? extends android.app.Activity> getSettingsActivity() {
        return null;
    }
    
    @java.lang.Override()
    public boolean isSupported() {
        return false;
    }
    
    @java.lang.Override()
    public boolean isConfigured() {
        return false;
    }
    
    @java.lang.Override()
    @org.jetbrains.annotations.NotNull()
    public java.lang.String getLastSyncInfo() {
        return null;
    }
    
    @java.lang.Override()
    @org.jetbrains.annotations.NotNull()
    public java.lang.String getConfigInfo() {
        return null;
    }
    
    @java.lang.Override()
    @org.jetbrains.annotations.Nullable()
    public java.lang.Object sync(@org.jetbrains.annotations.NotNull()
    java.util.Set<? extends com.swordfish.lemuroid.lib.library.CoreID> cores, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> $completion) {
        return null;
    }
    
    private final void performSaveSyncForCores(java.util.Set<? extends com.swordfish.lemuroid.lib.library.CoreID> cores) {
    }
    
    @java.lang.Override()
    @org.jetbrains.annotations.NotNull()
    public java.lang.String computeSavesSpace() {
        return null;
    }
    
    @java.lang.Override()
    @org.jetbrains.annotations.NotNull()
    public java.lang.String computeStatesSpace(@org.jetbrains.annotations.NotNull()
    com.swordfish.lemuroid.lib.library.CoreID core) {
        return null;
    }
    
    private final java.lang.String getSizeHumanReadable(java.io.File directory) {
        return null;
    }
    
    private final void syncLocalAndRemoteFolder(com.google.api.services.drive.Drive drive, java.lang.String remoteFolderId, java.io.File localFolder, java.util.Set<java.lang.String> prefixes) {
    }
    
    private final java.util.Set<java.lang.String> getFilteredKeys(java.util.Set<java.lang.String> keys, java.util.Set<java.lang.String> prefixes) {
        return null;
    }
    
    private final void handleFileSync(com.google.api.services.drive.Drive drive, java.lang.String remoteParentFolderId, java.io.File localParentFolder, com.google.api.services.drive.model.File remoteFile, java.io.File localFile) {
    }
    
    private final boolean areFileDifferent(com.google.api.services.drive.model.File remoteFile, java.io.File localFile) {
        return false;
    }
    
    private final void onLocalUpdated(java.io.File localFile, com.google.api.services.drive.Drive drive, com.google.api.services.drive.model.File remoteFile) {
    }
    
    private final void onLocalOnly(java.lang.String remoteParentFolderId, java.io.File localFile, java.io.File localParentFolder, com.google.api.services.drive.Drive drive) {
    }
    
    private final void onRemoteOnly(java.io.File localParentFolder, com.google.api.services.drive.model.File remoteFile, com.google.api.services.drive.Drive drive) {
    }
    
    private final void onRemoteUpdated(com.google.api.services.drive.Drive drive, com.google.api.services.drive.model.File remoteFile, java.io.File localFile) {
    }
    
    private final void downloadToLocal(com.google.api.services.drive.Drive drive, com.google.api.services.drive.model.File remoteFile, java.io.File localFile) {
    }
    
    private final java.util.Map<java.lang.String, com.google.api.services.drive.model.File> buildRemoteFileMap(kotlin.sequences.Sequence<com.google.api.services.drive.model.File> remoteFiles) {
        return null;
    }
    
    private final java.util.Map<java.lang.String, java.io.File> buildLocalFileMap(java.io.File folder) {
        return null;
    }
    
    private final java.lang.String getOrCreateAppDataFolder(java.lang.String folderName) {
        return null;
    }
    
    private final kotlin.sequences.Sequence<com.google.api.services.drive.model.File> getRemoteFiles(com.google.api.services.drive.Drive drive, java.lang.String folderId) {
        return null;
    }
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0007"}, d2 = {"Lcom/swordfish/lemuroid/ext/feature/savesync/SaveSyncManagerImpl$Companion;", "", "()V", "GDRIVE_PROPERTY_LOCAL_PATH", "", "SYNC_LOCK", "Ljava/lang/Object;", "lemuroid-app-ext-play_release"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
    }
}