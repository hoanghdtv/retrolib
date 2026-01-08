package com.swordfish.lemuroid.lib.storage.local;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000x\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u0000 22\u00020\u0001:\u00012B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\u0010\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u001dH\u0002J\n\u0010\u001e\u001a\u0004\u0018\u00010\u001bH\u0002J\u0010\u0010\u001f\u001a\u00020\u001b2\u0006\u0010 \u001a\u00020!H\u0002J&\u0010\"\u001a\u00020#2\u0006\u0010 \u001a\u00020!2\f\u0010$\u001a\b\u0012\u0004\u0012\u00020\u001d0\u00172\u0006\u0010%\u001a\u00020\bH\u0016J\u0010\u0010&\u001a\u00020\'2\u0006\u0010(\u001a\u00020)H\u0016J\u0012\u0010*\u001a\u0004\u0018\u00010+2\u0006\u0010,\u001a\u00020-H\u0016J\u0014\u0010.\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020-0\u00170/H\u0016J\u001c\u00100\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020-0\u00170/2\u0006\u00101\u001a\u00020\u001bH\u0002R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\u00020\bX\u0096D\u00a2\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0014\u0010\u000b\u001a\u00020\fX\u0096D\u00a2\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0014\u0010\u000f\u001a\u00020\fX\u0096\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000eR\u001c\u0010\u0011\u001a\n\u0012\u0004\u0012\u00020\u0013\u0018\u00010\u0012X\u0096\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u001a\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\f0\u0017X\u0096\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019\u00a8\u00063"}, d2 = {"Lcom/swordfish/lemuroid/lib/storage/local/LocalStorageProvider;", "Lcom/swordfish/lemuroid/lib/storage/StorageProvider;", "context", "Landroid/content/Context;", "directoriesManager", "Lcom/swordfish/lemuroid/lib/storage/DirectoriesManager;", "(Landroid/content/Context;Lcom/swordfish/lemuroid/lib/storage/DirectoriesManager;)V", "enabledByDefault", "", "getEnabledByDefault", "()Z", "id", "", "getId", "()Ljava/lang/String;", "name", "getName", "prefsFragmentClass", "Ljava/lang/Class;", "Landroidx/leanback/preference/LeanbackPreferenceFragment;", "getPrefsFragmentClass", "()Ljava/lang/Class;", "uriSchemes", "", "getUriSchemes", "()Ljava/util/List;", "getDataFile", "Ljava/io/File;", "dataFile", "Lcom/swordfish/lemuroid/lib/library/db/entity/DataFile;", "getExternalFolder", "getGameRom", "game", "Lcom/swordfish/lemuroid/lib/library/db/entity/Game;", "getGameRomFiles", "Lcom/swordfish/lemuroid/lib/storage/RomFiles;", "dataFiles", "allowVirtualFiles", "getInputStream", "Ljava/io/InputStream;", "uri", "Landroid/net/Uri;", "getStorageFile", "Lcom/swordfish/lemuroid/lib/storage/StorageFile;", "baseStorageFile", "Lcom/swordfish/lemuroid/lib/storage/BaseStorageFile;", "listBaseStorageFiles", "Lkotlinx/coroutines/flow/Flow;", "walkDirectory", "rootDirectory", "Companion", "retrograde-app-shared_release"})
public final class LocalStorageProvider implements com.swordfish.lemuroid.lib.storage.StorageProvider {
    @org.jetbrains.annotations.NotNull()
    private final android.content.Context context = null;
    @org.jetbrains.annotations.NotNull()
    private final com.swordfish.lemuroid.lib.storage.DirectoriesManager directoriesManager = null;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String id = "local";
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String name = null;
    @org.jetbrains.annotations.NotNull()
    private final java.util.List<java.lang.String> uriSchemes = null;
    @org.jetbrains.annotations.Nullable()
    private final java.lang.Class<androidx.leanback.preference.LeanbackPreferenceFragment> prefsFragmentClass = null;
    private final boolean enabledByDefault = true;
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String LOCAL_STORAGE_CACHE_SUBFOLDER = "local-storage-games";
    @org.jetbrains.annotations.NotNull()
    public static final com.swordfish.lemuroid.lib.storage.local.LocalStorageProvider.Companion Companion = null;
    
    public LocalStorageProvider(@org.jetbrains.annotations.NotNull()
    android.content.Context context, @org.jetbrains.annotations.NotNull()
    com.swordfish.lemuroid.lib.storage.DirectoriesManager directoriesManager) {
        super();
    }
    
    @java.lang.Override()
    @org.jetbrains.annotations.NotNull()
    public java.lang.String getId() {
        return null;
    }
    
    @java.lang.Override()
    @org.jetbrains.annotations.NotNull()
    public java.lang.String getName() {
        return null;
    }
    
    @java.lang.Override()
    @org.jetbrains.annotations.NotNull()
    public java.util.List<java.lang.String> getUriSchemes() {
        return null;
    }
    
    @java.lang.Override()
    @org.jetbrains.annotations.Nullable()
    public java.lang.Class<androidx.leanback.preference.LeanbackPreferenceFragment> getPrefsFragmentClass() {
        return null;
    }
    
    @java.lang.Override()
    public boolean getEnabledByDefault() {
        return false;
    }
    
    @java.lang.Override()
    @org.jetbrains.annotations.NotNull()
    public kotlinx.coroutines.flow.Flow<java.util.List<com.swordfish.lemuroid.lib.storage.BaseStorageFile>> listBaseStorageFiles() {
        return null;
    }
    
    @java.lang.Override()
    @org.jetbrains.annotations.Nullable()
    public com.swordfish.lemuroid.lib.storage.StorageFile getStorageFile(@org.jetbrains.annotations.NotNull()
    com.swordfish.lemuroid.lib.storage.BaseStorageFile baseStorageFile) {
        return null;
    }
    
    private final java.io.File getExternalFolder() {
        return null;
    }
    
    private final kotlinx.coroutines.flow.Flow<java.util.List<com.swordfish.lemuroid.lib.storage.BaseStorageFile>> walkDirectory(java.io.File rootDirectory) {
        return null;
    }
    
    private final java.io.File getDataFile(com.swordfish.lemuroid.lib.library.db.entity.DataFile dataFile) {
        return null;
    }
    
    private final java.io.File getGameRom(com.swordfish.lemuroid.lib.library.db.entity.Game game) {
        return null;
    }
    
    @java.lang.Override()
    @org.jetbrains.annotations.NotNull()
    public com.swordfish.lemuroid.lib.storage.RomFiles getGameRomFiles(@org.jetbrains.annotations.NotNull()
    com.swordfish.lemuroid.lib.library.db.entity.Game game, @org.jetbrains.annotations.NotNull()
    java.util.List<com.swordfish.lemuroid.lib.library.db.entity.DataFile> dataFiles, boolean allowVirtualFiles) {
        return null;
    }
    
    @java.lang.Override()
    @org.jetbrains.annotations.NotNull()
    public java.io.InputStream getInputStream(@org.jetbrains.annotations.NotNull()
    android.net.Uri uri) {
        return null;
    }
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0005"}, d2 = {"Lcom/swordfish/lemuroid/lib/storage/local/LocalStorageProvider$Companion;", "", "()V", "LOCAL_STORAGE_CACHE_SUBFOLDER", "", "retrograde-app-shared_release"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
    }
}