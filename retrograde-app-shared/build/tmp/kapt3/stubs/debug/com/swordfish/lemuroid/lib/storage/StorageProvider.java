package com.swordfish.lemuroid.lib.storage;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J&\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u00182\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u001a0\u00122\u0006\u0010\u001b\u001a\u00020\u0003H&J\u0012\u0010\u001c\u001a\u0004\u0018\u00010\u001d2\u0006\u0010\u001e\u001a\u00020\u001fH&J\u0012\u0010 \u001a\u0004\u0018\u00010!2\u0006\u0010\"\u001a\u00020#H&J\u0014\u0010$\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020#0\u00120%H&R\u0012\u0010\u0002\u001a\u00020\u0003X\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005R\u0012\u0010\u0006\u001a\u00020\u0007X\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\b\b\u0010\tR\u0012\u0010\n\u001a\u00020\u0007X\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\b\u000b\u0010\tR\u001c\u0010\f\u001a\f\u0012\u0006\b\u0001\u0012\u00020\u000e\u0018\u00010\rX\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\b\u000f\u0010\u0010R\u0018\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00070\u0012X\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\b\u0013\u0010\u0014\u00a8\u0006&"}, d2 = {"Lcom/swordfish/lemuroid/lib/storage/StorageProvider;", "", "enabledByDefault", "", "getEnabledByDefault", "()Z", "id", "", "getId", "()Ljava/lang/String;", "name", "getName", "prefsFragmentClass", "Ljava/lang/Class;", "Landroidx/leanback/preference/LeanbackPreferenceFragment;", "getPrefsFragmentClass", "()Ljava/lang/Class;", "uriSchemes", "", "getUriSchemes", "()Ljava/util/List;", "getGameRomFiles", "Lcom/swordfish/lemuroid/lib/storage/RomFiles;", "game", "Lcom/swordfish/lemuroid/lib/library/db/entity/Game;", "dataFiles", "Lcom/swordfish/lemuroid/lib/library/db/entity/DataFile;", "allowVirtualFiles", "getInputStream", "Ljava/io/InputStream;", "uri", "Landroid/net/Uri;", "getStorageFile", "Lcom/swordfish/lemuroid/lib/storage/StorageFile;", "baseStorageFile", "Lcom/swordfish/lemuroid/lib/storage/BaseStorageFile;", "listBaseStorageFiles", "Lkotlinx/coroutines/flow/Flow;", "retrograde-app-shared_debug"})
public abstract interface StorageProvider {
    
    @org.jetbrains.annotations.NotNull()
    public abstract java.lang.String getId();
    
    @org.jetbrains.annotations.NotNull()
    public abstract java.lang.String getName();
    
    @org.jetbrains.annotations.NotNull()
    public abstract java.util.List<java.lang.String> getUriSchemes();
    
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Class<? extends androidx.leanback.preference.LeanbackPreferenceFragment> getPrefsFragmentClass();
    
    public abstract boolean getEnabledByDefault();
    
    @org.jetbrains.annotations.NotNull()
    public abstract kotlinx.coroutines.flow.Flow<java.util.List<com.swordfish.lemuroid.lib.storage.BaseStorageFile>> listBaseStorageFiles();
    
    @org.jetbrains.annotations.Nullable()
    public abstract java.io.InputStream getInputStream(@org.jetbrains.annotations.NotNull()
    android.net.Uri uri);
    
    @org.jetbrains.annotations.Nullable()
    public abstract com.swordfish.lemuroid.lib.storage.StorageFile getStorageFile(@org.jetbrains.annotations.NotNull()
    com.swordfish.lemuroid.lib.storage.BaseStorageFile baseStorageFile);
    
    @org.jetbrains.annotations.NotNull()
    public abstract com.swordfish.lemuroid.lib.storage.RomFiles getGameRomFiles(@org.jetbrains.annotations.NotNull()
    com.swordfish.lemuroid.lib.library.db.entity.Game game, @org.jetbrains.annotations.NotNull()
    java.util.List<com.swordfish.lemuroid.lib.library.db.entity.DataFile> dataFiles, boolean allowVirtualFiles);
}